package Exercise1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercise1Runnable exercise1Runnable = new Exercise1Runnable();
        Thread thread = new Thread(exercise1Runnable);
        thread.start();
        String command;


        Scanner scanner = new Scanner(System.in);
        do{
            command = scanner.nextLine();
            System.out.println("Echo: " + command);
        } while (!command.equalsIgnoreCase("quit"));
    }
}
