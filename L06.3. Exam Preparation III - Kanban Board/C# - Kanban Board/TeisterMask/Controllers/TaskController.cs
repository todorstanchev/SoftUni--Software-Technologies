namespace TeisterMask.Controllers
{
    using System.Linq;
    using System.Web.Mvc;
    using Models;

    [ValidateInput(false)]
    public class TaskController : Controller
    {
        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            using (var database = new TeisterMaskDbContext())
            {
                var tasks = database.Tasks.ToList();

                return View(tasks);
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
        public ActionResult Create(Task task)
        {
            if (ModelState.IsValid)
            {
                using (var database = new TeisterMaskDbContext())
                {
                    database.Tasks.Add(task);
                    database.SaveChanges();

                    return Redirect("/");
                }
            }

            return View();
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int id)
        {
            using (var database = new TeisterMaskDbContext())
            {
                var task = database.Tasks.Find(id);

                if (task == null)
                {
                    return Redirect("/");
                }

                return View(task);
            }
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ActionName("Edit")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int id, Task task)
        {
            if (ModelState.IsValid == false)
            {
                return View(task);
            }

            using (var database = new TeisterMaskDbContext())
            {
                var taskFromDb = database.Tasks.Find(id);

                if (taskFromDb != null)
                {
                    taskFromDb.Title = task.Title;
                    taskFromDb.Status = task.Status;

                    database.SaveChanges();
                }
            }

            return Redirect("/");
        }
    }
}