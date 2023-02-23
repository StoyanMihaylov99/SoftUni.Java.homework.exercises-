package streamsFilesAndDirectoriees;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class extractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String inputPath = "C:\\Users\\GhzUser\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\GhzUser\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05_output";
        Scanner scanner = new Scanner(new FileInputStream(inputPath));
        PrintWriter out = new PrintWriter(new FileOutputStream(outputPath));

        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                out.println(scanner.nextInt());
            }
            scanner.next();
        }
        out.close();
    }
}
