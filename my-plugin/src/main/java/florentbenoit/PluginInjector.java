package florentbenoit;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

/**
 * @author Florent Benoit
 */
@GinModules(PluginModule.class)
public interface PluginInjector extends Ginjector {
    PluginCode getPluginReady();
}
