package org.eclipse.che.demo;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;


/**
 *
 * @author Florent Benoit
 */
@JsType(isNative = true)
class JQueryHelper {

    @JsMethod(namespace = JsPackage.GLOBAL, name = "$")
    public static native JQuery $(String query);
}