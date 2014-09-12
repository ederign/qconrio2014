package org.uberfire.shared;

import org.jboss.errai.bus.server.annotations.Remote;

@Remote
public interface IClickServer {

    void fireClick( String user );
}
