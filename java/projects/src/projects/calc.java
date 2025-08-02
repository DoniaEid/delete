

package projects;

public class calc {
    public static int add (int a,int b){
        return a+b;
    }
    
    public static int subtract (int a,int b){
        return a-b;
    }
    public static int multiply (int a,int b){
        return a*b;
    }
    
    public static double area(int l,int w){
       return l*w;
    }
    
    public static void devion(int a,int b){
        if(b!=0){
           System.out.println(a/b);  
        }
        else{
            System.out.println("error, devoisioon by zero not allowed");

        }
        
    }
    
    
    
    
    
}
