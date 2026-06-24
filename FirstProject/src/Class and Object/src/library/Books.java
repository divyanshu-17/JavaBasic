package library;

// if we want to access all the files we can do: import vehicle.*;

class Books {
    static int totalBooks;
    String title;
    String authorName;
    String isbn; // International standard book no(13 digits)
    boolean isBorrowed;

    static {
        totalBooks=0;
    }
    {
        totalBooks++;
    }

    Books(String Title, String AuthorName, String ISBN){
        this.title =Title;
        this.authorName =AuthorName;
        this.isbn =ISBN;
    }
    Books(String ISBN){
        this("Unknown","Unknown",ISBN); //🌟
    }

    static int totalbooks(){
        return totalBooks;
    }
    void borrowingBooks(){
        if (isBorrowed){
            System.out.println("Book is already borrowed");
        }else {
            this.isBorrowed=true;
            System.out.println("Enjoy " +this.title); // Prints title
        }
    }
    void returnBook(){
        if (isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed the book");
        }else {
            System.out.println("Book is in library");
        }
    }
}
