package concurrency;

public class ThreadSample {
    static int count = 0;
    static int count1 = 0;
    static synchronized void increment() {
        count++;
    }
    public static void main(String[] args) throws InterruptedException {
        long start1 = System.currentTimeMillis();
            Runnable task = () -> {
                for (int i = 0; i < 100_000_000; i++) {
                    increment();
                }
            };

            Thread a = new Thread(task);
            Thread b = new Thread(task);

            a.start();
            b.start();
            a.join();
            b.join();
        long end1 = System.currentTimeMillis();
        System.out.println(count);
        System.out.println(end1 - start1);
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 200_000_000; i++) {
            count1++;
        }
        long end2 = System.currentTimeMillis();
        System.out.println(count1);
        System.out.println(end2 - start2);
    }
}
