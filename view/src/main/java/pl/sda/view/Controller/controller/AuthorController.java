package pl.sda.view.Controller.controller;

import pl.sda.domain.Author;
import pl.sda.service.AuthorService;
import pl.sda.service.IAuthorService;

import java.io.IOException;
import java.util.List;

public class AuthorController {
    private IAuthorService authorService=new AuthorService();
    public void create() throws IOException {

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
