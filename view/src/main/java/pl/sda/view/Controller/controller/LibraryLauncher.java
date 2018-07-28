package pl.sda.view.Controller.controller;

import pl.sda.domain.Author;
import pl.sda.domain.Book;
import pl.sda.domain.BooksType;
import pl.sda.service.AuthorService;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class LibraryLauncher {
    public enum State {
        START,
        CREATE_BOOK,
        DELETE_BOOK,
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        State state = State.DELETE_BOOK;
        switch (state) {
            case START:{
                       }

            case CREATE_BOOK: {
                AuthorController authorController = new AuthorController();
                authorController.create();
                List<Author> authors = authorController.viewAll();
                for (int i = 0; i < authors.size(); i++) {
                    System.out.println(i + " " + authors.get(i).getName() + " " + authors.get(i).getSurname());
                }
                System.out.println("Wbierz Autora do którego chcesz dodać książkę ");
                BookController bookController = new BookController();
                int number = scanner.nextInt();
                Long authorID = authors.get(number).getId();
                //if
                // System.out.println("Nie posiadamy autora w bazie");
                //System.out.println("Chcesz dodac autora?");

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
                break;
            }
            case DELETE_BOOK: {
                System.out.println("wybierz książkę którą chcesz usunąć");
                BookController bookController=new BookController();
                bookController.viewAll().forEach(x -> System.out.println(x.getId() + " - " + x.getTitle()));
                Long index=scanner.nextLong();
                bookController.delete(index);

            }

//            System.out.println("Wybierz autora ktorego chcesz zaktualizowac");
//            int index = scanner.nextInt();
//            scanner.nextLine();
//            Author author = authors.get(index);
//            System.out.println("Imie:");
//            String name = scanner.nextLine();
//            author.setName(name.equals("") ? author.getName() : name);
//            System.out.println("Nazwisko:");
//            String surname = scanner.nextLine();
//            author.setSurname(surname.equals("") ? author.getSurname() : surname);
//            authorController.update(author);
//
//
//        }
        }
    }
}

