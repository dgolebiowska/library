package pl.sda.peresistence;

import pl.sda.domain.Book;

import java.io.IOException;
import java.util.List;

public interface IBookRepository {
    void create(Book book)throws IOException;
    void delete(Long id) throws IOException;
    Book read(Long id) throws IOException;
    void update(Book book)throws IOException;
    List<Book> viewAll() throws IOException;
}
