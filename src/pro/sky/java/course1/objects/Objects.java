package pro.sky.java.course1.objects;

public class Objects {
    public static void main(String[] args) {
        Author paolini = new Author("Кристофер ", "Паолини");
        Book eragon = new Book(paolini, "Эрагон", 2003);
        Author oda = new Author("Эйтиро ", "Ода");
        Book onePiece = new Book(oda, "One Piece", 1998);
        Author pet=new Author("Роберт","Паттисон");
        Book vamp= new Book(pet,"Будни молодого вампира ",2009);
        System.out.println(eragon);
        System.out.println(vamp);
        System.out.println(onePiece);
        System.out.println (paolini.equals(oda));
        System.out.println(onePiece.hashCode());
    }
}
