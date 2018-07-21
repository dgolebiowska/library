package pl.sda.domain;

import sun.util.resources.LocaleData;

import java.time.LocalDate;


public class Book {
    int id;
    String title;
    LocalDate dateOfPublish;
    int ISBN;
    BooksType type;
    int numerOfPage;
    String description;
    Long authorId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateOfPublish() {
        return dateOfPublish;
    }

    public void setDateOfPublish(LocalDate dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public BooksType getType() {
        return type;
    }

    public void setType(BooksType type) {
        this.type = type;
    }

    public int getNumerOfPage() {
        return numerOfPage;
    }

    public void setNumerOfPage(int numerOfPage) {
        this.numerOfPage = numerOfPage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
}
