package ObjectsAndClasses.articles;

public class Articles {
    String title;
    String content;
    String author;


    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor (String newAuthor){
        this.author = newAuthor;
    }

    public void rename (String newTitle){
        this.title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String toString(){
        return String.format("%s - %s: %s",this.title,this.content,this.author);
    }


}
