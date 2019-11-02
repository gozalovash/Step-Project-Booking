package dao;

public interface DAO<T> {
    void store (T data);
    T get(int id);
    void delete(int id);
    void update(T data);
}
