public class B {
    String name;
    int id;
    A address;

    B(String name, int id, A address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    void display() {
        System.out.println(address.city + " " + address.state + " " + address.country);
        System.out.println(id + " " + name);

    }

    public static void main(String[] args) {
        A a1 = new A("India", "Mumbai", "Maharashtra");
        B b1 = new B("Safwan", 1, a1);
        b1.display();
    }
}
