
package projects;

enum gender{male,female};
enum course {database,programming,math,erp};
enum semester{summer,fall,spring,winter};
public class registerform {
    
   String stdname ;
   gender stdgender;
   course crs;
   semester sem;

    public registerform() {
        stdname="donia";
        stdgender=gender.male;
        crs=course.erp;
        sem=semester.summer;
    }

    public String getStdname() {
        return stdname;
    }

    public gender getStdgender() {
        return stdgender;
    }

    public course getCrs() {
        return crs;
    }

    public semester getSem() {
        return sem;
    }
    
    
    
    
    
    
    
    
    
}
