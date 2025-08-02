
package revision_oop;
public class hourlyemployee extends employee implements displayable {//sub class
    private double hour_rate;
    private int no_of_hour;

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }

    public void setNo_of_hour(int no_of_hour) {
        this.no_of_hour = no_of_hour;
    }

    public double getHour_rate() {
        return hour_rate;
    }

    public int getNo_of_hour() {
        return no_of_hour;
    }
    public hourlyemployee(){
        
    }
    
    public hourlyemployee(String name,String address,int ssn,Gender sex,  double hour_rate, int no_of_hour){
     super(name,address,ssn,sex);
     this.hour_rate=hour_rate;
     this.no_of_hour=no_of_hour;
        
    }
    @Override
  public  double earning(){
     return no_of_hour*hour_rate;
  }
@Override
 public void displayalldetails(){
     System.out.println("company:"+company+"\n"+"fax:"+fax);
     System.out.println("hour_rate employee:"+hour_rate+"\n"+"no_of_hour employee:"+no_of_hour+"\n"+"earning:"+earning());

 }
@Override
public void displayearning() {
   System.out.println("earning"+earning());
}

    
    
    
    
    
    
    
    
}
