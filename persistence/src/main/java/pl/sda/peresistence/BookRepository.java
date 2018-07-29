package pl.sda.peresistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.domain.Book;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BookRepository implements IBookRepository {
public static final ObjectMapper OBJECT_MAPPER=new ObjectMapper();
private static final String BOOK_DB_PATH="C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.books\\books.json";
    @Override
    public void create(Book book) throws IOException {
        List<Book>books=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.books\\books.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Book>>() {
        });
        int nextId=books.size()+1;
        book.setId((long) nextId);
        books.add(book);
        OBJECT_MAPPER.writeValue(new File(BOOK_DB_PATH), books);
    }

    @Override
    public void delete(Long id) throws IOException {
        List<Book> books = OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.books\\books.json"), new com.fasterxml.jackson.core.type.TypeReference<List<Book>>() {
        });
        for (Book b : books) {
            if (id.equals(b.getId())) {
                b.setRemoved(true);
            }

        }

        OBJECT_MAPPER.writeValue(new File(BOOK_DB_PATH), books);
    }
    @Override
    public Book read(Long id) throws IOException {
            List<Book>books=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.books\\books.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Book>>() {
            });
            for(Book b:books){
                if(id.equals(b.getId())) {
                    System.out.println(b);
                    return b;
                }
            }
            return null;
        }

    @Override
    public void update(Book book) throws IOException {
        List<Book>books=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.books\\books.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Book>>() {
        });
        int index = 0;
        for(int i = 0; i< books.size(); i++) {
            if(book.getId().equals(books.get(i).getId())){
                index = i;
                break;
            }
        }
       books.set(index, book);
        OBJECT_MAPPER.writeValue(new File(BOOK_DB_PATH), books);
    }

    @Override
    public List<Book> viewAll() throws IOException {
        List<Book>books=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.books\\books.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Book>>() {
        });
        return books;
    }

}



