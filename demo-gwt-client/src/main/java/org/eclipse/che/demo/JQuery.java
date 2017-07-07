package org.eclipse.che.demo;

/**
 * @author Florent Benoit
 */

import jsinterop.annotations.JsType;

/**
 * Wrapper for JQuery
 */
@JsType(isNative = true)
public interface JQuery {

    JQuery css(String property, String value);

}