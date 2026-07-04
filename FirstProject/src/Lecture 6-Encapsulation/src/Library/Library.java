package Library;

public class Library {
    private String bookTitle;
    private int totalCopies;
    private int availableCopies;

    public Library(String bookTitle, int totalCopies) {
        this.bookTitle = bookTitle;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public void borrowBook() {
        if (availableCopies <= 0) {
            System.out.println("No copies available to borrow!");
            return;
        }
        availableCopies--;
        System.out.println("Book borrowed. Available copies: " + availableCopies);
    }

    public void returnBook() {
        if (availableCopies >= totalCopies) {
            System.out.println("All copies are already returned!");
            return;
        }
        availableCopies++;
        System.out.println("Book returned. Available copies: " + availableCopies);
    }

    public int getAvailableCopies() {
        return availableCopies;
    }
}
