
public class Proc2 implements Runnable {
    private int sum;
    private int i;

    public void run() {
        try {
            for (i = 1; i <= 10; i++) {
                Thread.sleep(100);
                sum = sum + 1;
            }
            System.out.println("Pr2: " + sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getSum() {
        return sum;
    }
}