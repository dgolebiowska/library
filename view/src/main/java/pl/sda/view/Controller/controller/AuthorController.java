package pl.sda.view.Controller.controller;

import pl.sda.domain.Author;
import pl.sda.service.AuthorService;
import pl.sda.service.IAuthorService;

import java.io.IOException;
import java.util.List;

public class AuthorController {
    private IAuthorService authorService=new AuthorService();
    public void create(String firstName, String lastname,String placeOfBirth) throws IOException {
        Author author=new Author();
        author.setName(firstName);
        author.setSurname(lastname);
        author.setPlaceOfBirth(placeOfBirth);
        authorService.create(author);
    }
    public void delete(Long id) throws IOException {
authorService.delete(id);
    }
    public Author read(Long id)throws IOException{
        Author author=authorService.read(id);
        return author;
    }
    public List<Author> viewAll()throws IOException{
        return authorService.viewAll();
    }
    public void update(Author author)throws IOException{
        authorService.update(author);
    }
}
