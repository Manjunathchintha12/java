import java.util.Scanner;
public class ElectricityBill
{
	public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter The Consumer ID : ");
int consumer_no = sc.nextInt();
System.out.println("Enter The Consumer Name : ");
String consumer_name = sc.next();
System.out.println("Enter The Prev Reading : ");
int previous_reading = sc.nextInt();
System.out.println("Enter the Current Reading : ");
int current_reading = sc.nextInt();
int meter_reading = current_reading - previous_reading;
System.out.println("Enter The Type of EB connection in Numbers ( 1) Domestic / 2)  Commercial ) ");
int connection_type = sc.nextInt();
int choice;
double bill_amount = 0;
if(connection_type == 1)
{
	choice = 1;
}
else
{
	choice = 2;
}
switch(choice)
{
case 1:
if(meter_reading>=0 && meter_reading<=100)
{
	bill_amount = meter_reading*1;
}
else if(meter_reading>100 && meter_reading<=200)
{
	bill_amount = ((100*1)+(meter_reading-100)*2.5);
}
else if(meter_reading>200 && meter_reading<=500)
{
	bill_amount = ((100*1)+(100*2.5)+(meter_reading-200)*4);
}
else
{
	bill_amount = ((100*1)+(100*2.5)+(100*4)+(meter_reading-500)*6);
}
break;
case 2:
if(meter_reading>=0 && meter_reading<=100)
{
	bill_amount = meter_reading*2;
}
else if(meter_reading>100 && meter_reading<=200)
{
	bill_amount = ((100*2)+(meter_reading-100)*4.5);
}
else if(meter_reading>200 && meter_reading<=500)
{
	bill_amount = ((100*2)+(100*4.5)+(meter_reading-200)*6);
}
else
{
	bill_amount = ((100*2)+(100*4.5)+(100*6)+(meter_reading-500)*7);
}
break;
}
String total = Double.toString(bill_amount);
System.out.println("--------------------------------");
System.out.println(" Electricity Bill ");
System.out.println("--------------------------------");
System.out.println("Consumer No : " +consumer_no);
System.out.println("Consumer Name : " +consumer_name);
System.out.println("Previous reading : " +previous_reading);
System.out.println("Current Reading : " +current_reading);
System.out.println("Meter Reading : " +meter_reading);
System.out.println("Connection Type : " +connection_type);
System.out.println("*****************************************");
System.out.println("The Bill Amount : " +total);
}
}
