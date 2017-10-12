package org.eclipse.che.demo;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * @author Florent Benoit
 */
public class BootstrapController {

    public BootstrapController() {
        init();

    }

    /**
     * This is the entry point method.
     */
    public void init() {
      GWT.log("BootstrapController.init()");


      Panels panels = new Panels();
      panels.addInformationPanel("my GWT panel", "this is my plugin with GWT", null);

      //create buttons
      Button redButton = new Button("Dummmy");
      Button greenButton = new Button("foo");
      Button blueButton = new Button("Blue");

      // use UIObject methods to set button properties.
      redButton.setWidth("100px");
      greenButton.setWidth("100px");
      blueButton.setWidth("100px");
      greenButton.addStyleName("gwt-Green-Button");
      blueButton.addStyleName("gwt-Blue-Button");

      //add a clickListener to the button
      redButton.addClickHandler(new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
          GWT.log("click on red button");
        }
      });

      //add a clickListener to the button
      greenButton.addClickHandler(new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
          Window.alert("Green Button clicked!");
        }
      });

      //add a clickListener to the button
      blueButton.addClickHandler(new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
          Window.alert("Blue Button clicked!");
        }
      });

      // Add button to the root panel.
      VerticalPanel panel = new VerticalPanel();
      panel.getElement().getStyle().setZIndex(500);
      panel.setSpacing(10);
      panel.add(redButton);
      panel.add(greenButton);
      panel.add(blueButton);

      RootPanel rootPanel = RootPanel.get("gwt-debug-notificationManager-mainPanel");
      rootPanel.sinkEvents(Event.ONCLICK);
      panel.sinkEvents(Event.ONCLICK);
      Event.sinkEvents(panel.getElement(), Event.ONCLICK);
      Event.sinkEvents(rootPanel.getElement(), Event.ONCLICK);
      rootPanel.add(panel);
    }
}
