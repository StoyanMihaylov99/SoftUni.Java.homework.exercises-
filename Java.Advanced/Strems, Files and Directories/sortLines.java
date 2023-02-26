package streamsFilesAndDirectoriees;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sortLines {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\GhzUser\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path output = Paths.get("C:\\Users\\GhzUser\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\SortLinesOutput.txt");

        try{
            List<String> lines = Files.readAllLines(path);
            lines = lines.stream().filter(l -> !l.isBlank()).collect(Collectors.toList());
            Collections.sort(lines);
            Files.write(output,lines);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
