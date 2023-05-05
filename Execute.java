import java.util.Scanner;
class Student
{
int id;
String name;
String branch;
int year;
void getData(int a,String b,String c,int d)
{
id=a;
name=b;
branch=c;
year=d;
}
void Avg(int a,int b,int c,int d,int e,int f)
{
float avg;
avg=(a+b+c+d+e+f)/6;
System.out.println("Average is: " +avg);
}
void Percentage(float a,float b)
{
float perc;
perc=(a/b)*100;
System.out.println("Percentage is: " +perc);
}
}
class Execute
{
public static void main(String args[])
{
Student st=new Student();
Scanner s=new Scanner(System.in);
System.out.println("enter ID,name,branch,year");
st.getData(s.nextInt(),s.next(),s.next(),s.nextInt());
System.out.println("enter 6 subject marks");
st.Avg(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt());
System.out.println("enter the present and total working days");
st.Percentage(s.nextFloat(),s.nextFloat());
}
}
