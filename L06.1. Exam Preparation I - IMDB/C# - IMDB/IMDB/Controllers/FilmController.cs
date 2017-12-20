using IMDB.Models;
using System.Linq;
using System.Web.Mvc;

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
            if (this.ModelState.IsValid)
            {
                using (var db = new IMDBDbContext())
                {
                    db.Films.Add(film);
                    db.SaveChanges();
                }
            }

            return Redirect("/");
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int? id)
        {
            using (var db = new IMDBDbContext())
            {
                var film = db.Films.Find(id);

                return View(film);
            }
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int? id, Film filmModel)
        {
            using (var db = new IMDBDbContext())
            {
                var film = db.Films.Find(id);

                if (ModelState.IsValid)
                {
                    film.Name = filmModel.Name;
                    film.Genre = filmModel.Genre;
                    film.Director = filmModel.Director;
                    film.Year = filmModel.Year;

                    db.SaveChanges();

                    return Redirect("/");
                }

                return View("edit", filmModel);
            }
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int? id)
        {
            using (var db = new IMDBDbContext())
            {
                var film = db.Films.Find(id);

                return View(film);
            }
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int? id, Film filmModel)
        {
            using (var db = new IMDBDbContext())
            {
                var film = db.Films.Find(id);

                db.Films.Remove(film);
                db.SaveChanges();

                return Redirect("/");
            }
        }
    }
}