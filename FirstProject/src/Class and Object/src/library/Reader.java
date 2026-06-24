package library;

public class Reader {
    public static void main(String[] args) {
        Books gameOfThrones= new Books("1264789646731");
        System.out.println(Books.totalBooks);
        Books ChachaChaudhri=new Books("comic","Rampal","1145858965");
        gameOfThrones.borrowingBooks();
        gameOfThrones.returnBook();
        ChachaChaudhri.returnBook();
        System.out.println(Books.totalBooks);
        ChachaChaudhri.borrowingBooks();
    }
}
