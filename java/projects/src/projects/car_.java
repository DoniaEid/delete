/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;

public class car_ extends vehicale {
    
   private String model;
    public car_ (){
         System.out.println("This is car");
    }
    
 
    public car_ (double s,String model){
         super(s);
         this.model=model;
    }
    @Override
        public void displayInfo(){
         System.out.println("This is speed:"+speed);   
         System.out.println("This is model:"+model);
}
    
    
    
    
    
    
}
