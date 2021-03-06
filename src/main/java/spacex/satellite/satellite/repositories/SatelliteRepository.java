package spacex.satellite.satellite.repositories;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import spacex.satellite.satellite.models.Satellite;


@Repository("SatRepo")
public class SatelliteRepository implements ISatelliteRepository {
    private static List<Satellite> db = new ArrayList<>();

    @Override
    public boolean Add(Satellite sat) {
        if (sat != null) {
            db.add(sat);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean Delete(int id) {
        boolean found = false;
        if (!found) {
            if (db != null) {
                db.remove(0);
                found = true;
            }

        }
        if (found) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int Orbit() {
        return 5;
    }

    @Override
    public String Health() {
        double x = Math.random();
        if (x > 0.5) {
            return "Healthy";
        } else {
            return "Condemned";
        }
    }

    @Override
    public List<Satellite> GetAll() {
        return db;
    }

}