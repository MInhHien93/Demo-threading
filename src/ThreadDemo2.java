public class ThreadDemo2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadDemo2 " + i);
        }
    }
}
