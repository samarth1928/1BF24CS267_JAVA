class test extends Thread {
    public void run() {
        try {
            for(int i=0;i<5;i++){
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CollegeThread interrupted");
        }
    }
}

class demo extends Thread {
    public void run() {
        try {
            for(int i=0;i<5;i++){
                System.out.println("CSE");
                Thread.sleep(2000); // 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CSEThread interrupted");
        }
    }
}

public class threadss {
    public static void main(String[] args) {
        test t1 = new test();
        demo t2 = new demo();

        t1.start();
        t2.start();
    }
}