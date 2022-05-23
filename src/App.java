
public class App {
    public static void main(String[] args) throws Exception {

        add10 pr1 = new add10();

        // Creating new thread
        Thread t1 = new Thread(pr1);
        t1.start();

        Thread t2 = new Thread(pr1);
        t2.start();        

        t1.join();
        t2.join();

        System.out.println("Sum: " + pr1.getSum());
    }
}
