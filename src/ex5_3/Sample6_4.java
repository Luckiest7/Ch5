package ex5_3;

public class Sample6_4 {
    public class X {
        public static void main(String[] args) {
            Car4 car1 = new Car4("1號車");
            car1.start();

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("正在進行main()的處理工作");
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

 class Car4 extends Thread {
    private String name;

    public Car4(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("正常進行" + name + "的處理工作");

        }
    }
}
