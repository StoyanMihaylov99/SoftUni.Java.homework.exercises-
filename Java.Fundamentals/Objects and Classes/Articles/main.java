package ObjectsAndClasses.articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String articleData = scanner.nextLine();
        String[] articleParts = articleData.split(", ");

        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Articles  articles = new Articles(title,content,author);

        int n = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();



            if (command.contains("Edit")) {
                String newContent = command.split(": ")[1];
                articles.edit(newContent);
            } else if (command.contains("ChangeAuthor")) {
                String newAuthor= command.split(": ")[1];
                articles.changeAuthor(newAuthor);
            } else if (command.contains("Rename")) {
                String rename= command.split(": ")[1];
                articles.rename(rename);
            }

        }

        System.out.println(articles.toString());
    }
}
