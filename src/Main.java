public class Main {
    public static void main(String[] args) {

//      Kế thừa từ lớp Thread
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

//      Triển khai interface Runnable
        ThreadDemo2 demo2 = new ThreadDemo2();
        Thread threadDemo2 = new Thread(demo2);
        threadDemo2.start();

//      Lớp nặc danh
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Anonymous " + i);
                }
            }
        };
        thread.start();
    }
}
