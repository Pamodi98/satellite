package spacex.satellite.satellite.repositories;

import java.util.List;

import spacex.satellite.satellite.models.Satellite;

public interface ISatelliteRepository {
    boolean Add(Satellite sat);
    boolean Delete(int id);
    int Orbit();
    String Health();
    List<Satellite> GetAll();
}
