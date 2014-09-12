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

package org.uberfire.client.editors.texteditor;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.annotation.Generated;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import javax.inject.Named;
import org.uberfire.client.workbench.annotations.AssociatedResources;
import org.uberfire.client.workbench.annotations.Priority;
import org.uberfire.client.mvp.AbstractWorkbenchEditorActivity;
import org.uberfire.client.mvp.PlaceManager;

import org.uberfire.mvp.PlaceRequest;

import org.uberfire.backend.vfs.ObservablePath;

import com.google.gwt.user.client.ui.IsWidget;

@Dependent
@Generated("org.uberfire.annotations.processors.WorkbenchEditorProcessor")
@Named("TextEditor")
@AssociatedResources({
    org.uberfire.client.editors.texteditor.TextResourceType.class,
    org.uberfire.client.workbench.type.DotResourceType.class
})

@Priority(0)
/*
 * WARNING! This class is generated. Do not modify.
 */
public class TextEditorWorkbenchEditorActivity extends AbstractWorkbenchEditorActivity {

    private static final Collection<String> ROLES = Collections.emptyList();

    private static final Collection<String> TRAITS = Collections.emptyList();

    @Inject
    private TextEditorWorkbenchEditor realPresenter;

    @Inject
    //Constructor injection for testing
    public TextEditorWorkbenchEditorActivity(final PlaceManager placeManager) {
        super( placeManager );
    }

    @Override
    public void onStartup(final ObservablePath path,
                        final PlaceRequest place) {
        super.onStartup( path, place );
        realPresenter.onStartup( path, place );
    }

    @Override
    public void onClose() {
        super.onClose();
        realPresenter.onClose();
    }

    @Override
    public void onOpen() {
        super.onOpen();
        realPresenter.onOpen();
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
    public boolean isDirty() {
        return realPresenter.isDirty();
    }
    
    @Override
    public void onSave() {
        super.onSave();
        realPresenter.onSave();
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
        return "org.uberfire.client.editors.texteditor.TextEditorWorkbenchEditorActivity";
    }
}
