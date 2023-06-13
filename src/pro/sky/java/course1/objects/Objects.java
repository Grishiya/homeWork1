package pro.sky.java.course1.objects;

import java.util.Arrays;

public class Objects {
    public static void main(String[] args) {
        Author Eragon = new Author("Кристофер ", "Паолини, ");
        System.out.println("Eragon = " + Eragon.getNameAuthor() + Eragon.getSurnameAuthor());
        Book eragon = new Book(Eragon, "Эрагон, ", 2003);
        System.out.println("eragon = " + eragon.getBookName() + Eragon.getNameAuthor() + Eragon.getSurnameAuthor() + eragon.getYearOfPublication());
        Author oda = new Author("Эйтиро ", "Ода, ");
        Book onePiece = new Book(oda, "One Piece, ", 1998);
        System.out.println("onePiece = " + onePiece.getBookName() + oda.getNameAuthor() + oda.getSurnameAuthor() + onePiece.getYearOfPublication());
        eragon.setYearOfPublication(2002);
        System.out.println("eragon = " + eragon.getYearOfPublication());
    }
}
