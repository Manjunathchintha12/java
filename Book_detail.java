import java.util.Scanner; 
interface Book_info
    {
        void getdata_book(String n,int r); 
        void putdata();
    }
interface Author_info
{
        void getdata_author(String h,String w); 
        void showdata();
}
class Book_detail implements Author_info,Book_info
{
        String authorname,publisher,bookname; 
        int bookno,nopage,year;
        public void getdata_book(String n,int r)
        {
            bookname=n;
            bookno=r;
        }
        public void putdata()
        {
            System.out.println("Book Name\t"+bookname); 
            System.out.println("Book No\t\t"+bookno);
        }
        public void getdata_author(String h,String w)
        {
            authorname=h; 
            publisher=w;
        }
        public void showdata()
        {
            putdata();
            System.out.println("Author name\t"+authorname); 
            System.out.println("Publisher\t"+publisher);
        }

        public void getdata_pub(int p,int y)
        {
            nopage=p; 
            year=y;
        }
        public void display()
        {
            showdata();
            System.out.println("No of Pages\t"+nopage); 
            System.out.println("Year \t\t"+year);
        }
        public static void main(String []args)
        {
            Book_detail b[]=new Book_detail[50]; 
            Scanner s=new Scanner(System.in); 
            System.out.println("Enter number of Books"); 
            int nu=s.nextInt();
            s.nextLine();
            for (int i=0;i<nu;i++)
            {
                b[ i ]=new Book_detail();
                System.out.println("Enter Book "+(i+1)+" Information [bookname,bookno,Authorname,publisher,pages,year]");
                String n=s.nextLine();
                int r=s.nextInt();
                s.nextLine(); 
                b[ i ].getdata_book(n,r); 
                String h=s.nextLine();
                String w=s.nextLine();
                b[ i ].getdata_author(h,w); 
                int p=s.nextInt();
                s.nextLine(); 
                int y=s.nextInt();
                s.nextLine(); 
                b[ i ].getdata_pub(p,y);
            }
            System.out.println("\nBook Database"); 
            for (int i=0;i<nu;i++)
            {
                System.out.println("\n\nBook "+(i+1)); 
                b[ i ].display();
            }
        }
}
