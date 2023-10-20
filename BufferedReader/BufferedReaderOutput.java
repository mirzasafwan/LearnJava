import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderOutput {
    public static void main(String[] args) {
        try {
            InputStreamReader os = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(os);
            System.out.println("What is Your Name ?");
            String name = bf.readLine();
            System.out.println("Your name is " + name + " Right?");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
