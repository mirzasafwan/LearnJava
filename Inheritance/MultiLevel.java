
class Animal {
    Animal() {
        System.out.println("Animal is parent of Dog and Cat");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog is Child of Animal");
    }
}

class Cat extends Dog {
    Cat() {
        System.out.println("Cat is Child of Animal");
    }

}

public class MultiLevel {

    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

    }
}
