/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book_ticket;
import java.util.ArrayList;

public class cinema {
    ArrayList <Integer> cinema;
    
    public cinema(int total_seat){
        cinema=new ArrayList <Integer>(); 
        for(int i=1;i<=total_seat;i++){
            cinema.add(i);
        }

    
    }
    public void book(int seatNumber){
         int found=0;
         for(int i=1;i<=cinema.size();i++){
            if(cinema.get(i)==seatNumber){
                found=1;
                cinema.remove(i);
                break;
          }
        }
        if(found==0){
            System.out.println("seat is not valid");
        }
        else{
               System.out.println("seat is  valid");
        }
    }
    public void canel(int seatNumber){
          for(int i=1;i<=cinema.size();i++){
            if(cinema.get(i)==seatNumber){
                cinema.add(i);
          }
        }
    }
    public void showseatvalid(){
         System.out.println("seats is valid after booked is:");
        for(int i=1;i<=cinema.size();i++){
            System.out.println(cinema.get(i)+" ");
        }
    }
    
    
    
    
    
    
    
    
}
