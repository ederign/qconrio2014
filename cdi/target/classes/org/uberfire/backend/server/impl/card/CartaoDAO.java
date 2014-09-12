package org.uberfire.backend.server.impl.card;

import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class CartaoDAO implements  DAO<Cartao> {

    @Inject @Novo
    Event<CartaoEvent> novo;

    @Inject @Update
    Event<CartaoEvent> update;


    @Override
    public void save( Cartao cartao ) {
        novo.fire( new CartaoEvent() );
    }

    @Override
    public void update( Cartao cartao ) {
        update.fire( new CartaoEvent() );
    }


}
