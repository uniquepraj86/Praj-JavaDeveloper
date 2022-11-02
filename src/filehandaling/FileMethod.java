package filehandaling;

import java.io.File;
import java.io.IOException;

public class FileMethod {
    public static void main(String[] args) {
        try {
            File file = new File("Sample1.txt");
            if (file.exists()) {
                System.out.println("File Already Exist");
            } else {
                file.createNewFile();
            }

            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getCanonicalFile());
            System.out.println(file.getFreeSpace());
            System.out.println(file.isDirectory());
            System.out.println(file.getTotalSpace());
            System.out.println(file.length());
            File file1 = new File("Test");
            file1.mkdir();
            File file2 =new File("Test\\abc.txt");
            file2.createNewFile();
            System.out.println(file.length());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
