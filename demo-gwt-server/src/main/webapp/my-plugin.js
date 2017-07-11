console.log("Loading of the my-plugin javascript...");




var my_awesome_script = document.createElement('script');

my_awesome_script.setAttribute('src','http://localhost:9000/gwt-plugin/FlorentGWTPlugin.nocache.js');

document.head.appendChild(my_awesome_script);



require( ['http://localhost:9000/lifecycle-plugin1.js'],
    function (data) {
        console.log("hook plugin1", data);
        data.load();

    }
);





require( ['http://localhost:9000/lifecycle-plugin2.js'],
    function (data) {
        console.log("hook plugin2", data);
        data.load();

    }
);


//
// // get document
// var cheWindow = new che.Window();
// var editor = cheWindow.editor;
// var myDoc = editor.readonlyDocument;
//
// console.log("Document lineCount is ", myDoc.getLineCount());
// console.log("Document content is ", myDoc.getContents());
// console.log("Document cursor offset is ", myDoc.getCursorOffset());
//
//
//
// // Register an action
//
// var cheActions = new che.Actions();
// var cheAction = new che.actions.SimpleAction("HelloAction", "This is my Action", function(actionEvent) {
//     console.log("We clicked on the action hello and the event is", actionEvent);
// });
//
// cheActions.actionManager.registerAction("helloActionID", cheAction);
// console.log("action registered");
//
// // Add action in menu
// cheActions.addActionMenu("helpGroup", cheAction);
//
//
