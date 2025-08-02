
package library_system;


public class Library_system {

    public static void main(String[] args) {
     
        BOOK b1=new printedbook("red","yoyo",89,1200);
        array_library b=new array_library();
        b.add(b1);
        BOOK b2=new printedbook("yoyo","fifa",9,1700);
        b.add(b2);
        BOOK b3=new EBOOK("child","ahmed",9,170);
        b.add(b3);
        
     
        System.out.println("number of books in library:"+b.number_book());  
        b.display();
    }
    
}
