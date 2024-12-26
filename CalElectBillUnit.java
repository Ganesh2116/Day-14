// 21. Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:

//For first 50 units Rs. 0.50/unit
//For next 150 units Rs. 0.75/unit
//For next 250 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill


import java.util.Scanner;

class CalElectBillUnit
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your electricity units:");
	int units = sc.nextInt();
	
	// unit*0.5= // 50*0.5 = 25*20/100 = 5;
	if (units <= 50)
	{
	Double peru = units*0.5 ;
	Double surchag = peru*20/100;
	System.out.println("Total electricity bill surchanges is :"+surchag);
	}
	else if (units <= 150)
	{
	Double peru = units*1.2 ;
	Double surchag = peru*20/100;
	System.out.println("Total electricity bill surchanges is :"+surchag);
	}
	else if (units >= 250)
	{
	Double peru = units*1.5 ;
	Double surchag = peru*20/100;
	System.out.println("Total electricity bill surchanges is :" + surchag);
	}	
	
	}
}