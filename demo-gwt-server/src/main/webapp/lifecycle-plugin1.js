define(["require", "exports"], function (require, exports) {
    "use strict";
    exports.__esModule = true;
    function load() {

        var panels = new che.Panels();
        panels.addNavigationPanel("My Navigate Panel", "<h1>Hello</h1> This is my content");


        // Register an action
        var cheActions = new che.Actions();
        var cheAction = new che.actions.SimpleAction("HelloAction", "This is my Action", function(actionEvent) {
            console.log("We clicked on the action hello and the event is", actionEvent);
        });

        cheActions.actionManager.registerAction("helloActionID", cheAction);
        console.log("action registered");

        // Add action in menu
        cheActions.addActionMenu("helpGroup", cheAction);

    }
    exports.load = load;
    function unload() {
        console.log("unloading code of plugin 1");
    }
    exports.unload = unload;
});

//# sourceMappingURL=lifecycle-plugin1.js.map