
class Allval {

    String dogname = "rajju";
    String catname = "billi";

}

class Animal {
    void parentOf() {
        System.out.println("I am your parrent");
    }

    Animal() {
        System.out.println("Animal Constructor");
        parentOf();
    }
}

class Dog extends Animal {

    Dog(Allval a) {

        System.out.println("Constructor Dog Name " + a.dogname);
        System.out.println("Method Dog Name " + iAmDog(a));
    }

    String iAmDog(Allval a) {
        return a.dogname;
    }
}

public class DynamicInheritance {
    public static void main(String[] args) {

        Allval a = new Allval();

        Dog c = new Dog(a);
    }
}
