package pro.sky.java.course1.objects;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {

        return this.surname;
    }

    @Override
    public String toString() {

        return this.name + this.surname;
    }

    @Override
    public boolean equals(Object author1) {
        if (this == author1) {
            return true;
        }
        if (author1 != null) {
            return false;
        }

        if (this.getClass() != author1.getClass()) {
            return false;
        }
        Author author = (Author) author1;

        return name.equals(author.getName()) && surname.equals(author.getSurname());
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,surname);
    }

}
