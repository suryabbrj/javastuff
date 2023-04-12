// java code to handle compile exceptions.

class TestMyEx {
    public static void main(String[] args) {
        int x = 5, y = 1000;
        try {
            float z = (float) x / (float) y;
            if (z < 0.01) {
                throw new MyEx("the number is too small, retry with a larger value!!!");
            }
        } catch (MyEx e) {
            System.out.println("caught the exception.....");
            System.out.println(e.getMessage());
        } finally {
            System.out.print("Because i'm not your hero. i'm a silent guardian, a watchful protector. A dark knight.");
        }
    }
}

class MyEx extends Exception {
    MyEx(String msg) {
        super(msg);
    }
}
