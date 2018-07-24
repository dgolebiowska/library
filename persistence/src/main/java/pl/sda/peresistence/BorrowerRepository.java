package pl.sda.peresistence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.domain.Book;
import pl.sda.domain.Borrow;
import pl.sda.domain.Borrower;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BorrowerRepository implements IBorrowerRepository {
    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final String BORROWER_DB_PATH = "C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrower\\borrowers.json";

    @Override
    public void create(Borrower borrower) throws IOException {
        List<Borrower>borrowers=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrower\\borrowers.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Borrower>>() {
        });
        int nextId=borrowers.size()+1;
        borrower.setId((int) nextId);
        borrowers.add(borrower);
        OBJECT_MAPPER.writeValue(new File(BORROWER_DB_PATH), borrowers);
    }


    @Override
    public void delete(Long id) throws IOException {
        List<Borrower>borrowers=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrower\\borrowers.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Borrower>>() {
        });
        for (Borrower b : borrowers) {
            if (id.equals(b.getId())) {
                b.setRemoved(true);
            }
        }
        OBJECT_MAPPER.writeValue(new File(BORROWER_DB_PATH), borrowers);
    }

    @Override
    public Borrower read(Long id) throws IOException {
        List<Borrower>borrowers=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrower\\borrowers.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Borrower>>() {
        });
        for(Borrower b:borrowers){
            if(id.equals(b.getId())) {
                System.out.println(b);
                return b;
            }
        }
        return null;
    }

    @Override
    public void update(Borrower borrower) throws IOException {
        List<Borrower> borrowers = OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrower\\borrowers.json"), new TypeReference<List<Borrower>>() {
        });
        int index = 0;
        for (int i = 0; i < borrowers.size(); i++) {
            if (borrower.getId() == (borrowers.get(i).getId())) {
                index = 1;
                break;
            }
            borrowers.set(index, borrower);
            OBJECT_MAPPER.writeValue(new File(BORROWER_DB_PATH), borrowers);
        }
    }
    @Override
    public List<Borrower> viewAll() throws IOException {
    List<Borrower>borrowers=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrower\\borrowers.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Borrower>>() {
    });
        return borrowers;
    }
}
