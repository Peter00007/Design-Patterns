package com.patterns.behavioral.chain;


public class BugTracker {
    public static void main(String[] args) {
        Notifier report = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier email = new EmailNotifier(Priority.IMPORTANT);
        Notifier sms = new SMSNotifier(Priority.ASAP);

        report.setNextNotifier(email);
        email.setNextNotifier(sms);

        report.notifierManager("Everything is OK.", Priority.ROUTINE);
        report.notifierManager("Something is wrong.", Priority.IMPORTANT);
        report.notifierManager("We have some  problem.", Priority.ASAP);
    }
}
