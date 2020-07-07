package Exercise2;

import lombok.Setter;

public class Exercise2Runnable implements Runnable {
    private String e = "!";
    private String temporary = ". Hello World";
    @Setter
    private String input = "";


    @Override
    public void run() {
        try {
            for (int i = 1; ; i++) {
                temporary = temporary + e;
                System.out.print(i);
                System.out.println(temporary + "-" + input);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

