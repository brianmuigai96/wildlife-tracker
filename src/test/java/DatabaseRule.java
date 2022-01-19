import org.junit.rules.ExternalResource;
import org.sql2o.Sql2o;

import org.sql2o.Connection;

public class DatabaseRule extends ExternalResource {
    @Override
    public void before() {
//        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "softwareengineering", "1234");
        DB.sql2o  = new Sql2o("jdbc:postgresql://ec2-52-45-183-77.compute-1.amazonaws.com:5432/d8988685voolpb", "qngbbkodoxyjnl", "74ee1bf87f55b6dc628d625db39a1b51d3065344fc2ff7f1c8fc49abda250096");

    }

    @Override
    public void after() {
        String deleteAnimalsQuery = "DELETE FROM animals *";
        String deleteSightingsQuery = "DELETE FROM sightings *";
        try (Connection con = DB.sql2o.open()) {
            con.createQuery(deleteAnimalsQuery)
                    .executeUpdate();
            con.createQuery(deleteSightingsQuery)
                    .executeUpdate();
        }
    }

}
