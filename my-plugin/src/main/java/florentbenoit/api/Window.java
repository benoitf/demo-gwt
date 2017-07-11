package florentbenoit.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Florent Benoit
 */
@JsType(isNative = true, namespace = "che")
public class Window {

    @JsProperty(name="editor")
    public native Editor getEditor();
}
