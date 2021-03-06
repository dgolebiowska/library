package pl.sda.peresistence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.domain.Author;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuthorRepository implements IAuthorRepository {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final String AUTHOR_DB_PATH = "C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.authors\\authors.json";

    public void create(Author author) throws IOException {
        List<Author> authors = OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.authors\\authors.json"), new TypeReference<List<Author>>() {
        });

        int nextId = authors.size() + 1;
        author.setId((long) nextId);
        authors.add(author);
        OBJECT_MAPPER.writeValue(new File(AUTHOR_DB_PATH), authors);
    }

    @Override
    public void delete(Long id) throws IOException {
        List<Author> authors = OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.authors\\authors.json"), new TypeReference<List<Author>>() {
        });
        for (Author a : authors) {
            if (id.equals(a.getId())) {
                a.setRemoved(true);
            }
        }

        OBJECT_MAPPER.writeValue(new File(AUTHOR_DB_PATH), authors);

    }

    @Override
    public Author read(Long id) throws IOException {
        List<Author> authors = OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.authors\\authors.json"), new TypeReference<List<Author>>() {
        });
        for (Author a : authors) {
            if (id.equals(a.getId())) {
                System.out.println(a);
                return a;
            }
        }
        return null;
    }
    @Override
    public List viewAll() throws IOException {
        List<Author> authors = OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.authors\\authors.json"), new TypeReference<List<Author>>() {
        });
        return authors;
    }

    @Override
    public void update(Author author) throws IOException {
        List<Author> authors = OBJECT_MAPPER.readValue(new File("C:\\Users\\Dorota\\sda\\nowerepo\\super-mega-library\\persistence\\src\\main\\resources\\database.authors\\authors.json"), new TypeReference<List<Author>>() {
        });

        int index = 0;
        for(int i = 0; i< authors.size(); i++) {
            if(author.getId().equals(authors.get(i).getId())){
                index = i;
                break;
            }
        }
        authors.set(index, author);
        OBJECT_MAPPER.writeValue(new File(AUTHOR_DB_PATH), authors);
    }

}

