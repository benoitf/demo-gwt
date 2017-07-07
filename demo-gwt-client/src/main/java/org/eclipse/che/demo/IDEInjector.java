package org.eclipse.che.demo;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

/**
 * @author Florent Benoit
 */
@GinModules(CheClientModule.class)
public interface IDEInjector extends Ginjector {
    BootstrapController getBootstrapController();
}
