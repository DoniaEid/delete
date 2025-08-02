/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;

public class shape {
     double width;//مهمه علشان تسعدني في sub class
    double height;
    
    public shape(){
                   // قيم ابتدائية مثلًا 0
     
    }
    public shape(double h,double w){
        height=h;
        width=w;
    
    }
       public double area(){
             return height * width;

   }
    
   
    
    
}
