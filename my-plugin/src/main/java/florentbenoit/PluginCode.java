package florentbenoit;

import florentbenoit.api.*;

import com.google.inject.Inject;


/**
 * GWT Plug-In module with load and unload methods.
 * @author Florent Benoit
 */
public class PluginCode implements florentbenoit.api.PluginModule {

    private final Window window;

    @Inject
    public PluginCode(Window window, GWTPluginManager gwtPluginManager) {
        this.window = window;

        // Register our plug-In
        gwtPluginManager.registerModule("Florent GWT plugin", this);
    }

    public void load() {

        ReadOnlyDocument readonlyDocument = window.getEditor().getReadOnlyDocument();
        console("GWT Plugin: Document lineCount is " + readonlyDocument.getLineCount());
        console("GWT Plugin: Document content is " +  readonlyDocument.getContents());
        console("GWT Plugin: Document cursor offset is " +  readonlyDocument.getCursorOffset());

    }

    public void unload() {

    }



    public static native void console(String text)
/*-{
    console.log(text);
}-*/;

}
