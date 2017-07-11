package florentbenoit.api;

import jsinterop.annotations.JsType;

/**
 * @author Florent Benoit
 */
@JsType(isNative = true, namespace = "che")
public interface PluginModule {

    void load();

    void unload();
}
