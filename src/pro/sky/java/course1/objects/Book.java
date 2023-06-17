package pro.sky.java.course1.objects;

public class Book {
    private Author author;
    private String bookName;
    private int yearOfPublication;

    public Book(Author author, String bookName, int yearOfPublication) {
        this.author = author;
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
    }
    public Author getAuthor(){
        return this.author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
