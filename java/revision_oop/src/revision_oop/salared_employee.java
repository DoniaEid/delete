
package revision_oop;

public class salared_employee  extends employee implements displayable {//sub class
    private double salary;
    private double bonus;
    private double dedaction;
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setDedaction(double dedaction) {
        this.dedaction = dedaction;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public double getDedaction() {
        return dedaction;
    }
    public salared_employee(){
        
    }

     public salared_employee(String name,String address,int ssn,Gender sex,double salary, double bonus, double dedaction) {//+attribute in interface
        super(name,address,ssn,sex);
        this.salary = salary;
        this.bonus = bonus;
        this.dedaction = dedaction;
    }
@Override
  public  double earning(){
      return (salary+bonus)-dedaction;
  }
@Override
 public void displayalldetails(){
     System.out.println("company:"+company+"\n"+"fax:"+fax);
     System.out.println("salay employee:"+salary+"\n"+"bonus employee:"+bonus+"\n"+"deduction employee:"+dedaction+"\n"+"earning:"+earning());

 }
@Override
public void displayearning() {
       System.out.println("earning"+earning());
}

    
    
    
}
