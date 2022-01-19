import org.junit.rules.ExternalResource;
import org.sql2o.Sql2o;

import org.sql2o.Connection;

public class DatabaseRule extends ExternalResource {
    @Override
    public void before() {
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "softwareengineering", "1234");
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
