package pl.sda.service;

import pl.sda.domain.Author;

import java.io.IOException;

public interface IAuthorService {
    void create(Author author) throws IOException;
    void delete(Long id) throws IOException;
}
