
package projects;


public class person {
   private String name;
   private double age;
   private String address;
   private String nationality;
    
    
     public person() {  //لازم علشان التوريث
         System.out.println("im the base class constructor");
    }
    public person(String n,double a,String ad,String nat){
        name=n;
        age=a;
        address=ad;
        nationality=nat;
    }
    
    public void setname(String n){
        name=n;
    }
      public void setage(double a){
        age=a;
    }
      public void setaddress(String ad){
         address=ad;
    }
      public void setnationality(String nat){
        nationality=nat;
    }
    public String getname(){
        return name;
    }
       public double getage(){
        return age;
    }
       public String getaddress(){
        return address;
    }
       public String getnationality(){
        return nationality;
    }
       public void print_all_details(){
           System.out.println("name:"+name+"\n"+"age:"+age+"\n"+"address:"+address+"\n"+"nationality:"+nationality);
       }
    
}
