
package revision_oop;

import java.util.ArrayList;

public class Revision_oop {


    public static void main(String[] args) {
       
        department d1=new department(1,"information");
        salared_employee se=new salared_employee("ahmed","cairo",11233,Gender.MALE,30000,1000,123);
        d1.add_employee(se);
        hourlyemployee he=new hourlyemployee("donia","cairo",11239,Gender.FEMALE,56,9000);
        d1.add_employee(he);
        System.out.println("size of employee in department information:"+d1.getsize_employee());
        d1.displayalldetails();
   
    }

   
   
}
