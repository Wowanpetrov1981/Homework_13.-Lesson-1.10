import Homework_13.Author;
import Homework_13.Book;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        if (personService.isAdult(sarah)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        System.out.println(sarah);

        System.out.println();
        System.out.println("Задание к уроку 1.9");
        Book book = new Book("Война и мир", new Author("Толстой", "Лев"), 2018);
        Author author = new Author("Толстой", "Лев");
        System.out.println("book.getTitle() = " + book.getTitle());
        System.out.println("author.getName() = " + author.getName());
        System.out.println("author.getLastName() = " + author.getLastName());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        book.setYearOfPublication(2020);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        System.out.println();

        Book book1 = new Book("Преступление и наказание", new Author("Достоевский", "Фёдор"), 2017);
        Author author1 = new Author("Достоевский", "Фёдор");
        System.out.println("book1.getTitle() = " + book1.getTitle());
        System.out.println("author1.getName() = " + author1.getName());
        System.out.println("author1.getLastName() = " + author1.getLastName());
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());
        System.out.println();


        System.out.println("Задание к уроку 1.10");
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book.equals(book1));
    }



}