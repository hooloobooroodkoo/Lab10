package Mail;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.Scanner;


public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        // Read file
        // Inject client data
        // Return text
        return "";
    }
    public static void main(String[] args) {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current absolute path is: " + s);
    }
}
