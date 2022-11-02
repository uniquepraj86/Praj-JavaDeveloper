package filehandaling;

import java.io.*;
import java.util.Scanner;

public class BufferDemo {
    public static void main(String[] args) {

        File file = new File("text2.txt");
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            System.out.println("Enter Value");
            String str = sc.next();                          //write
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("File write SuccessesFully");
            bufferedOutputStream.close();
            fileOutputStream.close();

        } catch (IOException f) {
            System.out.println(f);
        }
        System.out.println("Hello world");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);

BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

//          for( int i=fileInputStream.read();i>=0){
//                 System.out.print((char)i );
//                i=fileInputStream.read();
//
//                }


            int i = fileInputStream.read();
            while (i >= 0) {
                System.out.print((char) i);
                i = fileInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
