package org.uberfire.backend.server.impl.card;

public interface DAO<T> {

    public void save(T t);

    void update( Cartao cartao );
}
