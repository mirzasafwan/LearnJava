import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("file1.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
            System.out.println("Successfully Executed");
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
