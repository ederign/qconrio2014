/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.client.screens.miscfeatures;

import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import com.google.gwt.user.client.Window;
import org.jboss.errai.common.client.api.Caller;
import org.uberfire.shared.IClickServer;
import org.uberfire.client.annotations.WorkbenchPartTitle;
import org.uberfire.client.annotations.WorkbenchPartView;
import org.uberfire.client.annotations.WorkbenchScreen;
import org.uberfire.client.mvp.PlaceManager;
import org.uberfire.client.mvp.UberView;
import org.uberfire.client.workbench.events.ChangeTitleWidgetEvent;
import org.uberfire.lifecycle.OnStartup;
import org.uberfire.mvp.PlaceRequest;
import org.uberfire.security.Identity;
import org.uberfire.shared.ClickEvent;

/**
 * A stand-alone Presenter annotated to hook into the Workbench
 */
@WorkbenchScreen(identifier = "MiscellaneousFeatures")
public class MiscFeaturesPresenter {

    @Inject
    private Caller<IClickServer> clickServer;

    @Inject
    private Identity identity;

    public void fireClickEvent() {
        clickServer.call().fireClick(identity.getName());
    }

    public void sampleCDI( @Observes ClickEvent event ) {
        Window.alert( event.getUser() + "clicked" );
    }

    public interface View
            extends
            UberView<MiscFeaturesPresenter> {

    }

    private String title = "QCon Demo";

    @Inject
    public View view;

    @Inject
    private Event<ChangeTitleWidgetEvent> changeTitleWidgetEvent;

    @Inject
    private PlaceManager placeManager;

    private PlaceRequest placeRequest;

    @OnStartup
    public void onStartup( final PlaceRequest placeRequest ) {
        this.placeRequest = placeRequest;
    }

    @WorkbenchPartTitle
    public String getTitle() {
        return title;
    }

    @WorkbenchPartView
    public UberView<MiscFeaturesPresenter> getView() {
        return view;
    }

    public void setNewTitle() {
        String title = identity.getName() + " clicked";
        ChangeTitleWidgetEvent changeTitleWidgetEvent1 = new ChangeTitleWidgetEvent( placeRequest, title, null );
        changeTitleWidgetEvent.fire( changeTitleWidgetEvent1 );
    }



}