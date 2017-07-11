package florentbenoit.api;

import jsinterop.annotations.JsType;

/**
 * @author Florent Benoit
 */
@JsType(isNative = true, namespace = "che")
public class GWTPluginManager {

    public native void registerModule(String name, PluginModule pluginModule);

}
