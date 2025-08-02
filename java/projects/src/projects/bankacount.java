
package projects;

public class bankacount {
    private String name;
    private int acountnumber;
    private double balance;
    
    public bankacount(String n,int a,double b){
        name=n;
        acountnumber=a;
        balance=b;
    }
    public void printinfo(){
        System.out.println("custmor name:"+name);
        System.out.println("Acount number:"+acountnumber);
        System.out.println("Balance:$"+balance);
     
    }
    public String calc(double balance){
        if(balance>=10000){
            return "High balnce";
        }
        else if(balance>=1000){
            return "normal balance";
        }
        else{
            return "low balance";
        }
    }
}
