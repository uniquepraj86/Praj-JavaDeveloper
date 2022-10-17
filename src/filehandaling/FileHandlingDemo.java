package filehandaling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {

        File file = new File("text.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            String str = "Welcome";                          //write
            byte[] arr = str.getBytes();
           fileOutputStream.write(arr);
            System.out.println("File write SuccessesFully");

        } catch (IOException f) {
            System.out.println(f);
        }
        System.out.println("Hello world");
        try{
            FileInputStream fileInputStream = new FileInputStream(file);



//          for( int i=fileInputStream.read();i>=0){
//                 System.out.print((char)i );
//                i=fileInputStream.read();
//
//                }



            int i=fileInputStream.read();
           while (i>=0){
                System.out.print((char)i );
                i=fileInputStream.read();
            }

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
