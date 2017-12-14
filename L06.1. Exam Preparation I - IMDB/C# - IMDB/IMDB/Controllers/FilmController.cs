namespace IMDB.Controllers
{
    using System.Linq;
    using System.Web.Mvc;
    using Models;

    [ValidateInput(false)]
    public class FilmController : Controller
    {
        private IMDBDbContext db = new IMDBDbContext();

        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            using (db)
            {
                var films = db.Films.ToList();

                return View(films);
            }
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            return View(new Film());
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Film film)
        {
            if (ModelState.IsValid == false)
            {
                return View(film);
            }

            using (db)
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
            using (db)
            {
                var film = db.Films.Find(id);

                if (film == null)
                {
                    return HttpNotFound();
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
            if (ModelState.IsValid == false)
            {
                return View(filmModel);
            }

            using (db)
            {
                var film = db.Films.Find(id);

                if (film == null)
                {
                    return HttpNotFound();
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
            using (db)
            {
                var film = db.Films.Find(id);

                if (film == null)
                {
                    return HttpNotFound();
                }

                return View(film);
            }
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int? id)
        {
            using (db)
            {
                var filmToDelete = db.Films.Find(id);

                if (filmToDelete == null)
                {
                    return HttpNotFound();
                }

                db.Films.Remove(filmToDelete);
                db.SaveChanges();

                return Redirect("/");
            }
        }
    }
}