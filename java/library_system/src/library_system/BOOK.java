
package library_system;

public abstract class BOOK {
   String title;
   String author;
   int id_book;

    public void setName_book(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId_book(int id_book) {
        this.id_book = id_book;
    }

    public String gettitle_book() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId_book() {
        return id_book;
    }
    public BOOK(String title, String author, int id_book) {
        this.title = title;
        this.author = author;
        this.id_book = id_book;
    }

    public BOOK() {
   
    }
   public abstract void displayinfo();
   
}
