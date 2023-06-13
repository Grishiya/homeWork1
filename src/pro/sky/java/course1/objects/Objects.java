package pro.sky.java.course1.objects;

public class Objects {
    public static void main(String[] args) {
        Author paolini = new Author("Кристофер ", "Паолини");
        System.out.println("Eragon = " + paolini.getNameAuthor() + paolini.getSurnameAuthor());
        Book eragon = new Book(paolini, "Эрагон, ", 2003);
        System.out.println("eragon = " + eragon.getBookName() + paolini.getNameAuthor() + paolini.getSurnameAuthor() + eragon.getYearOfPublication());
        Author oda = new Author("Эйтиро ", "Ода");
        Book onePiece = new Book(oda, "One Piece, ", 1998);
        System.out.println("onePiece = " + onePiece.getBookName() + oda.getNameAuthor() + oda.getSurnameAuthor() + onePiece.getYearOfPublication());
        eragon.setYearOfPublication(2002);
        System.out.println("eragon = " + eragon.getYearOfPublication());
        System.out.println(eragon);
        System.out.println(onePiece);
    }
}
