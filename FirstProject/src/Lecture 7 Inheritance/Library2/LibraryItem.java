package Library2; //‼️This is the SUPER CLASS(Parent)

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    //‼️‼️‼️‼️‼️‼️‼️‼️ We have to pass this no args constructor to get access in child class means without passing
                                                 // (String itemId, String title, String author) values
    public LibraryItem(){

    }


    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "itemId='" + itemId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getItemId() {
        return itemId;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void checkout(String itemId){
        System.out.println("Thank You for your purchase of "+title);
    }
    public void returnItem(String title, String issue){
        System.out.println("Sorry for your inconvenience on purchase of "+title);
        System.out.println("Please state the issue: "+issue);
    }


}
