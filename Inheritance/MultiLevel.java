
class Animal {
    int a = 10;

    Animal() {
        System.out.println("Constructor Animal " + this.a);
    }

    void showAnimal() {
        System.out.println("Method Animal " + this.a);
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Constructor Dog " + this.a);
    }

    void showDog() {
        System.out.println("Method Dog " + this.a);
    }
}

class Cat extends Dog {
    Cat() {
        System.out.println("Constructor Cat " + this.a);
    }

    void showCat() {
        System.out.println("Method Cat " + this.a);
    }

}

public class MultiLevel {

    public static void main(String[] args) {

        Cat c = new Cat();
        c.showAnimal();
        c.showDog();
        c.showCat();

    }
}
