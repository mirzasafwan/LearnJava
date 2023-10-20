import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file1.txt");
            FileOutputStream fos = new FileOutputStream("file1.pdf");
            String s = "Safwan is a Good Boy";
            int i;
            // System.out.println("File Open");
            while ((i = fis.read()) != -1) {
                fos.write((char) i);
            }

            System.out.println("success...");
            fos.close();
        } catch (

        Exception e) {
            System.out.println(e);
        }
    }

}
