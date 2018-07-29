package pl.sda.view.Controller.controller.print;

import pl.sda.domain.Author;
import pl.sda.domain.Book;
import pl.sda.domain.BooksType;
import pl.sda.domain.Borrower;
import pl.sda.view.Controller.controller.entry.AuthorController;
import pl.sda.view.Controller.controller.entry.BookController;
import pl.sda.view.Controller.controller.entry.BorrowerCotroller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintClass {

    public static void Menu1() {
        System.out.println("Witaj w bibliotece");
        System.out.println("Wybierz działanie 1-start, 2-wyjdz");
    }

    public static void Menu1Poz1() throws IOException {
        System.out.println("WiTAJ");
    }

    public static void Menu1Poz2() {
        System.out.println("EXIT");
    }

    public static void Menu2() {
        System.out.println("Wybirz działanie 1-Wyświetl listę książek, 2-dodanie książki, 3-uaktualnij autora, 4-uaktualnij książkę, 5-usuń książkę, 6-wypożyczenie książki, 7-oddanie książki");
    }

    public static void Menu2Poz1AD() throws IOException {
        AuthorController authorController = new AuthorController();
        authorController.create();
        List<Author> authors = authorController.viewAll();
        for (int i = 0; i < authors.size(); i++) {
            System.out.println(i + " " + authors.get(i).getName() + " " + authors.get(i).getSurname());
        }
    }

    public static void Menu2Poz2AD() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wbierz Autora do którego chcesz dodać książkę ");
        AuthorController authorController = new AuthorController();
        authorController.create();
        List<Author> authors = authorController.viewAll();
        for (int i = 0; i < authors.size(); i++) {
            System.out.println(i + " " + authors.get(i).getName() + " " + authors.get(i).getSurname());
        }
        BookController bookController = new BookController();
        int number = scanner.nextInt();
        Long authorID = authors.get(number).getId();
        Book book = new Book();
        book.setAuthorId(authorID);
        System.out.println("Wprowadź Tytuł książki");
        scanner.nextLine();
        String title = scanner.nextLine();
        book.setTitle(title);
        System.out.println("Wprwadz datę publikacji");
        String publishDate = scanner.nextLine();
        book.setDateOfPublish(publishDate);
        System.out.println("Wpisz numer ISBN ");
        Long ISBN = scanner.nextLong();
        book.setISBN(ISBN);
        System.out.println("Wpisz ilość stron");
        int numbOfPage = scanner.nextInt();
        book.setNumerOfPage(numbOfPage);
        System.out.println("Wpisz rodzaj książki");
        System.out.println(Arrays.toString(BooksType.values()));
        scanner.nextLine();
        BooksType booksType = BooksType.valueOf(scanner.nextLine().toUpperCase());
        book.setType(booksType);
        System.out.println("Dodatkowy Opis: ");
        String descirpt = scanner.nextLine();
        book.setDescription(descirpt);
        bookController.create(book);
    }

    public static void Menu2Poz3AD() throws IOException {
        Scanner scanner = new Scanner(System.in);
        AuthorController authorController = new AuthorController();
        authorController.create();
        List<Author> authors = authorController.viewAll();
        for (int i = 0; i < authors.size(); i++) {
            System.out.println(i + " " + authors.get(i).getName() + " " + authors.get(i).getSurname());
        }
        System.out.println("Wbierz Autora któego chcesz zaktulizować ");
        int index = scanner.nextInt();
        scanner.nextLine();
        Author author = authors.get(index);
        System.out.println("Imię");
        String name = scanner.nextLine();
        author.setName(name.equals("") ? author.getName() : name);
        System.out.println("Nazwisko");
        String surname = scanner.nextLine();
        author.setSurname(surname.equals("") ? author.getSurname() : surname);
        authorController.update(author);
    }

    public static void Menu2Poz4AD() throws IOException {
        Scanner scanner = new Scanner(System.in);
        BookController bookController = new BookController();
        List<Book> books = bookController.viewAll();
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + " " + books.get(i).getTitle() + " " + books.get(i).getDateOfPublish());
        }
        System.out.println("Wbierz Książkę którą chcesz zaktulizować ");
        int index = scanner.nextInt();
        scanner.nextLine();
        Book book = books.get(index);
        System.out.println("Tytuł");
        String title = scanner.nextLine();
        book.setTitle(title.equals("") ? book.getTitle() : title);
        System.out.println("data wydania");
        String dateOfPublish = scanner.nextLine();
        book.setDateOfPublish(dateOfPublish.equals("") ? book.getDateOfPublish() : dateOfPublish);
        bookController.update(book);
    }

    public static void Menu2Poz5AD() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wybierz książkę którą chcesz usunąć");
        BookController bookController = new BookController();
        bookController.viewAll().forEach(x -> System.out.println(x.getId() + " - " + x.getTitle()));
        Long index = scanner.nextLong();
        bookController.delete(index);
    }
public static void Menu2Poz6AD() throws IOException {
        Scanner scanner=new Scanner(System.in);
                BorrowerCotroller borrowerCotroller=new BorrowerCotroller();
               BookController bookController=new BookController();
//                System.out.println("Dodaj czytelnika");
//                Borrower borrower=new Borrower();
//                System.out.println("Podaj imię");
//                String name=scanner.nextLine();
//                borrower.setName(name);
//                System.out.println("Podaj nazwisko");
//                String surname=scanner.nextLine();
//                borrower.setSurname(surname);
//                System.out.println("Podaj adres");
//                String address=scanner.nextLine();
//                borrower.setAddress(address);
//                System.out.println("Podaj numer telefonu");
//                int phoneNumber=scanner.nextInt();
//                borrower.setPhoneNumber(phoneNumber);
//                System.out.println("Podaj email");
//                String email=scanner.nextLine();
//                borrower.setEmail(email);
//                borrowerCotroller.create(borrower);
                System.out.println("Wybierz czytelnika");

                borrowerCotroller.viewAll().forEach(x-> System.out.println(x.getId() + "-" +x.getSurname()+"-"+x.getName()));
                Long index=scanner.nextLong();
                System.out.println("Wybrałes" + index);
                bookController.viewAll().forEach(x-> System.out.println(x.getId()+"-"+x.getTitle()+"-"+x.getAuthorId()));
                System.out.println("wybierz pozycje do wypożyczenia");
                int number=scanner.nextInt();
                bookController.read((long) number);
}

}



//
// int index = scanner.nextInt();
//            scanner.nextLine();
//            Author author = authors.get(index);
//            System.out.println("Imie:");
//            String name = scanner.nextLine();
//            author.setName(name.equals("") ? author.getName() : name);
//            System.out.println("Nazwisko:");
//            String surname = scanner.nextLine();
//            author.setSurname(surname.equals("") ? author.getSurname() : surname);
//            authorController.update(author);



