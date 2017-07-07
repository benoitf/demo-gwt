package org.eclipse.che.demo;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = "che")
public class CheAPI {

    private static MyBus bus;

    public static MyBus getBus() {
        return CheAPI.bus;
    }


    @JsProperty(name = "bus")
    public MyBus getPropertyBus() {
        return CheAPI.bus;
    }


    @JsIgnore
    public static void setBus(MyBus bus) {
        CheAPI.bus = bus;
    }

}