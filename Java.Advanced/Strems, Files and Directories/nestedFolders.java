package streamsFilesAndDirectoriees;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class nestedFolders {
    public static void main(String[] args) {

        File root = new File("C:\\Users\\GhzUser\\IdeaProjects\\Java Advanced\\Resurces\\Files-and-Streams");
        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);

        int count = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File nestedFile : nestedFiles)
                if (nestedFile.isDirectory())
                    dirs.offer(nestedFile);
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");


    }
}
