import java.util.*; 
class complexno
{
    private int real,imag; 
    public complexno()
    {
        real=0; 
        imag=0;
    }
    public complexno(int i)
    {
        real=i; 
        imag=i;
    }
    public complexno(int a,int b)
    {
        real=a; 
        imag=b;
    }
    public void add(complexno c1, complexno c2)
    {
        real = c1.real+c2.real; 
        imag = c1.imag+c2.imag;
    }
    public void display()
    {
        System.out.println(real+"+"+imag+"i");
    }
}
class Arith_complex
{
    public static void main(String []args)
    {
        Scanner s=new Scanner (System.in); 
        int real,imag;
        System.out.print(" Enter a single value for real and imaginary parts of first complex number : "); 
        real=s.nextInt();
        s.nextLine();
        complexno c1=new complexno(real);
        System.out.print(" First complex number is given by - "); 
        c1.display();
        System.out.println(" Enter different values for real and imaginary parts of second complex number "); 
        System.out.print(" Enter Real Part : ");
        real=s.nextInt();s.nextLine(); 
        System.out.print(" Enter imaginary Part : "); 
        imag=s.nextInt();
        s.nextLine();
        complexno c2=new complexno(real,imag);
        System.out.print(" Second complex number is given by - "); 
        c2.display();
        complexno c3=new complexno();
        System.out.print(" Initially third complex number is - "); 
        c3.display();
        System.out.println(" Storing the result of addition of first and second complex number into third..."); 
        c3.add(c1,c2);
        System.out.print(" Now third complex number is given by - "); 
        c3.display();
    }
}
