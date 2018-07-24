package pl.sda.peresistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.domain.Borrow;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BorrowRepository implements IBorrowRepository{
    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final String BORROW_DB_PATH = "C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrow\\borrows.json";
    @Override
    public void create(Borrow borrow) throws IOException {
        List<Borrow>borrows=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrow\\borrows.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Borrow>>() {
        });
        int nextId=borrows.size()+1;
        borrow.setId(nextId);
      borrows.add(borrow);
        OBJECT_MAPPER.writeValue(new File(BORROW_DB_PATH), borrows);

    }

    @Override
    public void delete(Long id) throws IOException {
        List<Borrow>borrows=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrow\\borrows.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Borrow>>() {
        });
        for (Borrow b :borrows) {
            if (id.equals(b.getId())) {
               b.setRevmoved(true);
            }
        }

        OBJECT_MAPPER.writeValue(new File(BORROW_DB_PATH), borrows);
    }


    @Override
    public Borrow read(Long id) throws IOException {
        List<Borrow>borrows=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrow\\borrows.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Borrow>>() {
        });
        for (Borrow b : borrows) {
            if (id.equals(b.getId())) {
                b.setRevmoved(true);
                System.out.println(b);
                return b;
            }
        }
        OBJECT_MAPPER.writeValue(new File(BORROW_DB_PATH), borrows);
        return null;
    }

    @Override
    public void update(Borrow borrow) throws IOException {
        List<Borrow>borrows=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrow\\borrows.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Borrow>>() {
        });
        int index = 0;
        for (int i = 0; i < borrows.size(); i++) {
            if (borrow.getId() == (borrows.get(i).getId())) {
                index = 1;
                break;
            }
            borrows.set(index, borrow);
            OBJECT_MAPPER.writeValue(new File(BORROW_DB_PATH), borrows);
        }
    }


    @Override
    public List<Borrow> viewAll() throws IOException {
        List<Borrow>borrows=OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.borrow\\borrows.json"),new com.fasterxml.jackson.core.type.TypeReference<List<Borrow>>() {
        });
        return borrows;
    }
}
