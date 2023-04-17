// java code to implement single inheritance...
class Animal {
    void bark() {
        System.out.println("barking..........");
    }
}

class Doggo extends Animal {
    void breath() {
        System.out.println("breathing..........");
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Doggo d = new Doggo();
        d.breath();
        d.bark();
    }
}