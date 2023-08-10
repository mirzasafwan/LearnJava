class Animal {
    int a = 1;

    Animal(int a) {
        this.a = a;
        System.out.println("Constructor Animal " + this.a);
    }

    void show(int a) {
        this.a = a;
        System.out.println("Animal " + this.a);
    }

}

class Dog extends Animal {
    int b;

    Dog(int a, int b) {
        super(a);
        this.b = b;
        System.out.println(" Constructor Dog " + this.b);
    }

    void showDog(int b) {
        a = b;
        System.out.println("Dog " + a);
        System.out.print("Hello, World.");
    }
}

class SingleLevel {
    public static void main(String[] args) {
        Dog d = new Dog(10, 20);
        d.show(10);
        d.showDog(20);
    }

}
