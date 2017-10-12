define(["require", "exports"], function (require, exports) {
    "use strict";
    exports.__esModule = true;
    function load() {
        console.log("loading code of plugin 2")


        // // get document
        var cheWindow = new che.Window();
        var editor = cheWindow.editor;
        var myDoc = editor.readonlyDocument;

        console.log("Plugin2: Document lineCount is ", myDoc.getLineCount());
        console.log("Plugin2: Document content is ", myDoc.getContents());
        console.log("Plugin2: Document cursor offset is ", myDoc.getCursorOffset());
    }
    exports.load = load;
    function unload() {
        console.log("unloading code of plugin 2");
    }
    exports.unload = unload;
});
