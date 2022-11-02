package filehandaling;

import java.io.*;

public class ByteArrayDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream obj1 = new FileOutputStream("C:\\Users\\prajk\\IdeaProjects\\Praj JavaDeveloper\\src\\filehandaling\\Praj");
            FileOutputStream obj2 = new FileOutputStream("C:\\Users\\prajk\\IdeaProjects\\Praj JavaDeveloper\\src\\filehandaling\\Shiv");

            ByteArrayOutputStream outputStream =new ByteArrayOutputStream();
            byte []arr =" Welcome".getBytes();
            outputStream.write(arr);
            outputStream.writeTo(obj1);
            outputStream.writeTo(obj2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream obj1 = new FileInputStream("C:\\Users\\prajk\\IdeaProjects\\Praj JavaDeveloper\\src\\filehandaling\\Praj");
            FileInputStream obj2 = new FileInputStream("C:\\Users\\prajk\\IdeaProjects\\Praj JavaDeveloper\\src\\filehandaling\\Shiv");

            SequenceInputStream sequenceInputStream = new SequenceInputStream(obj1,obj2);
            for(int i = sequenceInputStream.read();i>= 0;){
                System.out.print((char)i);
                i = sequenceInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
