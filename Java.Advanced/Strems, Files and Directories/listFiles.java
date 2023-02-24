package streamsFilesAndDirectoriees;

import java.io.File;

public class listFiles {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\GhzUser\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\Files-and-Streams\\Streams-and-Files");


        if(file.exists()){
            File[] files = file.listFiles();
            for(File f: files){
                if(!f.isDirectory()){
                    System.out.println(f.getName() + ": [" + f.length() + "]");
                }
            }
        }
    }
}
