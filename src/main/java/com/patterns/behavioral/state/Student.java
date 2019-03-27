package com.patterns.behavioral.state;


public class Student {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Eating());
        } else if (activity instanceof Eating) {
            setActivity(new Studying());
        } else if (activity instanceof Studying) {
            setActivity(new Training());
        } else if (activity instanceof Training) {
            setActivity(new Sleeping());
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
