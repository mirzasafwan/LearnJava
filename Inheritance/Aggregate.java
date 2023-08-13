import java.util.Scanner;

class Sqaure {
    int sqaure(int n) {
        return n * n;
    }
}

class Area {
    Sqaure sq = new Sqaure();

    double area(int radius, double pi) {
        int sqaure = sq.sqaure(radius);
        return sqaure * pi;
    }
}

public class Aggregate {
    public static void main(String[] args) {
        Area ag = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pi Value");
        double pi = sc.nextDouble();
        System.out.println("Enter Radius Value");
        int radius = sc.nextInt();
        double result = ag.area(radius, pi);
        System.out.println("Area of square = " + result);
    }

}
