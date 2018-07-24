package pl.sda.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import sun.util.resources.LocaleData;

import java.time.LocalDate;
@Getter
@Setter
@ToString

public class Book {
   private Long id;
   private String title;
    private LocalDate dateOfPublish;
  private   int ISBN;
    private BooksType type;
    private int numerOfPage;
   private String description;
   private Long authorId;
    boolean removed;

}
