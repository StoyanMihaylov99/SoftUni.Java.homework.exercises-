package streamsFilesAndDirectoriees;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\GhzUser\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
       try(FileInputStream in = new FileInputStream(path)) {
           int oneByte = in.read();
           while (oneByte >= 0){
               System.out.printf("%s ", Integer.toBinaryString(oneByte));
               oneByte = in.read();
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
