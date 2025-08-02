/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myprojectoop;



public class Rectangle {
    
    private double length;
    private double width;
    //public methode
    public void setlength(double l){//لتخزين قيمه الطول
        length=l;
    }
      public void setwidth(double w){//لتخزين قيمه العرض
        width = w;
    }
     
     public double getlength(){
         return length;
     }
      
       public double getwidth(){
         return width;
     }
      public double getarea(){
          return width*length;
      }
        public double getPerimeter(){
          return (width+length)*2;
      }
      
}
