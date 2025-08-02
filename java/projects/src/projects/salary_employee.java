/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;

/**
 *  
 * @author DELL
 */
public class salary_employee extends employee_person{
     private double bonus;
     private double deduction;
     public salary_employee(){
         
     }
public salary_employee(String n,double a,String ad,String nat,double s,String ra,String j,double bo,double deduc){
         super(n,a,ad,nat,s,ra,j);
         bonus=bo;
         deduction=deduc;
     
     }
@Override
public double getSalary(){ //لغيت الي في لو عملت override base class 
    return salary+bonus-deduction;
}

}
