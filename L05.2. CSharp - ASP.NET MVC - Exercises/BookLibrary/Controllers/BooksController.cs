namespace BookLibrary.Controllers
{
    using Microsoft.AspNet.Identity;
    using Models;
    using System.Data.Entity;
    using System.Linq;
    using System.Web.Mvc;

    public class BooksController : Controller
    {
        // GET: Books
        public ActionResult Index()
        {
            using (var db = new ApplicationDbContext())
            {
                var books = db.Books.Include(b => b.Author).ToList();

                return View(books);
            }
        }

        // GET: Books/Details/5
        public ActionResult Details(int? id)
        {
            using (var db = new ApplicationDbContext())
            {
                var book = db.Books
                    .Include(b => b.Author)
                    .SingleOrDefault(b => b.Id == id);

                if (book == null)
                {
                    return new HttpNotFoundResult($"Cannot find book with ID {id}");
                }

                return View(book);
            }
        }

        // GET: Books/Create
        [Authorize]
        public ActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Authorize]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Book book)
        {
            using (var db = new ApplicationDbContext())
            {
                var userId = User.Identity.GetUserId();

                book.AuthorId = userId;

                db.Books.Add(book);
                db.SaveChanges();

                return RedirectToAction("Index");
            }
        }

        // GET: Books/Edit/5
        [Authorize]
        public ActionResult Edit(int id)
        {
            using (var db = new ApplicationDbContext())
            {
                var book = db.Books
                    .SingleOrDefault(b => b.Id == id);

                if (book == null)
                {
                    return new HttpNotFoundResult($"Cannot find book with ID {id}");
                }

                var userId = User.Identity.GetUserId();

                if (book.AuthorId != userId)
                {
                    return new HttpUnauthorizedResult("You can't touch this !");
                }

                return View(book);
            }
        }

        [HttpPost]
        [Authorize]
        public ActionResult Edit(int id, Book bookViewModel)
        {
            if (bookViewModel.Title == null || bookViewModel.Description == null)
            {
                return View(bookViewModel);
            }

            using (var db = new ApplicationDbContext())
            {
                var book = db.Books
                    .Include(b => b.Author)
                    .SingleOrDefault(b => b.Id == id);

                if (book == null)
                {
                    return new HttpNotFoundResult($"Cannot find book with ID {id}");
                }

                var userId = User.Identity.GetUserId();

                if (book.AuthorId != userId)
                {
                    return new HttpUnauthorizedResult("You can't touch this !");
                }

                book.Title = bookViewModel.Title;
                book.Description = bookViewModel.Description;

                db.SaveChanges();
            }

            return RedirectToAction("Details", new { id = id });
        }

        [Authorize]
        public ActionResult Delete(int id)
        {
            using (var db = new ApplicationDbContext())
            {
                var book = db.Books
                    .SingleOrDefault(b => b.Id == id);

                if (book == null)
                {
                    return new HttpNotFoundResult($"Cannot find book with ID {id}");
                }

                var userId = User.Identity.GetUserId();

                if (book.AuthorId != userId)
                {
                    return new HttpUnauthorizedResult("You can't touch this !");
                }

                return View(book);
            }
        }

        [HttpPost]
        [Authorize]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, Book bookViewModel)
        {
            using (var db = new ApplicationDbContext())
            {
                var book = db.Books.SingleOrDefault(b => b.Id == id);

                if (book == null)
                {
                    return HttpNotFound($"Book with ID {id} not found !");
                }

                var userId = User.Identity.GetUserId();

                if (book.AuthorId != userId)
                {
                    return new HttpUnauthorizedResult("You can't touch this !");
                }

                db.Books.Remove(book);
                db.SaveChanges();

                return RedirectToAction("Index");
            }
        }
    }
}