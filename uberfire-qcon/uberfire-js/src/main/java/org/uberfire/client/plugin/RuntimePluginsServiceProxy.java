package org.uberfire.client.plugin;

import java.util.Collection;

import org.uberfire.mvp.ParameterizedCommand;

public interface RuntimePluginsServiceProxy {

    void getTemplateContent( final String contentUrl,
                             final ParameterizedCommand<String> command );

    void listFrameworksContent( final ParameterizedCommand<Collection<String>> command );

    void listPluginsContent( final ParameterizedCommand<Collection<String>> command );

}
