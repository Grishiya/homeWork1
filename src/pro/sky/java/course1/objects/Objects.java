package pro.sky.java.course1.objects;

public class Objects {
    public static void main(String[] args) {
        Author paolini = new Author("Кристофер ", "Паолини");
        Book eragon = new Book(paolini, "Эрагон, ", 2003);
        Author oda = new Author("Эйтиро ", "Ода");
        Book onePiece = new Book(oda, "One Piece, ", 1998);
        eragon.setYearOfPublication(2002);
        System.out.println(eragon);
        System.out.println(onePiece);
    }
}
