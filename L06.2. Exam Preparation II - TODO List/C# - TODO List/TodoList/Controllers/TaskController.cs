namespace TodoList.Controllers
{
    using System.Linq;
    using System.Web.Mvc;
    using Models;

    [ValidateInput(false)]
    public class TaskController : Controller
    {
        private TodoListDbContext database = new TodoListDbContext();

        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            using (database)
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
                using (database)
                {
                    database.Tasks.Add(task);
                    database.SaveChanges();

                    return Redirect("/");
                }
            }

            return View();
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int id)
        {
            using (database)
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
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int id)
        {
            using (database)
            {
                var task = database.Tasks.Find(id);

                if (task == null)
                {
                    return Redirect("/");
                }

                database.Tasks.Remove(task);
                database.SaveChanges();

                return Redirect("/");
            }
        }
    }
}