
package projects;


public class student extends person { //لازم ياخد بردو الحاجات القديمه متنسيش علشان ديه مهمه اوي
    private int study_level;
    private String specialization;
    private double GPA;

    public student() {  //لازم علشان التوريث
         System.out.println("im the drive class constructor");
    }
    public student(String n,double a,String ad,String nat,int l,String spec,double G){
       super(n,a,ad,nat);// reusability علشان مكررش الكلام ثاني
       study_level=l;
       specialization=spec;
       GPA=G;
    } 

    public void setStudy_level(int study_level) {
        this.study_level = study_level;// علشان اسم attribute نفس argument علشان كده كتبت this
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getStudy_level() {
        return study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getGPA() {
        return GPA;
    }
    
    
    
    
}

