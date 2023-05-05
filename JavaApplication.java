import java.util.Scanner; 
class Person
{
Scanner input=new Scanner(System.in); 
int age;
String Name; String gender; 
void getdatap()
{
System.out.println("Enter age,name,gender"); 
age =input.nextInt();
input.nextLine(); 
Name=input.nextLine(); 
gender =input.nextLine();
}
}
class Student extends Person
{
int regno;
double CGPA; 
String dept; 
void getdatas()
{
System.out.println("Enter reg_no. ,CGPA,department of student: "); 
regno =input.nextInt();
CGPA=input.nextDouble(); 
input.nextLine();
dept =input.nextLine();
}
}
class Teacher extends Person
{
int Salary; String Subject; void getdatat()
{
System.out.println("enter salary,subject of teacher"); 
Salary =input.nextInt();
 input.nextLine(); 
Subject=input.nextLine();
}
void displayt()
{
System.out.println("Teacher's info: "); 
System.out.println("Age of teacher is "+age); 
System.out.println("Name of teacheris "+Name); 
System.out.println("Gender of teacher is "+gender); 
System.out.println("Salary is "+Salary); 
System.out.println("Subject is "+Subject);
}
}
class CollegeStudent extends Student
{
String majors; 
int Currentyear; 
void getdatacs()
{
System.out.println("Enter major subject and Current year of college student: "); 
majors=input.nextLine();
Currentyear=input.nextInt();
}
void displaycs()
{
System.out.println("Students info: "); 
System.out.println("Registration number is "+regno); 
System.out.println("CGPA of student is "+CGPA); 
System.out.println("Department of student is "+dept); 
System.out.println("Major subject is"+majors); 
System.out.println("Current year is "+Currentyear);
}
}
public class JavaApplication
{
public static void main(String[] args)
{
Teacher t=new Teacher();
t.getdatap();
t.getdatat();
CollegeStudent s=new CollegeStudent(); 
s.getdatas();
s.getdatacs(); 
t.displayt();
System.out.println("********************"); 
s.displaycs();
}
} 
