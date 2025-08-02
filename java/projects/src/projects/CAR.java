
package projects;


public class CAR {
    private String maker;
    private int model;//instant value
    private static int no_of_objects;
    public void setmaker(String m){
        maker=m;
    }
    public void setmodel(int year){
        if(year>0){
            model=year;
        }
        else{
             System.out.println("year is not true");
        }
      
    }   
    public CAR(){// constructor default
        maker="vip";
        model=2022;
        no_of_objects++;
    }
    public CAR(String m,int mo){// constructor defaultزي   setmaker and setmodel
        maker=m;
        model=mo;
       
    }
     public String getmaker(){
        return maker;//mمينفعش   
    }
     public int getmodel(){
         return model;
     }
     public static int get_number_of_object(){
         return  no_of_objects;
     }
     
     
     
}
