package org.eclipse.che.demo.notification;

/**
 * @author Florent Benoit
 */
public class NotificationManagerImpl implements NotificationManager {


    /** {@inheritDoc} */
    @Override
    public Notification notify(String title) {
        return notify3(title, null, null);
    }

    /** {@inheritDoc} */
    @Override
    public Notification notifyb(String title,
                               String content) {
        return notify3(title, content, null);
    }

    /** {@inheritDoc} */
    @Override
    public Notification notify3(String title,
                               String content,
                               NotificationListener listener) {
        return new StatusNotification(title, content, StatusNotification.Status.SUCCESS, StatusNotification.DisplayMode.FLOAT_MODE, listener);
    }

    /** {@inheritDoc} */
    @Override
    public Notification notify2(String title,
                               NotificationListener listener) {
        return notify3(title, null, listener);
    }

}
