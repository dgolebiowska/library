package pl.sda.service;

import pl.sda.domain.Author;

import java.io.IOException;
import java.util.List;

public interface IAuthorService {
    void create(Author author) throws IOException;
    void delete(Long id) throws IOException;
    Author read(Long id) throws IOException;
    void update(Author author)throws IOException;
    List viewAll ()throws IOException;
}
