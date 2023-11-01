package cg.com.abstractclass;

//Abstraction performed using extends
class Employee extends Sunstar {
 void printInfo()
 {
     String name = "Ranger";
     int age = 21;
     float salary = 222.2F;

     System.out.println(name);
     System.out.println(age);
     System.out.println(salary);
 }
}