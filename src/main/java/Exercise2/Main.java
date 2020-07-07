package Exercise2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Exercise2Runnable exercise2Runnable = new Exercise2Runnable();
        Thread thread = new Thread(exercise2Runnable);
        thread.start();

        Scanner scanner = new Scanner(System.in);

        String command;
        do {
            command = scanner.nextLine();
            System.out.println("Echo: " + command);
            exercise2Runnable.setInput(command);
        } while (!command.equalsIgnoreCase("quit"));
    }
}

