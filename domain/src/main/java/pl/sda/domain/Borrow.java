package pl.sda.domain;

import java.time.LocalDate;

public class Borrow {
    int id;
    LocalDate dateOfBorrow;
    Long bookID;
    Long borrowerID;
    boolean revmoved;

    public boolean isRevmoved() {
        return revmoved;
    }

    public void setRevmoved(boolean revmoved) {
        this.revmoved = revmoved;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateOfBorrow() {
        return dateOfBorrow;
    }

    public void setDateOfBorrow(LocalDate dateOfBorrow) {
        this.dateOfBorrow = dateOfBorrow;
    }

    public Long getBookID() {
        return bookID;
    }

    public void setBookID(Long bookID) {
        this.bookID = bookID;
    }

    public Long getBorrowerID() {
        return borrowerID;
    }

    public void setBorrowerID(Long borrowerID) {
        this.borrowerID = borrowerID;
    }
}
