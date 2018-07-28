package pl.sda.service;

import pl.sda.domain.Borrower;

import java.io.IOException;
import java.util.List;

public interface IBorrowerService {
    void create(Borrower borrower) throws IOException;
    void delete(Long id) throws IOException;
    Borrower read(Long id) throws IOException;
    void update(Borrower borrower)throws IOException;
    List viewAll ()throws IOException;
}
