package filehandaling;

import java.io.*;
import java.util.Scanner;

public class BufferWriterDemo {
    public static void main(String[] args) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        Scanner sc = new Scanner(System.in);

        try {

            fileWriter = new FileWriter("C:\\Users\\prajk\\IdeaProjects\\Praj JavaDeveloper\\src\\filehandaling\\Sample3.txt");
            BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter);
            bufferedWriter1.write("UniquePraj ");

            fileWriter.write(" I Love My India ");

            System.out.println("file write successfully");
            bufferedWriter.close();
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
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\prajk\\IdeaProjects\\Praj JavaDeveloper\\src\\filehandaling\\Sample3.txt");
            BufferedReader bufferedReader1 = new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
