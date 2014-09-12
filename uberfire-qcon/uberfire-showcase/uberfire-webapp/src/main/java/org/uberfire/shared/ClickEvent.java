package org.uberfire.shared;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class ClickEvent {

    private String user;

    public ClickEvent(){

    }

    public ClickEvent( String user ) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}
