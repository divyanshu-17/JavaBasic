package Library;

public class TestLib {
    public static void main(String[] args) {
        Library addin= new Library("Jungle Book",15);
        System.out.println(addin.getAvailableCopies());
        addin.borrowBook();
        System.out.println(addin.getAvailableCopies());
        addin.returnBook();
        System.out.println(addin.getAvailableCopies());

    }
}
