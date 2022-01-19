import org.sql2o.Sql2o;

/*connecting the application with the database locally*/
public class DB {
//    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "softwareengineering", "1234");

    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-52-45-183-77.compute-1.amazonaws.com:5432/d8988685voolpb", "qngbbkodoxyjnl", "74ee1bf87f55b6dc628d625db39a1b51d3065344fc2ff7f1c8fc49abda250096");

}
