package streamsFilesAndDirectoriees;

import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class copyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("C:\\Users\\GhzUser\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        FileOutputStream out=new FileOutputStream("C:\\Users\\GhzUser\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04_output.txt");
        int oneByte= in.read();
        while (oneByte!=-1){
            if(oneByte==10 || oneByte==32){
                out.write(oneByte);
            }else {
                String digit=String.valueOf(oneByte);
                for (int i = 0; i < digit.length(); i++) {
                    out.write(digit.charAt(i));
                }

            }
            oneByte= in.read();
        }
        in.close();
        out.close();
    }
}

