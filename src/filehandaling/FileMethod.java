package filehandaling;

import java.io.File;
import java.io.IOException;

public class FileMethod {
    public static void main(String[] args) {
        try {
            File file = new File("Sample1.txt");
            if (file.exists()){
                System.out.println("File Already Exist");
            }else {
                file.createNewFile();
            }

            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getCanonicalFile());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
