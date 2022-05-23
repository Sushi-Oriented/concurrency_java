
class add10 implements Runnable {
    private int sum;
    private int global;

    public void run() {
        try {            
            synchronized (this) {                
                for (int i = 1; i <= 10; i++) {                    
                    sum = global + 1;
                    global = sum;
                    Thread.sleep(100);
                    System.out.println(sum);
                }
                System.out.println("Global: " + global);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getSum() {
        return sum;
    }
}