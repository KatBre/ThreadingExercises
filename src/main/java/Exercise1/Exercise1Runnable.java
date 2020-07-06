package Exercise1;

public class Exercise1Runnable implements Runnable {

    public void writing() {
        System.out.println("Juhuuuu!");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1);
            writing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
