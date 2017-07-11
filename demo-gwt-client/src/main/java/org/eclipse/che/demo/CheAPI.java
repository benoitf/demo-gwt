package org.eclipse.che.demo;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import org.eclipse.che.demo.notification.NotificationManager;

@JsType(namespace = "che")
public class CheAPI {

    private static MyBus bus;


    private static NotificationManager notificationManager;

    public static MyBus getBus() {
        return CheAPI.bus;
    }

    @JsProperty(name = "notificationManager")
    public NotificationManager getNotificationManager() {
        return notificationManager;
    }

    public static void setNotificationManager(NotificationManager notificationManager) {
        CheAPI.notificationManager = notificationManager;
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