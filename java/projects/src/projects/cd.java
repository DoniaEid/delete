/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;


public class cd implements retailitem,displayable{
    
    double price;
    String title;
    String artist;

    public cd() {
    }

    public cd(double price, String title, String artist) {
        this.price = price;
        this.title = title;
        this.artist = artist;
    }
    
    public double getitemprice(){ // in interface retailtime
        return price;
    }

    public String getTitle() {
        return title;
    }
    public void display(){ //in interface displayable
        System.out.println("title:"+title);
        System.out.println("artist:"+artist);
        System.out.println("price:"+price);
        System.out.println("storename:"+storename);
    }
    
    
    
    
    
    
}
