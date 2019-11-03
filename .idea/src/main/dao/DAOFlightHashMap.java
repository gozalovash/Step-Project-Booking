package dao;

import java.util.HashMap;
import java.util.Map;


public class DAOFlightHashMap implements DAO<Flight>{
    private final Map<Integer, Flight> storage=new HashMap<>();

    @Override
    public void store(Flight data) {
        storage.put(data.getId(),data);
    }

    @Override
    public Flight get(int id) {
        return storage.get(id);
    }

    @Override
    public void delete(int id) {
        storage.remove(id);
    }

    @Override
    public void update(Flight data) {
        storage.put(data.getId(),data);

    }
}
