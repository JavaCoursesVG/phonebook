package javaschool.app;

import asg.cliche.ShellFactory;

import java.io.IOException;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws IOException {
        ShellFactory
                .createConsoleShell("hello", "This is Phone Book", new PhoneBook())
                .commandLoop();
    }
}
