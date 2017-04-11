package javaschool.app;

import asg.cliche.Command;

import java.time.LocalDateTime;

public class Reminder extends Note {
    private String time;

    public String getTime() {
        return time;
    }

    @Command
    public void setTime(String time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return super.toString() + " " + time + " " +LocalDateTime.now().plusMonths(1);
    }
}
/*
        System.out.printf("now: %s%n", LocalDateTime.now());

        System.out.printf("Apr 15, 1994 @ 11:30am: %s%n",
        LocalDateTime.of(1994, Month.APRIL, 15, 11, 30));

        System.out.printf("now (from Instant): %s%n",
        LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));

        System.out.printf("6 months from now: %s%n",
        LocalDateTime.now().plusMonths(6));

        System.out.printf("6 months ago: %s%n",
        LocalDateTime.now().minusMonths(6));
        This code produces output that will look similar to the following:

        now: 2013-07-24T17:13:59.985
        Apr 15, 1994 @ 11:30am: 1994-04-15T11:30
        now (from Instant): 2013-07-24T17:14:00.479
        6 months from now: 2014-01-24T17:14:00.480
        6 months ago: 2013-01-24T17:14:00.481
        */