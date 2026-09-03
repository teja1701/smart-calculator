package com.meridianbank.threads;

public class NotificationDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new NotificationDispatcher("ACC001", "Payment successful"), "Notification-1");
        Thread t2 = new Thread(new NotificationDispatcher("ACC002", "Payment successful"), "Notification-2");
        Thread t3 = new Thread(new NotificationDispatcher("ACC003", "Payment successful"), "Notification-3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All notifications dispatched.");
    }
}