package pl.sda.view.Controller.controller;

import pl.sda.domain.Author;
import pl.sda.service.AuthorService;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class LibraryLauncher {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        AuthorController authorController=new AuthorController();
//        authorController.create("jan","kowal","nowawieś");
//        authorController.delete((long) 2);
        List<Author> authors = authorController.viewAll();
        for(int i=0; i<authors.size();i++){
            System.out.println(i+ " " +authors.get(i).getName()+" "+authors.get(i).getSurname());
        }
        System.out.println("Wybierz autora ktorego chcesz zaktualizowac");
        int index = scanner.nextInt();
        scanner.nextLine();
        Author author = authors.get(index);
        System.out.println("Imie:");
        String name = scanner.nextLine();
        author.setName(name.equals("") ? author.getName() : name);
        System.out.println("Nazwisko:");
        String surname = scanner.nextLine();
        author.setSurname(surname.equals("")? author.getSurname():surname);
        authorController.update(author);
    }

}
