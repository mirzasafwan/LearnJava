
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedReaderInput {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file1.txt");
            BufferedInputStream bin = new BufferedInputStream(fis);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
            bin.close();

        } catch (Exception e) {

        }
    }
}
