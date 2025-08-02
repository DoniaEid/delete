
package library_system;


public class EBOOK extends BOOK implements information_base{
   private double size_miga;

    public double getSize_miga() {
        return size_miga;
    }

    public void setSize_miga(double size_miga) {
        this.size_miga = size_miga;
    }
  public EBOOK() {
    }

    public EBOOK(String title, String author, int id_book,double size_miga) {
        super(title, author, id_book);
        this.size_miga=size_miga;
    }
 @Override
  public  void displayinfo(){
       System.out.println("this book is type EBBOK");
      System.out.println("name_library:"+name_library+"\n"+"address_library:"+address+"\n"+"title_book:"+title+"\n"+"author:"+author+"\n"+"id_book:"+id_book+"\n"+"size book:"+size_miga);
  }
  
    
   
}
