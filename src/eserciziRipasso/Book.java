package eserciziRipasso;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String code;

    private static ArrayList<Book> Libreria = new ArrayList<Book>();

    public Book(String title, String author, String code) {
        this.title = title;
        this.author = author;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static void aggiungiLibro(Book book) {
        Libreria.add(book);
    }

    public static void rimuoviLibro(Book book) {
        Libreria.add(book);
    }
    public static ArrayList < Book > getLibreria() {
        return Libreria;
}
}