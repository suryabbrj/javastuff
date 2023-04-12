class ThreadTest {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadA.start();
        threadB.start();
        threadC.start();
    }
}

// code that generates 3 threads.
class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                sleep(1000);
                System.out.println("hello");
            }
        } catch (Exception e) {
        }
    }
}

class B extends Thread {
    public void run() {
        try {
            for (int j = 0; j < 5; j++)
                ;
            {
                sleep(2000);
                System.out.println("how are ya?");
            }
        } catch (Exception e) {
        }
    }
}

class C extends Thread {
    public void run() {
        try {
            for (int k = 0; k < 5; k++) {
                sleep(3000);
                System.out.println("doing good, eh??");
            }
        } catch (Exception e) {

        }
    }
}
