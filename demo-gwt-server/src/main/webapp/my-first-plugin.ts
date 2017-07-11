export function load() {
    console.log("loading code of plugin");


    // get document
    var cheWindow = new che.Window();
    var editor = cheWindow.editor;
    var myDoc = editor.readonlyDocument;

    console.log("Plugin1: Document lineCount is ", myDoc.getLineCount());
    console.log("Plugin1: Document content is ", myDoc.getContents());
    console.log("Plugin1: Document cursor offset is ", myDoc.getCursorOffset());


}

export function unload() {
    console.log("unloading code of plugin");
}
