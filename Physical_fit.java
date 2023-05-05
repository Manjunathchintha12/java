import java.util.Scanner; 
class Basic_info
{
    String name,gender; 
int roll_no;
    public void getdata_info(String n,int r,String g)
    {
        name=n; roll_no=r; gender=g;
    }
    public void display_info()
    {
        System.out.println("Student Name\t"+name); 
        System.out.println("Student Roll No\t"+roll_no); 
        System.out.println("Student Gender\t"+gender);
    }
 
}
class Physical_fit extends Basic_info
{
    int height,weight;
    public void getdata_fit(int h,int w)
    {
        height=h; weight=w;
    }
    public void display_fit()
    {
        display_info();
        System.out.println("Student Height\t"+height); 
        System.out.println("Student weight\t"+weight);
    }
    public static void main(String []args)
    {
        Physical_fit   p[]=new   Physical_fit[50]; 
        Scanner s=new Scanner(System.in); 
        System.out.println("Enter number of Student"); 
        int nu=s.nextInt();
        s.nextLine();
        for (int i=0;i<nu;i++)
        {
            p[ i ]=new Physical_fit();
            System.out.println("Enter Student "+(i+1)+" Information [name,roll,gender,height,weight]"); 
            String n=s.nextLine();
            int r=s.nextInt();
            s.nextLine(); 
            String g=s.nextLine();
            p[ i ].getdata_info(n,r,g);
            int h=s.nextInt();
            s.nextLine();
            int w=s.nextInt();
            s.nextLine(); 
            p[ i ].getdata_fit(h,w);
        }
        System.out.println("\nStudent Database"); 
        for (int i=0;i<nu;i++)
        {
            System.out.println("\n\nStudent "+(i+1)); 
            p[ i ].display_fit();
        }
    }
}
