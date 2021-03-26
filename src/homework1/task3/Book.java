package homework1.task3;

public class Book {
    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        title.setTitle("Arc de Triomphe");
        author.setAuthor("Erich Maria Remarque");
        content.setContent("war drama");

        title.show();
        author.show();
        content.show();
    }
}
