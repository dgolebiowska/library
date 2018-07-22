package pl.sda.peresistence;

import pl.sda.domain.Author;

import java.io.IOError;
import java.io.IOException;
import java.util.List;

public interface IAuthorRepository {
void create(Author author) throws IOException;
void delete(Long id) throws IOException;
Author read(Long id) throws IOException;
void update(Author author)throws IOException;
List viewAll() throws IOException;
}
