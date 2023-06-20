package pro.sky.java.course1.objects;

import java.util.Objects;

public class Book {
    final private Author author;
    final private String bookName;
    private int yearOfPublication;

    public Book(Author author, String bookName, int yearOfPublication) {
        this.author = author;
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
    }



    public Author getAuthor() {
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

    @Override
    public String toString() {
        return "Книга - " + bookName + ". Имя и Фамилия - " + this.getAuthor().toString() + ". Дата издания - " + this.yearOfPublication;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfPublication);
    }
}