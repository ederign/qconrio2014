package org.uberfire.backend.server.impl.card;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import org.restlet.resource.Delete;

@Decorator
public class DAODecorator implements DAO {

    @Inject @Delegate @Any DAO dao;

    @Override
    public void save( Object o ) {
       //logica do Decorator
    }

    @Override
    public void update( Cartao cartao ) {

    }
}
