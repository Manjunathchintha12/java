import java.util.*;
 class employee
{
int empid; long mobile;
String name, address, email;
Scanner get = new Scanner(System.in); 
void getdata()
{
System.out.print("Enter Name of the Employee: "); 
name = get.nextLine();
System.out.print("Enter Employee E-mail id: "); 
email = get.nextLine();
System.out.print("Enter Address of the Employee: "); 
address = get.nextLine();
System.out.print("Enter Employee id: "); 
empid = get.nextInt(); 
System.out.print("Enter Mobile Number: "); 
mobile = get.nextLong();
}
void display()
{
System.out.println("************************************************");
 System.out.println("Employee Information");
System.out.println("************************************************"); 
System.out.println("Employee Name: "+name);
System.out.println("Employee id: "+empid); 
System.out.println("Mail id: "+email); 
System.out.println("Address: "+address); 
System.out.println("Mobile Number: "+mobile); 
System.out.println("\n");
}
}
class developer extends employee
{
double salary, bp, da, hra, pf, ta, net, gross;
 void getdeveloper()
{
System.out.print("Enter Your Basic pay: ");
 bp = get.nextDouble();
}
void calculatedev()
{
da=(0.15*bp); 
hra=(0.20*bp); 
pf=(0.12*bp);
ta=(0.1*bp); 
gross=(bp+da+hra); 
net=(gross-pf-ta);
System.out.println("************************************************");
System.out.println("PAY SLIP FOR Developer"); System.out.println("************************************************"); 
System.out.println("Basic Pay:Rs"+bp);
System.out.println("DA:Rs"+da);
System.out.println("PF:Rs"+pf); 
System.out.println("HRA:Rs"+hra); 
System.out.println("ta:Rs"+ta); 
System.out.println("GROSS PAY:Rs"+gross); 
System.out.println("NET PAY:Rs"+net);
}
}
class manager extends employee
{
double salary, bp, da, hra, pf, ta, net, gross; 
void getmanage()
{
System.out.print("Enter Your Basic pay: ");
 bp = get.nextDouble();
}
void calculatemng()
{
da=(0.15*bp);
 hra=(0.20*bp); 
pf=(0.12*bp);
ta=(0.1*bp); 
gross=(bp+da+hra);
net=(gross-pf-ta);
System.out.println("************************************************"); System.out.println("PAY SLIP FOR Manager");
System.out.println("************************************************"); 
System.out.println("Basic Pay:Rs"+bp);
System.out.println("DA:Rs"+da); 
System.out.println("HRA:Rs"+hra); 
System.out.println("PF:Rs"+pf);
System.out.println("ta:Rs"+ta); 
System.out.println("GROSS PAY:Rs"+gross); 
System.out.println("NET PAY:Rs"+net);
}
}
class designer extends employee
{
double salary, bp, da, hra, pf, ta, net, gross; 
void getdesign()
{
System.out.print("Enter Your Basic pay: "); 
bp = get.nextDouble();
}
void calculatedesign()
{
da=(0.15*bp); 
hra=(0.20*bp); 
pf=(0.12*bp);
ta=(0.1*bp); 
gross=(bp+da+hra); 
net=(gross-pf-ta);
System.out.println("************************************************"); System.out.println("PAY SLIP FOR Designer"); System.out.println("************************************************"); System.out.println("Basic Pay:Rs"+bp);
System.out.println("DA:Rs"+da); 
System.out.println("HRA:Rs"+hra); 
System.out.println("PF:Rs"+pf); 
System.out.println("ta:Rs"+ta); 
System.out.println("GROSS PAY:Rs"+gross);
System.out.println("NET PAY:Rs"+net);
}
}
class accountant extends employee
{
double salary, bp, da, hra, pf, ta, net, gross;
 void getaccountant()
{
System.out.print("Enter Your Basic pay: "); 
bp = get.nextDouble();
}
void calculateaccountant()
{
da=(0.15*bp); 
hra=(0.20*bp); 
pf=(0.12*bp);
ta=(0.1*bp); 
gross=(bp+da+hra); 
net=(gross-pf-ta);
System.out.println("************************************************"); System.out.println("PAY SLIP FOR Accountant"); System.out.println("************************************************"); System.out.println("Basic Pay:Rs"+bp);
System.out.println("DA:Rs"+da); 
System.out.println("HRA:Rs"+hra);
System.out.println("PF:Rs"+pf); 
System.out.println("ta:Rs"+ta); 
System.out.println("GROSS PAY:Rs"+gross); 
System.out.println("NET PAY:Rs"+net);
}

}
class Payslip
{
public static void main(String args[])
{
int choice,cont; 
do
{
System.out.println("\n");
System.out.println("***** Welcome to MBU Payroll Management System *****"); 
System.out.println("\n");
System.out.println(" 1. Developer \t 2. Manager \t 3. Designer \t 4. Accountant"); 
Scanner c = new Scanner(System.in);
choice=c.nextInt(); 
switch(choice)
{
case 1:
{
developer dev=new developer(); 
dev.getdata(); 
dev.getdeveloper(); 
dev.display(); 
dev.calculatedev();
break;
}
case 2:

{
manager mng=new manager(); 
mng.getdata(); 
mng.getmanage();
mng.display(); 
mng.calculatemng(); 
break;
}
case 3:
{
designer design=new designer();
 design.getdata(); 
design.getdesign(); 
design.display(); 
design.calculatedesign();
break;
}
case 4:
{
accountant acc=new accountant(); acc.getdata();
acc.getaccountant(); 
acc.display(); 
acc.calculateaccountant();
 break;
}
			}
System.out.println("Do you want to quit press 0 to quit and press 1 to continue "); 
cont=c.nextInt();
}while(cont==1);
	}	
}
