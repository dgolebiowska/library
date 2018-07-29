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
    private String dateOfPublish;
  private   long ISBN;
    private BooksType type;
    private int numerOfPage;
   private String description;
   private Long authorId;
    boolean removed;
    boolean borrowed;

}
