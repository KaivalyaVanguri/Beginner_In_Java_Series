import java.util.Scanner;
class Student1
{int rno;
 double cgpa;
 int age=18;
 
 Student1()
 { System.out.println(" Constructor invoked");
   Scanner scan=new Scanner(System.in);
    System.out.println("Enter rno, cgpa :");
    rno=scan.nextInt();
    cgpa=scan.nextDouble();
    //age=scan.nextInt();
 } 
 Student1(int x, double y)
 {rno=x;
  cgpa=y;
   } 
 Student1(int x, double y, int z)
 {rno=x;
  cgpa=y;
  age=z;
  }
  void display()
 {System.out.println(" rno :"+rno);
  System.out.println(" cgpa :"+cgpa);
  System.out.println(" age :"+age);
 }
 
 public static void main(String args[])
 { Student1 s1=new Student1(10,9.8);
   s1.display();
   Student1 s2=new Student1(11,8.7,19);
   s2.display();
   Student1 s3=new Student1();
   s3.display();

 }

}