import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {

            FileOutputStream fos = new FileOutputStream("file1.pdf");
            String s = "Safwan is a Good Boy";
            int i;
            // System.out.println("File Open");
            for (int j = 0; j < s.length(); j++) {
                fos.write(s.charAt(j));

            }

            System.out.println("success...");
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
