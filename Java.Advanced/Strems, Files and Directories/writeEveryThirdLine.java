package streamsFilesAndDirectoriees;

import java.io.*;

public class writeEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String inputPath = "C:\\Users\\GhzUser\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "C:\\Users\\GhzUser\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05_write";

        FileInputStream in  = new FileInputStream(inputPath);

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        PrintWriter write = new PrintWriter("C:\\Users\\GhzUser\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06_everyThirdLine");
        String line = reader.readLine();
        int count = 1;
        while(line != null){
            line = reader.readLine();
            count++;
            if(count% 3 == 0){
                write.println(line);
            }
        }
        write.close();

    }
}
