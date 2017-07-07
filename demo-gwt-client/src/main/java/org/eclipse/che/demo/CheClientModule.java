package org.eclipse.che.demo;

import com.google.gwt.inject.client.AbstractGinModule;

import javax.inject.Singleton;

/**
 * @author Florent Benoit
 */
public class CheClientModule extends AbstractGinModule {
    protected void configure() {
        bind(BootstrapController.class).in(Singleton.class);
    }
}