package filehandaling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWillResources {
    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter
                ("C:\\Users\\prajk\\IdeaProjects\\Praj JavaDeveloper\\src\\filehandaling\\Sample.txt"))
        {
            fileWriter.write("India is my country");
            System.out.println("file write successfully");
        } catch (IOException e) {
            System.out.println(e);
        }
        try(FileReader fileReader = new FileReader("C:\\Users\\prajk\\IdeaProjects\\Praj JavaDeveloper\\src\\filehandaling\\Sample.txt")) {
            for(int i = fileReader.read();i>= 0;){
                System.out.print((char)i);
                i = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

