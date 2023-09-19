import java.util.Scanner;

class Detail {
    private String email;
    private String password;

    Detail(String email, String password) {
        this.email = email;
        this.password = password;
    }

    String getEmail() {
        return email;
    }

    String getName() {
        return password;
    }

    boolean isValid(String email, String password) {
        return email.toLowerCase().equals("safwanmirza@gmail.com") && password.toLowerCase().equals("1234");
    }

    void processPerson(Detail person) {
        if (isValid(person.email, person.password)) {
            System.out.println("Successfully Logged In");
        } else {
            System.out.println("Cannot Logged In");
        }
    }
}

class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------****** Login ******-------");
        System.out.println("Enter Email");
        String email = sc.next();
        System.out.println("Enter Password");
        String password = sc.next();
        // Create Person objects
        Detail person1 = new Detail(email, password);

        // Check if person is valid before calling processPerson method
        if (person1.getEmail() != null && person1.getName() != null) {
            person1.processPerson(person1);
        }
    }
}
