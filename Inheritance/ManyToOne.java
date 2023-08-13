
class Length {
    int length(int l) {
        return l;
    }
}

class Breadth {
    int breadth(int b) {
        return b;
    }
}

class AreaOfReactangle {
    Length l1 = new Length();
    Breadth b1 = new Breadth();

    double areaOfRectangle(int length, int breadth) {
        int l = l1.length(length);
        int b = b1.breadth(breadth);
        return l * b;
    }

    double perimeterOfRectangle(int length, int breadth) {
        int l = l1.length(length);
        int b = b1.breadth(breadth);
        return 2 * (l + b);
    }
}

public class ManyToOne {
    public static void main(String[] args) {
        AreaOfReactangle a = new AreaOfReactangle();
        System.out.println(a.areaOfRectangle(10, 20));
        System.out.println(a.perimeterOfRectangle(10, 20));
    }
}
