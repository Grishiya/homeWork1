package pro.sky.java.course1.objects;

import java.util.Arrays;

public class Objects {
    public static void main(String[] args) {
        Author  paolini = new Author("Кристофер ", "Паолини");
        Book eragon = new Book(paolini, "Эрагон", 2003);
        Author oda = new Author("Эйтиро ", "Ода");
        Book onePiece = new Book(oda, "One Piece", 1998);
        eragon.setYearOfPublication(2002);
        System.out.println("Книга - " +onePiece.getBookName()+". Автор - "+onePiece.getAuthor().getName()+onePiece.getAuthor().getSurname()+". Год публикации "+ onePiece.getYearOfPublication());
    }
}
