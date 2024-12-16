class Book {
    private String author_name;

    Book(String name) {
        author_name = name;
    }

    void display() {
        System.out.println("Author:" + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    BookPublication(String title) {
        super("");
        this.title = title;
    }

    void display() {
        System.out.println("Book Title:" + title);
    }
}

class PaperPublication extends Book {
    private String title;

    PaperPublication(String title) {
        super("");
        this.title = title;
    }

    void display() {
        System.out.println("Paper Title:" + title);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1;
        if (args[1].equalsIgnoreCase("book")) {
            b1 = new BookPublication(args[2]);
        } else if (args[1].equalsIgnoreCase("paper")) {
            b1 = new PaperPublication(args[2]);
        } else {
            b1 = new Book(args[0]);
        }
        b1.display();
    }
}
