package pl.sda.service;

import pl.sda.domain.Book;
import pl.sda.peresistence.BookRepository;
import pl.sda.peresistence.IBookRepository;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class BookService implements IBookService {
private IBookRepository bookRepository=new BookRepository();

    @Override
    public void create(Book book) throws IOException {
       // Book book1= Optional.ofNullable(bookRepository.findBook(bookID))
        bookRepository.create(book);
    }

    @Override
    public void delete(Long id) throws IOException {
        bookRepository.delete(id);
    }

    @Override
    public Book read(Long id) throws IOException {
        Book book=bookRepository.read(id);
        return book;
    }
    public List<Book> viewAll()throws IOException{
        List books=bookRepository.viewAll();
        return books;
    }

    @Override
    public void update(Book book) throws IOException {
       bookRepository.update(book);
    }


}
