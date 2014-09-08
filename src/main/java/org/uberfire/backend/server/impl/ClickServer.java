package org.uberfire.backend.server.impl;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import org.jboss.errai.bus.server.annotations.Remote;
import org.jboss.errai.bus.server.annotations.Service;
import org.uberfire.shared.ClickEvent;
import org.uberfire.shared.IClickServer;


@ApplicationScoped
@Service
public class ClickServer implements IClickServer {

    @Inject
    private Event<ClickEvent> click;

    @Override
    public void fireClick( String user ){
        click.fire( new ClickEvent(user) );
    }

}
