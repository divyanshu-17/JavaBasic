package Library2;

public class Books extends LibraryItem{

    private long isbn;

    public Books(long isbn){
        this.isbn=isbn;
    }

    public long getIsbn() {
        return isbn;
    }

    public static void main(String[] args) {
        Books book= new Books(123456789);

        book.setAuthor("Hans Miller");

        System.out.println(book.getAuthor());
    }
}

//❌ You never created:

//LibraryItem L = new LibraryItem();

//because it's not needed.

//Why?

//When you create:

//Books book = new Books();

//Java internally creates something like this:

//Books Object
//-------------------
//itemId      ← inherited from LibraryItem
//author()     ← inherited from LibraryItem
//isbn()    ← Book's own method

//So the child object already has access to all non-private members of the parent.