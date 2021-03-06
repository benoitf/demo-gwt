/*******************************************************************************
 * Copyright (c) 2012-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.demo.notification;


import jsinterop.annotations.JsType;

/**
 * Status notification. May have one of three status: PROGRESS, SUCCESS and FAIL.
 *
 * @author Vlad Zhukovskiy
 */
@JsType
public class StatusNotification extends Notification {

    public enum Status {
        PROGRESS,
        SUCCESS,
        WARNING,
        FAIL
    }

    public enum DisplayMode {
        /** Notification will be float as balloon during the notification is in progress status */
        FLOAT_MODE,

        /** Notification will be emerge as balloon only when status is changed */
        EMERGE_MODE,

        /** Notification won't be emerge at all */
        NOT_EMERGE_MODE
    }

    private Status                     status;
    private DisplayMode                displayMode;
    private StatusNotificationListener statusListener;



    /**
     * Creates status notification.
     *
     * @param title
     *         notification title (required)
     * @param content
     *         notification content (optional)
     * @param status
     *         notification status (required)
     * @param displayMode
     *         mode of displaying of the notification
     * @param listener
     *         event listener that handle mouse events (optional)
     */
    public StatusNotification(String title,
                              String content,
                              Status status,
                              DisplayMode displayMode,
                              NotificationListener listener) {
        super(title, content, listener);
        this.status = status;
        this.displayMode = displayMode;
    }

    /**
     * Return the notification status.
     *
     * @return notification status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Set new status notification.
     *
     * @param status
     *         new notification status
     * @throws IllegalArgumentException
     *         if status is null
     */
    public void setStatus(Status status) {
        if (status == null) {
            throw new IllegalArgumentException("Status shouldn't be a null");
        }
        boolean isStatusChanged = this.status != status;
        this.status = status;

        if (isStatusChanged && statusListener != null) {
            statusListener.onNotificationStatusChanged(this);
        }
        setUnreadState();
    }

    /**
     * Sets display mode
     *
     * @param displayMode
     *         mode of displaying of the notification
     */
    public void setDisplayMode(DisplayMode displayMode) {
        this.displayMode = displayMode;
        setUnreadState();
    }

    /** Returns the display mode of notification */
    public DisplayMode getDisplayMode() {
        return displayMode;
    }

    /** Sets listener for being notified about changes of notification status.*/
    public void setStatusListener(StatusNotificationListener statusListener) {
        this.statusListener = statusListener;
    }
}
