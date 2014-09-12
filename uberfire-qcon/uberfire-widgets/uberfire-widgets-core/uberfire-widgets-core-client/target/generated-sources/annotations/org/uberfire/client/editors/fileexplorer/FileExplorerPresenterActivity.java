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

package org.uberfire.client.editors.fileexplorer;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.annotation.Generated;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import com.google.gwt.user.client.ui.InlineLabel;

import javax.annotation.PostConstruct;
import org.uberfire.client.mvp.UberView;

import javax.inject.Named;
import org.uberfire.client.mvp.AbstractWorkbenchScreenActivity;
import org.uberfire.client.mvp.PlaceManager;

import org.uberfire.workbench.model.Position;

import org.uberfire.mvp.PlaceRequest;

import com.google.gwt.user.client.ui.IsWidget;

@Dependent
@Generated("org.uberfire.annotations.processors.WorkbenchScreenProcessor")
@Named("FileExplorer")
/*
 * WARNING! This class is generated. Do not modify.
 */
public class FileExplorerPresenterActivity extends AbstractWorkbenchScreenActivity {

    private static final Collection<String> ROLES = Collections.emptyList();

    private static final Collection<String> TRAITS = Collections.emptyList();

    @Inject
    private FileExplorerPresenter realPresenter;

    @Inject
    //Constructor injection for testing
    public FileExplorerPresenterActivity(final PlaceManager placeManager) {
        super( placeManager );
    }

    @PostConstruct
    public void init() {
        ((UberView) realPresenter.getWidget()).init( realPresenter );
    }

    @Override
    public void onStartup(final PlaceRequest place) {
        super.onStartup();
        realPresenter.onStartup();
    }

    @Override
    public String getTitle() {
        return realPresenter.getTitle();
    }

    @Override
    public IsWidget getWidget() {
        return realPresenter.getWidget();
    }
    
    @Override
    public Position getDefaultPosition() {
        return realPresenter.getDefaultPosition();
    }
    
    @Override
    public Collection<String> getRoles() {
        return ROLES;
    }

    @Override
    public Collection<String> getTraits() {
        return TRAITS;
    }

    @Override
    public String getSignatureId() {
        return "org.uberfire.client.editors.fileexplorer.FileExplorerPresenterActivity";
    }
}
