// java code to implement multiple inheritance.
class TestInheritance implements Printable, Showable {
    public void print() {
        System.out.println("hello World");
    }

    public void show() {
        System.out.println("Welcome to the simulation");
    }

    public static void main(String[] args) {
        TestInheritance obj = new TestInheritance();
        obj.print();
        obj.show();
    }
}

interface Printable {
    void print();
}

interface Showable {
    void show();
}