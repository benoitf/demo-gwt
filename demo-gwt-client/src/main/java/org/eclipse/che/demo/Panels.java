package org.eclipse.che.demo;

import jsinterop.annotations.JsType;

@JsType(namespace = "che", isNative = true)
public class Panels {

  public native void addInformationPanel(String title, String html, String scriptContent);
}