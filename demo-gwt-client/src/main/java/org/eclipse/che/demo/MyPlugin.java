package org.eclipse.che.demo;

import jsinterop.annotations.JsType;

@JsType(namespace = "che")
public class MyPlugin {
    public boolean bool = true;

    public MyPlugin(boolean bool) {
        this.bool = bool;
    }

    public String aPublicMethod() {
        return "Hello ";
    }

    public static String aStaticMethd() {
        return "What's the meaning of life?";
    }
}