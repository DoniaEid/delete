
package library_system;

import java.util.ArrayList;
import library_system.BOOK;
public class array_library {
    
    private ArrayList<BOOK> books = new ArrayList<>();
    
    public int number_book(){
        return books.size();
    }
 
 public void add(BOOK b){
     books.add(b);
 }
     public void remove_book(BOOK b){
         books.remove(b);
    }
    public void display(){
        if(books.size()==0){
            System.out.println("the library is empty");
        }
        else{
              for(int i=0;i<books.size();i++){
                  System.out.println("book"+(i+1));
                 books.get(i).displayinfo();
                  System.out.println("----------------------");
          }
        }
  
    }
    
}
