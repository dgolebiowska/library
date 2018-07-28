package pl.sda.view.Controller.controller;

import pl.sda.domain.Book;
import pl.sda.domain.BooksType;
import pl.sda.service.BookService;
import pl.sda.service.IBookService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class BookController {
        private IBookService bookService=new BookService();
        public void create(Book book) throws IOException {
            bookService.create(book);
        }
        public void delete(Long id) throws IOException {
            bookService.delete(id);
        }
        public Book read(Long id)throws IOException{
            Book book=bookService.read(id);
            return book;
        }
        public List<Book> viewAll()throws IOException{
            return bookService.viewAll();
        }
        public void update(Book book)throws IOException{
            bookService.update(book);
        }
    }

