using System.Linq;
using System.Net;
using System.Web.Mvc;
using IMDB.Models;

namespace IMDB.Controllers
{
    [ValidateInput(false)]
    public class FilmController : Controller
    {
        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            using (var db = new IMDBDbContext())
            {
                var films = db.Films.ToList();

                return View(films);
            }
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Film film)
        {
            if (!ModelState.IsValid)
            {
                return View();
            }

            using (var db = new IMDBDbContext())
            {
                db.Films.Add(film);
                db.SaveChanges();

                return Redirect("/");
            }
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int? id)
        {
            using (var db = new IMDBDbContext())
            {
                var film = db.Films.Find(id);

                if (film == null)
                {
                    return Redirect("/");
                }

                return View(film);
            }
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ActionName("Edit")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int? id, Film filmModel)
        {
            if (!ModelState.IsValid)
            {
                return View(filmModel);
            }

            using (var db = new IMDBDbContext())
            {
                var film = db.Films.Find(id);

                if (film == null)
                {
                    return Redirect("/");
                }

                film.Name = filmModel.Name;
                film.Genre = filmModel.Genre;
                film.Director = filmModel.Director;
                film.Year = filmModel.Year;

                db.SaveChanges();

                return Redirect("/");
            }
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int? id)
        {
            using (var db = new IMDBDbContext())
            {
                var filmFromDb = db.Films.Find(id);

                if (filmFromDb == null)
                {
                    return Redirect("/");
                }

                return View(filmFromDb);
            }
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int? id, Film filmModel)
        {
            using (var db = new IMDBDbContext())
            {
                var filmToBeDeleted = db.Films.Find(id);

                if (filmToBeDeleted == null)
                {
                    return Redirect("/");
                }

                db.Films.Remove(filmToBeDeleted);
                db.SaveChanges();

                return Redirect("/");
            }
        }
    }
}