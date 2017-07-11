package florentbenoit.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Florent Benoit
 */
@JsType(isNative = true)
public interface Editor {

    @JsProperty(name = "readonlyDocument")
    ReadOnlyDocument getReadOnlyDocument();

}
