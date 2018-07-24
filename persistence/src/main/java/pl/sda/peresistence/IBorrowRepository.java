package pl.sda.peresistence;

import pl.sda.domain.Borrow;

import java.io.IOException;
import java.util.List;

public interface IBorrowRepository {
    void create(Borrow borrow)throws IOException;
    void delete(Long id) throws IOException;
    Borrow read(Long id) throws IOException;
    void update(Borrow borrow)throws IOException;
    List<Borrow> viewAll() throws IOException;
}
