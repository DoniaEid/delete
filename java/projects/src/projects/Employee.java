
package projects;

public  class Employee {
    private int Emp_ID ;
    private String name;
    private String Depart;
    private double Salary;
    private double Bonus;
    private boolean Resident;
   public Employee(){
       Emp_ID=100;
       name="no_name";
       Salary=3000;
       Bonus=500;
       Depart="no assigned";
       Resident=true;
   }
   public Employee(int id,String n){
     Emp_ID=id;
     name=n;
   }
   public Employee(int id,String n,boolean r){
//      Emp_ID=id;
//      name=n;
      this(id,n);//constructor shean
      Resident=r;
   }
   public Employee(int id,String n,double s,double b,String d,boolean r){ //constructor overloading
       this(id,n,r);
       Salary=s;
       Bonus=b;
       Depart=d;
       
       
   }
   
   public void setsalary(double s){
       Salary=s;
   }
    public void setsalary(double s,double b){
       this.setsalary(s);// بيستدعي  methode جوه واحد ثاني
       Bonus=b;
       
   }
   public void print_emp_data (){
       System.out.println("ID:" + Emp_ID);
       System.out.println("name:" + name);
       System.out.println("salary:" + Salary);
       System.out.println("Bonus:" + Bonus);
       System.out.println("Depart:" + Depart);
       System.out.println("Resident:" + Resident);
       
   }
   
 
}
