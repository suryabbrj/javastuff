// java code to demonstrate threads using runnable interface
class runnabletest {
    public static void main(String[] args) {
        X run1 = new X();
        Thread threadX = new Thread(run1); // here a runnable function call is replaced with the run1 function, cause
                                           // the former did'nt seem to work as ,The variable run1 is created as an
                                           // instance of class X, which implements the Runnable interface. However, in
                                           // the next line, the Thread constructor is called with the argument
                                           // runnable, which has not been defined.
        threadX.start();
        System.out.println("\tend of main Thread ");
    }
}

class X implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t Thread X" + i);
        }
        System.out.println("\t End of Thread X");
    }
}
