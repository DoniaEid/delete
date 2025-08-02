
package revision_oop;

enum Gender {
     FEMALE,
     MALE
}

public abstract class employee {//super class
    String name;
    String address;
    int ssn;
    Gender sex;
    
    
    public  employee(){
    
    }  
    public  employee(String name,String address,int ssn,Gender sex){
        this.name=name;
        this.address=address;
        this.ssn=ssn;
        this.sex=sex;

   }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSsn() {
        return ssn;
    }

    public Gender getSex() {
        return sex;
    }
    
 public abstract double earning();





    
    
}
