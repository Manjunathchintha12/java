import java.util.*; 
class student
{
    private String name,branch,gender; 
    private int age,roll,m1,m2,m3,m4,m5,per;
    student()
    {
        Scanner s=new Scanner (System.in); 
        System.out.print("Enter roll no. : "); 
        roll=s.nextInt();
        s.nextLine();
        System.out.print("Enter name : "); 
        name=s.next();
        s.nextLine();
        System.out.print("Enter branch : "); 
        branch=s.next();
        s.nextLine();
 
        System.out.print("Enter gender : "); 
        gender=s.next();
        s.nextLine();
        System.out.print("Enter age : "); 
        age=s.nextInt();
        s.nextLine();
        System.out.println("Enter marks of 5 subjects : ");
        m1=s.nextInt();
        s.nextLine(); 
        m2=s.nextInt();
        s.nextLine(); 
        m3=s.nextInt();
        s.nextLine(); 
        m4=s.nextInt();
        s.nextLine(); 
        m5=s.nextInt();
        s.nextLine();
        per=(m1+m2+m3+m4+m5)*100/500;
        System.out.println("Percentage is : "+per);
    }
    public void print()
    {
        if(per>70)
        {
            System.out.println("Name is : "+name); 
            System.out.println("Roll no is : "+roll);
        }
    }
}
class Grade
{
    public static void main(String []args)
    {
        Scanner s=new Scanner (System.in); 
        System.out.print("Enter the number of students : "); 
        int n=s.nextInt();
        s.nextLine();
        student stu[]=new student[n];
        for(int i=0;i<n;i++)
        {
            stu[i]=new student(); 
            System.out.println("********************************************");
        }
        System.out.println("STUDENT EXCELLENCE LIST :"); 
        for(int i=0;i<n;i++)
        {
            stu[i].print();
       }
    }}
