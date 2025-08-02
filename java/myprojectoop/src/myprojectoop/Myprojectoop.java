/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myprojectoop;
import java.util.Scanner; 
public class Myprojectoop {


    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Rectangle r1=new Rectangle();
        System.out.print("Enter a  length: ");
        r1.setlength(input.nextDouble());
        System.out.print("Enter a  width: ");
        r1.setwidth(input.nextDouble());
       System.out.println("Length of r1: " + r1.getlength());
       System.out.println("Width of r1: " + r1.getwidth());
       System.out.println("area of r1: " + r1.getarea());
       System.out.println("permintal is: "+r1.getPerimeter());
       
        Rectangle r2=new Rectangle();
        System.out.print("Enter a  length: ");
        r2.setlength(input.nextDouble());
       System.out.print("Enter a  width: ");
       r2.setwidth(input.nextDouble());
       System.out.println("Length of r2: " + r2.getlength());
       System.out.println("Width of r2: " + r2.getwidth());
       System.out.println("area of r2: " + r2.getarea());
       System.out.println("permintal is:"+r2.getPerimeter());
    }
    
}
