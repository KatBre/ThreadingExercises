package Exercise2;

import lombok.Setter;

public class Exercise2Runnable implements Runnable {
    private String e = "!";
    private String h = ". Hello World";
    private String temporary = h + e;
    @Setter
    private String input;


    public void writing() {
        for (int i = 1; ; i++) {
            temporary = temporary + e;
            System.out.print(i);
            System.out.println(temporary + "-" + input);
        }
    }


    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            writing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

