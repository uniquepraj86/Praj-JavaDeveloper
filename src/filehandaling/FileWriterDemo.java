package filehandaling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("C:\\Users\\prajk\\IdeaProjects\\Praj JavaDeveloper\\src\\filehandaling\\Sample.txt");
            fileWriter.write("I Love My India");
            System.out.println("file write successfully");

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\prajk\\IdeaProjects\\Praj JavaDeveloper\\src\\filehandaling\\Sample.txt");
        } catch (FileNotFoundException e)  {
            throw new RuntimeException(e);
        }
        finally{
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
