define(["require", "exports"], function (require, exports) {
    "use strict";
    exports.__esModule = true;
    function load() {
        console.log("loading code of plugin 2");
    }
    exports.load = load;
    function unload() {
        console.log("unloading code of plugin 2");
    }
    exports.unload = unload;
});
