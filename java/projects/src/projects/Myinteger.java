
package projects;

public class Myinteger {
    private int number;
    
    public void setnumber(int num){
        number=num;
    }
    public String gettype(){
         if(number%2==0){
             return "number is even";
         }
         else{
             return "number is odd";
         }
    }
    
    
    
    
    
}
