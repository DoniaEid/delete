/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;


public abstract class employee_person extends person{
    
    protected double salary;
    private String rank;
    private String jop;
    
    public employee_person(){
        
    }
    
  public employee_person(String n,double a,String ad,String nat,double s,String ra,String j){
      super(n,a,ad,nat);
      salary=s;
      rank=ra;
      jop=j;
  }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setJop(String jop) {
        this.jop = jop;
    }

    public abstract double getSalary() ; //لازم استدعيها في sub class لازم لو نعملتش كدا هيحصل error
    

    public String getRank() {
        return rank;
    }

    public String getJop() {
        return jop;
    }
    @Override
      public void print_all_details(){
          super.print_all_details();// مهمه  علشان readability
          System.out.println("salary:"+salary+"\n"+"rank:"+rank+"\n"+"jop:"+jop);
      }   
    
}
