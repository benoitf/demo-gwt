package florentbenoit;

import florentbenoit.api.Window;

import com.google.gwt.inject.client.AbstractGinModule;

import javax.inject.Singleton;

/**
 * @author Florent Benoit
 */
public class PluginModule extends AbstractGinModule {
    protected void configure() {
        bind(PluginCode.class).in(Singleton.class);
        bind(Window.class).in(Singleton.class);
    }
}