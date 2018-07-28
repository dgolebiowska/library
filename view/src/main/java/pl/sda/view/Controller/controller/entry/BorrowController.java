package pl.sda.view.Controller.controller.entry;

import pl.sda.domain.Borrow;
import pl.sda.domain.Borrower;
import pl.sda.service.BorrowService;
import pl.sda.service.IBorrowService;

import java.io.IOException;
import java.util.List;

public class BorrowController {
    private IBorrowService borrowService=new BorrowService();
    public void create( String name, String surname, String address, int phoneNumber, String email) throws IOException {
        Borrow borrow=new Borrow();
        borrowService.create(borrow);
    }
    public void delete(Long id) throws IOException {
        borrowService.delete(id);
    }
    public Borrow read(Long id)throws IOException{
        Borrow borrow=borrowService.read(id);
        return borrow;
    }
    public List<Borrow> viewAll()throws IOException{
        return borrowService.viewAll();
    }
    public void update(Borrow borrow)throws IOException{
        borrowService.update(borrow);
    }
}


