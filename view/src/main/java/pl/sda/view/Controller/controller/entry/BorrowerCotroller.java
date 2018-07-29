package pl.sda.view.Controller.controller.entry;

import pl.sda.domain.Borrow;
import pl.sda.domain.Borrower;
import pl.sda.service.BorrowerService;
import pl.sda.service.IBorrowerService;

import java.io.IOException;
import java.util.List;

public class BorrowerCotroller {
    private IBorrowerService borrowerService=new BorrowerService();
    public void create(Borrower borrower ) throws IOException {
        borrowerService.create(borrower);
    }
    public void delete(Long id) throws IOException {
        borrowerService.delete(id);
    }
    public Borrower read(Long id)throws IOException{
        Borrower borrower=borrowerService.read(id);
        return borrower;
    }
    public List<Borrower> viewAll()throws IOException{
        return borrowerService.viewAll();
    }
    public void update(Borrower borrower)throws IOException{
        borrowerService.update(borrower);
    }
}
