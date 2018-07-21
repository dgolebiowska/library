package pl.sda.service;

import pl.sda.domain.Author;
import pl.sda.domain.Book;
import pl.sda.peresistence.AuthorRepository;
import pl.sda.peresistence.BookRepository;
import pl.sda.peresistence.IAuthorRepository;

import java.io.IOException;
import java.io.OptionalDataException;
import java.util.Optional;

public class AuthorService implements IAuthorService {

    private IAuthorRepository authorRepository = new AuthorRepository();
    @Override
    public void create(Author author) throws IOException {
    authorRepository.create(author);
    }

    @Override
    public void delete(Long id) throws IOException {
        authorRepository.delete(id);
    }

    }


