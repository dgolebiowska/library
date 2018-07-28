package pl.sda.service;

import pl.sda.domain.Borrow;

import java.io.IOException;
import java.util.List;

public interface IBorrowService {
    void create(Borrow borrow) throws IOException;
    void delete(Long id) throws IOException;
    Borrow read(Long id) throws IOException;
    void update(Borrow borrow)throws IOException;
    List viewAll ()throws IOException;
}
