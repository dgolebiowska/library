package pl.sda.domain;

public enum BooksType {
    SCIENCE_FIVTION("Science Fiction"),
    HORROR("Horror"),
    ROMANCE("Romance"),
    HISTORY("History"),
    FANTASY("Fantasy"),
    TRAVEL("Travel");
    private String text;
    BooksType(String text){
        this.text=text;
    }

    public String getText() {
        return text;
    }
}
