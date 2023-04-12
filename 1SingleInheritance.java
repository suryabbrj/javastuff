class Animal {
    void bark() {
        System.out.println("barking..........");
    }
}

class Doggo extends Animal {
    void eat() {
        System.out.println("eating..........");
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Doggo d = new Doggo();
        d.eat();
        d.bark();
    }
}