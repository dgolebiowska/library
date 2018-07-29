package pl.sda.service;

import pl.sda.domain.Borrow;
import pl.sda.peresistence.BorrowRepository;
import pl.sda.peresistence.IBorrowRepository;

import java.io.IOException;
import java.util.List;

public class BorrowService implements IBorrowService {
    private IBorrowRepository borrowRepository=new BorrowRepository();
    @Override
    public void create(Borrow borrow) throws IOException {
        borrowRepository.create(borrow);
    }

    @Override
    public void delete(Long id) throws IOException {
borrowRepository.delete(id);
    }

    @Override
    public Borrow read(Long id) throws IOException {
        Borrow borrow=borrowRepository.read(id);

        return borrow;
    }

    @Override
    public void update(Borrow borrow) throws IOException {
borrowRepository.update(borrow);
    }

    @Override
    public List viewAll() throws IOException {
        List<Borrow>borrows=borrowRepository.viewAll();
        return borrows;
    }
}
