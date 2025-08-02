
package revision_oop;

public class commission_employee extends employee implements displayable {//sub class
    private double gross_sales;
    private double commoision_rate;
    
    public commission_employee(){
    
}
  public commission_employee(String name,String address,int ssn,Gender sex,double gross_sales,double commoision_rate){
       super(name,address,ssn,sex);
       this.gross_sales=gross_sales;
       this.commoision_rate=commoision_rate;
  }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public void setCommoision_rate(double commoision_rate) {
        this.commoision_rate = commoision_rate;
    }

    public double getGross_sales() {
        return gross_sales;
    }

    public double getCommoision_rate() {
        return commoision_rate;
    }

@Override
  public  double earning(){
     return commoision_rate*gross_sales;
  }
@Override
 public void displayalldetails(){
     System.out.println("company:"+company+"\n"+"fax:"+fax);
     System.out.println("gross_sales employee:"+gross_sales+"\n"+"commoision_rate employee:"+commoision_rate+"\n"+"earning:"+earning());

 }
@Override
public void displayearning() {
       System.out.println("earning"+earning());
}

      
    
    
    
    
    
    
    
    
    
    
}
