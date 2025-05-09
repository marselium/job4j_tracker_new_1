package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1", 220);
        Book book2 = new Book("Book 2", 300);
        Book book3 = new Book("Book 3", 123);
        Book book4 = new Book("Clean code", 444);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        System.out.println();
        System.out.println("---Replacing---");
        Book bookX;
        bookX = books[0];
        books[0] = books[3];
        books[3] = bookX;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        System.out.println();
        System.out.println("---Only name \"Clean Code\"---");
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName());
            }
        }
    }
}
