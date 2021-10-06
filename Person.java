import java.io.*;
import java.util.scanner;
class Person
{
 String na;
 String ge;
 String ad;
 int age;
 void Person(String na,String ge,String ad,int age)
  { 
  System.out.println("enter the name "+na);
  System.out.println("enter the gender "+ge);
  System.out.println("enter the address "+ad);
  System.out.println("enter the age "+age);
  }  
}
class Employee extends Person
{
 int eid;
 String cname;
 String qu;
 int sa;
 void Employee(int eid,String cname,String qu,int sa)
 {
  System.out.println("enter employee id "+eid);
  System.out.println("enter the company name "+cname);
  System.out.println("enter the qualification "+qu);
  System.out.println("enter the salary "+sa);
 }
}
class Teacher extends Employee
{
 String sub;
 String dep;
 int tid;
 void Teacher(String sub,String dep,int tid)
 {
  System.out.println("enter the subject "+sub);
  System.out.println("enter the department "+dep);
  System.out.println("enter the teacher id"+tid);
 } 
}
public static void main(String[] args)
 {
  void Person()
  {
   Main ob=new Main();
   ob.Person(String na,String ge,String ad,int age);
   ob.Employee(int eid,String cname,String qu,int sa);
   ob.Teacher(String sub,String dep,int tid);
  }
}  
    
