/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;


public class small_shape extends shape {
    
  
   public  small_shape(){
      
   }
 
   public  small_shape(double h,double w){
       super(h,w);
   }
    public  small_shape(shape s){
       super(s.height,s.width);
   }
@Override
   public double area(){
      return height * width;

   }
    
    
    
      
    
    
}
