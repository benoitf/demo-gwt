package org.eclipse.che.demo;

import jsinterop.annotations.JsType;

/**
 * @author Florent Benoit
 */
@JsType
public class MyBus {

    private String value;

    public MyBus(String value) {
        this.value = value;
    }

    public String getEndPoint() {
        return this.value;
    }

}
