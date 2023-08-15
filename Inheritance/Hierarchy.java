class Parent extends Object {
    int a = 1;

    Parent() {
        System.out.println("Parent  Default Constructor ");
    }

    Parent(int a) {
        this();
        System.out.println("Parent  Constructor with Argument ");

    }
}

class Child1 extends Parent {
    Child1() {
        this(20);
        System.out.println("Child 1 Default Constructor" + super.getClass());
    }

    Child1(int a) {
        super(a);
        System.out.println("Child 1 Constructor with Argument " + super.a);
    }
}

class Child2 extends Parent {
    Child2() {
        this(20);
        System.out.println("Child 2 Default Constructor" + super.getClass());
    }

    Child2(int a) {
        super(a);
        System.out.println("Child 2 Constructor with Argument " + super.a);
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        Parent c1 = new Child1();
        Parent c2 = new Child2();

    }
}
