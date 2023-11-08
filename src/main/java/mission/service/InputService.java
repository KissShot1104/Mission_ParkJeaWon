package mission.service;

import java.util.Scanner;

public class InputService {

    private static final Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    public static String[] parseCommand(String command) throws Exception {

        String[] parse = command.split("[?|=]");

        if (parse.length > 3) {
            throw new Exception();
        }

        return parse;
    }
}
