package org.uberfire.backend.server.impl.card;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class Observer {

    public void observerNovo(@Observes @Novo CartaoCreated cartao){
        //logica
    }

    public void observerUpdate(@Observes @Update CartaoEvent cartao){
        //logica
    }

}
