package florentbenoit;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 * @author Florent Benoit
 */
public class FlorentGWTPlugin implements EntryPoint {

        /**
         * This is the entry point method.
         */
        public void onModuleLoad() {
            console("GWT.create(IDEInjector.class)...");

            PluginInjector injector = GWT.create(PluginInjector.class);
            console("MyApp.getPluginReady()...");
            injector.getPluginReady();

        }

    public static native void console(String text)
/*-{
    console.log(text);
}-*/;
    }
