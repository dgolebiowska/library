package pl.sda.service;

import pl.sda.domain.Borrower;
import pl.sda.peresistence.BookRepository;
import pl.sda.peresistence.BorrowerRepository;
import pl.sda.peresistence.IBorrowerRepository;

import java.io.IOException;
import java.util.List;

public class BorrowerService implements IBorrowerService {
    private IBorrowerRepository borrowerRepository=new BorrowerRepository();
    @Override
    public void create(Borrower borrower) throws IOException {
       borrowerRepository.create(borrower);
    }

    @Override
    public void delete(Long id) throws IOException {
borrowerRepository.delete(id);
    }

    @Override
    public Borrower read(Long id) throws IOException {
        Borrower borrower=borrowerRepository.read(id);
        return borrower;
    }

    @Override
    public void update(Borrower borrower) throws IOException {
borrowerRepository.update(borrower);
    }

    @Override
    public List<Borrower> viewAll() throws IOException {
        List <Borrower> borrower=borrowerRepository.viewAll();
        return borrower;
    }
}
