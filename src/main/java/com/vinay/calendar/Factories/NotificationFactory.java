package com.vinay.calendar.Factories;

import com.vinay.calendar.Models.*;

public class NotificationFactory extends Notification {
    public static Notification getNotification(NotificationType type) {
        if (type == null) {
            return null;
        }
        if (type == NotificationType.SMS) {
            return new SMSNotification();
        } else if (type == NotificationType.WHATSAPP) {
            return new WhatsAppNotification();
        } else if (type == NotificationType.EMAIL) {
            return new EmailNotification();
        }
        return null;
    }
}
