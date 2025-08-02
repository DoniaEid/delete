
package revision_oop;
import java.util.ArrayList;
public class department {
    
    int dno;
    String dname;
    ArrayList <employee>  emplist;
    public void setDno(int dno) {
        this.dno = dno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getDno() {
        return dno;
    }

    public String getDname() {
        return dname;
    }

    public department() {
    }

    public department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
        emplist=new  ArrayList <employee>();//لازم في constractor
        
    }
public void add_employee(employee e){
  
    emplist.add(e);
}
public void remove_employee(employee e){
    
    emplist.remove(e);
}
        
 public int getsize_employee(){
  
   return emplist.size();
}
public void displayalldetails(){// في حالة لو مش في employee
           
            for(int i=0;i<emplist.size();i++){
               if( emplist.get(i) instanceof salared_employee){// من النوع
                   ((salared_employee) emplist.get(i)).displayalldetails();//type casting
                   System.out.println("\n");
               }
               if( emplist.get(i) instanceof hourlyemployee){
                   ((hourlyemployee) emplist.get(i)).displayalldetails();// علشان احول من employee الي sub class
               }
               if( emplist.get(i) instanceof commission_employee){
                   ((commission_employee) emplist.get(i)).displayalldetails();
               }
            }
}    

}
