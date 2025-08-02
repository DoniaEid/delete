
package projects;

public class rectangle {
    private double length;
    private double width;
    
    public rectangle(){ // القيمه الافتراض constructor
        length=10;
        width=15;
       
    }
    public rectangle (double l,double w){// usei is input default value
        length=l;
        width=w;
    }
    public void setlength(double l){
         length=l;
    }
        public void setwidth( double w){
         width=w;
    }
       public double getlength(){
         return length;
    }  
         public double getwidth(){
         return width;
    }  
    public void modifyobject(rectangle r1){
       r1.length=60;
       r1.width=90;
    }
    public rectangle add (rectangle r2){//بجمع 2 objectةاخزنه في object
        rectangle result=new rectangle();
        result.length=this.length+r2.length;
        result.width=this.width+r2.width;
        return result ;
     } 
     
     public double area(rectangle r3){
         return r3.length*r3.width;
     }
    //comparison
    public boolean isequel(rectangle r1,rectangle r2){
        if(r1.length==r2.length&&r1.width==r2.width){
            return true;
        }
        else{
            return false;
        }
    }
    //copy of constructor
    public rectangle(rectangle source){// copy بنفس فكرهconstructor
        length=source.length;
        width=source.width;
    }
         
}
