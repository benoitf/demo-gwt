package org.eclipse.che.demo;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		GWT.log("GWT.create(IDEInjector.class)...");

		IDEInjector injector = GWT.create(IDEInjector.class);
		GWT.log("injector.getBootstrapController()...");
		BootstrapController bootstrapController = injector.getBootstrapController();
		GWT.log("bootstrapController = "+ bootstrapController.toString());

	}
}
