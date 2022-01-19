import org.sql2o.Sql2o;

/*connecting the application with the database locally*/
public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "softwareengineering", "1234");

}
