package florentbenoit.api;

import jsinterop.annotations.JsType;

/**
 * @author Florent Benoit
 */
@JsType(isNative = true)
public interface ReadOnlyDocument {

    /**
     * Returns the number of lines in the document.
     *
     * @return the number of lines
     */
    int getLineCount();

    /**
     * Returns the contents of the editor.
     *
     * @return the contents
     */
    String getContents();

    /**
     * Returns the cursor position as an offset from the start.
     * @return the cursor position
     */
    int getCursorOffset();


}
