import java.util.Scanner;

class Detail {
    private String email;
    private String password;
    private double balance;

    Detail(String email, String password) {
        this.email = email;
        this.password = password;
        this.balance = 0.0;
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
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println(
                        "-----------************************************  Welcome to Dena Bank ************************************-----------");
                System.out.println("1. Balance Amount \n2. Debit Amount \n3. Credit Amount \n4. Exit");
                int n = sc.nextInt();

                switch (n) {

                    case 1:
                        System.out.println("Amount Balance  = " + balance);
                        break;
                    case 2:
                        System.out.println("Enter Amt to be debited");
                        double debit = sc.nextDouble();
                        if (debit > balance) {
                            System.out.println("Insufficient Balance ");
                        } else {
                            balance -= debit;
                            System.out.println(
                                    "\nAmount Debited  from your Bank = " + debit + "\nAvailable Balance = "
                                            + balance
                                            + "\n");

                        }
                        break;
                    case 3:
                        System.out.println("Enter Amt to be credited");
                        double credit = sc.nextDouble();
                        balance += credit; // Update the balance by adding the credit amount
                        System.out.println(
                                "\nAmount Credited in your Bank " + credit + "\nAvailable Balance =" + balance
                                        + "\n");
                        break;
                    case 4:
                        System.out.println("Thank You for Banking with Us!!!");
                        return; // Exit the method and stop the loop
                    default:
                        System.out.println("Invalid option. Please choose a valid option.");
                }
            }

        } else {
            System.out.println("Cannot Logged In");
        }
    }
}

class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "-----------************************************  Login ************************************-----------");
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
