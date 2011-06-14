package ruffkat.hombucha.store;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class Repository<T> {
    private final Class<T> type;

    @PersistenceContext(name = "hombucha")
    protected EntityManager entityManager;

    protected Repository(Class<T> type) {
        this.type = type;
    }

    public T load(Long id) {
        return entityManager.getReference(type, id);
    }

    public void delete(T t) {
        entityManager.remove(t);
    }
}