
package revision_oop;
public class BassPlusscommision_employee extends commission_employee  { //sub class
   private double base;

    public BassPlusscommision_employee() {
    }

    public BassPlusscommision_employee(double base, String name, String address, int ssn, Gender sex, double gross_sales, double commoision_rate) {
        super(name, address, ssn, sex, gross_sales, commoision_rate);
        this.base = base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

 @Override
      public double earning(){
           return base+super.earning();
  }
@Override
 public void displayalldetails(){
   
     super.displayalldetails();//عادي اورث نفس الحاجهoverride 
     System.out.println("base employee:"+base);

 }
@Override
public void displayearning() {
    System.out.println("earning"+earning());
}
}







