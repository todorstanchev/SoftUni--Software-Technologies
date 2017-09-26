namespace P2.TODOList.Models
{
    using System.Data.Entity;

    public class TaskDbContext : DbContext
    {
        public TaskDbContext()
            : base("name=TaskDbContext.cs")
        {
        }

        public virtual DbSet<Task> Tasks { get; set; }
    }
}