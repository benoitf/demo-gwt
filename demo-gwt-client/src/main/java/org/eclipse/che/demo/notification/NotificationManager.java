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
 * The manager for notifications. Used to show notifications and change their states.
 *
 * @author Andrey Plotnikov
 * @author Vlad Zhukovskii
 */
@JsType(namespace = "che")
public interface NotificationManager  {


    /**
     * Show notification.
     *
     * @param title
     *         title
     * @return notification object
     */
    Notification notify(String title);

    /**
     * Show notification.
     *
     * @param title
     *         title
     * @param content
     *         content
     * @return notification object
     */
    Notification notifyb(String title,
                        String content);

    /**
     * Show notification.
     *
     * @param title
     *         title
     * @param listener
     *         notification event listener
     * @return notification object
     */
    Notification notify2(String title,
                        NotificationListener listener);


    /**
     * Show notification.
     *
     * @param title
     *         title
     * @param content
     *         content
     * @param listener
     *         notification event listener
     * @return notification object
     */
    Notification notify3(String title,
                        String content,
                        NotificationListener listener);


}
