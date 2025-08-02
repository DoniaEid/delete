
package library_system;
public class printedbook extends BOOK implements information_base {
   private int num_pages;
   
   public  printedbook(){
       
   }
  public printedbook(String title, String author, int id_book, int num_pages) {
    super(title, author, id_book); 
    this.num_pages = num_pages;
}
  @Override
  public  void displayinfo(){
      System.out.println("this book is type printedbook");
      System.out.println("name_library:"+name_library+"\n"+"address_library:"+address+"\n"+"title_book:"+title+"\n"+"author"+author+"\n"+"id_book:"+id_book+"\n"+"num_pages:"+num_pages);
  }
   
}
