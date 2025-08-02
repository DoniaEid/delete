
package projects;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
public class Projects {
  
    public static void main(String[] args) {
     

//       rectangle r1=new rectangle();
//       System.out.println("length defualt r1:"+r1.getlength()); 
//       System.out.println("width  defualt r1:"+r1.getwidth()); 
//       
//       System.out.println("");
//       
//      rectangle r3 =new rectangle(30,50);
//      System.out.println("length defualt r3:"+r3.getlength()); 
//      System.out.println("width  defualt r3:"+r3.getwidth()); 
//       
//       System.out.println("");
//       
//       CAR c1=new CAR();
//       System.out.println("maker c1 defualt is:"+c1.getmaker()); 
//       System.out.println("model c1 defualt is:"+c1.getmodel());
//       
//       System.out.println("");
//       
//       CAR c2=new CAR("hoho",2013);
//       System.out.println("maker c2 defualt is:"+c2.getmaker()); 
//       System.out.println("model c2 defualt is:"+c2.getmodel()); 
//       
//       System.out.println("");
//       
//       Employee e1=new Employee();
//       e1.print_emp_data();
//       
//       System.out.println("");
//       
//       Employee e2=new Employee(900,"Donia",false);
//       e2.print_emp_data();
//       
//       System.out.println("");
//       
//       Employee e3=new Employee(1000,"yassen",490,7000,"acounting",true);//constructor is in all data
//       e3.print_emp_data();
//       System.out.println("");
//       e3.setsalary(7000,500);// هيعدل علي القيم القديمه
//       e3.print_emp_data();
//       
//       System.out.println("");
//       
//       bankacount a1=new bankacount("Donia",20240336,2300000);
//       a1.printinfo();
//       System.out.println("Statues:"+a1.calc(2300000));
//       System.out.println("");
//       
//       bankacount a2=new bankacount("mama",20240330,230);
//       a2.printinfo();
//       System.out.println("Statues:"+a2.calc(230));
//
//      ............. lecture 4 static methode and static value and count the object..............
//
//       CAR c1=new CAR();
//       CAR c2=new CAR();
//       CAR c3=new CAR();
//       CAR c4=new CAR();
//       CAR c5=new CAR();
//    calc c1=new calc();
//       System.out.println("number of object:"+CAR.get_number_of_object());
//       System.out.println("add two number:"+c1.add(2,7)) ;
//       System.out.println("sub two number:"+c1.subtract(2,7)) ;
//       System.out.println("mult two number:"+c1.multiply(2,7));//بيتم استدخدمهم مباشره من class rectangle room1 = new rectangle();
//
//    ........... lecture 5 passing object is argument and comparing object...................
//         rectangle room=new rectangle(50,10);
//         room.modifyobject(room);
//         System.out.println(room.getlength());
//         System.out.println(room.getwidth());
//    
//         
//         rectangle r1=new rectangle(20,50);
//         rectangle r2=new rectangle(90,30);
//         r1.add(r2); //علشان this 
//         System.out.println("add two length r1+r2:"+r1.add(r2).getlength());
//         System.out.println("add two width  r1+r2:"+r1.add(r2).getwidth());
//      
//         System.out.println("area of rectangle1:"+r1.area(r1));
//         System.out.println("area of rectangle2:"+r2.area(r2));
//         
//           rectangle r1=new rectangle(10,50);
//           rectangle r2=new rectangle(10,50);
//           r2=r1;//علشان r1==r2 مهمه اوي بجد اي تعديل هيسمع في الثاني
//           r2.setlength(200);
//           System.out.println("length r1:"+r1.getlength()); 
//           
//           if(r1==r2){//الحاله ديه هتنفع لو السطر الي قبله مفع 
//                System.out.println("The objects are equel");
//           }
//           else{
//               System.out.println("The objects are different");
//           }
//           rectangle result =new rectangle ();
//           if(result.isequel(r1,r2)){
//               System.out.println("The objects are equel");
//           }
//
//           else{
//               System.out.println("The objects are different");
//           }
//        copy two object الطريقه ديه بتنسخ المحتوي وليس address
//             rectangle r1=new rectangle(23,67);
//             rectangle copy=new rectangle(r1);
//             System.out.println("length copy r1:"+copy.getlength()); 
//             System.out.println("width  copy r1:"+copy.getwidth()); 
//
//        .......... lecture 6  inheritance اهم محاضرهgeneral class(base class)and special class(sub class && drived class)..........
//
//                student std1 = new student("ahmed",18,"riyad","saudi",5,"is",3.8);
//                System.out.println("name:"+std1.getname());
//                System.out.println("nationality:"+std1.getnationality());
//                student std2=new student();// automatic هيستدعي default constructor بتاع base class هنا هينفز الرساله بتاعت  super ثم sub2
//
//          overriding معنها التغطيه علي الي فات sub class methode عملت  overriding علي super class methode
//                 salary_employee emp1=new salary_employee("Donia",19,"egypt","misr",3000,"manigor","doctor",500,100);
//                 System.out.println("salary is employee:"+  emp1.Salary());
//                 employee_person emp2=new  employee_person("ahmed",18,"riyad","saudi",2000,"is","eng");
//                 emp1.print_all_details();
//            
//
//                referance type &&object type
//                  employee_person e1=new  employee_person ("ahmed",18,"riyad","saudi",3000,"is","eng");
//                  employee_person e2=new  salary_employee ("ahmed",18,"riyad","saudi",3000,"is","eng",500,100);
//                  System.out.println(e1.getSalary());
//                  System.out.println(e2.getSalary());
//             protrcted attribute
//                shape sh1 = new shape(12, 12);//في نفس الوقت الاري الي تحت هتغطي عليها 
//                small_shape sh2 = new small_shape(sh1); // هيتنفذ لأن في constructor بدون باراميتر
//                System.out.println("Area of sh2 = " + sh2.area());
//                small_shape sh3 = new small_shape(5, 6);
//                System.out.println("Area of sh3 = " + sh3.area());
//                  car_ c1=new car_(12.4,"viva");
//                  c1.displayInfo();                
//                  car_ c1=new car_(); // هتطبع القيمه الي في constructor الافتراضي الاول in super class وبعدين القيمه الي في sub class بتطبع
                    
//         ............ lecture 7 abstract class interfaces ..........
//                   ......abstract
//             Employee e1=new Employee();// مينفعش اخد منه object
//               salary_employee em1=new salary_employee("ahmed",18,"riyad","saudi",3000,"is","eng",500,100);
//               System.out.println(em1.getSalary());
//                     .....interface
//               retailitem r=new retailitem();//مينفعش اخد object من interface زي abstruct
//                    cd c=new cd(345,"opo","ioo");
//                    c.getitemprice();
//                    retailitem r=new cd();// object type
//                    r.getitemprice();// لازم تكون متعرفه في interface class زي محنا متعودين في الشرح الي فات
//                    System.out.println(r.getTitle()) ;
//                    displayable r=new cd(345,"opo","ioo");// object type
//                    r.display(); // متعرفه في sub class and interface
//                        ...... fields in interface             
//                            displayable r=new cd(345,"opo","ioo");// object type
//                            r.display();
//               .........  lecture 8  enum ...........
//                   course c1=course.math;
//                   course c2=course.math;
//                   registerform e1=new registerform();
//                   System.out.println(e1.getStdname());
//                   
//                   // methode of enum: tostring && ordinal && compareto && equels
//                   System.out.println(c1.toString());// هتطلع القيمه زات نفسها 
//                   System.out.println(c1.ordinal());// هتطلع الرقم بتاع القيمه
//                   System.out.println(c1.compareTo(c2));// هتقارن بينهم كقيم 
//                   System.out.println(c1.equals(c2));// النتيجه true or false

//             .............. lecture9 exeption handling............
//                   try{
//                     int x,y;
//                     Scanner s=new Scanner(System.in);
//                     System .out.println("Enter x");
//                     x=s.nextInt();
//                     System .out.println("Enter y");
//                     y=s.nextInt();
//                     System.out.println(x/y);
//                   }
//                
//                   catch (Exception e){// ينفع اكتر من  catch عادي
//                       System.out.println(e.getMessage());
//                   }
//                   //the same result//
//                   calc.devion(10, 0);


//     .............ArrayList lecture 10...........

ArrayList<String> list=new ArrayList <String>();
         list.add("Ahmed");
         list.add("donia");
         list.add("fofo");
         System.out.println("size of array:"+list.size());// طباعه الحجم
         System.out.println(list.get(2));// طباعه اليست كلها
         list.add(1,"sagda");// اضافه قيمه في مكان معين
         System.out.println("size of array:"+list);// طباعه اليست كله بعد الاضافها
         list.set(3,"mostafa");//تغيير قيمه محدده
         System.out.println("size of array:"+list);// طباعه اليست كله بعد الاضافها
         list.remove(3);// حزف قيمه محدده
         System.out.println(list);// طباعه اليست كلها
         list.clear();// هيحزف كل حاجه في الليست
         System.out.println(list);// طباعه اليست كلها فاضيه
























    }
}   
