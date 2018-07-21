package pl.sda.peresistence;

import pl.sda.domain.Author;

import java.io.IOException;

public interface IAuthorRepository {
void create(Author author) throws IOException;
void delete(Long id) throws IOException;

}
