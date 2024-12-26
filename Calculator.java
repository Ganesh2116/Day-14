//1.write a java program to design calculator using switch case for +,-,*,/,% 
// (Ex : + : Addition of two number, - :  Substraction of two number)


import java.util.Scanner;

class Calculator
{	
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("For addition type 1");
	System.out.println("For Substraxction type 2");
	System.out.println("For Multiplation type 3");
	System.out.println("For Division type 4");
	System.out.println("For Modules type 5");
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	System.out.println("Enter the 1st number :");
	int num1 = sc.nextInt();
	System.out.println("Enter the 2st number :");
	int num2 = sc.nextInt();

	switch (num)
	{
	case 1 :
	{
	int add = num1+num2;
	System.out.println("addition is :"+add);
	break;
	}
	case 2 :
	{
	int sub = num1-num2;
	System.out.println("Substration is :"+sub);
	break;
	}
	case 3 :
	{
	int mutil = num1*num2;
	System.out.println("mutilpcation is :"+mutil);
	break;
	}
	case 4:
	{
	int div = num1/num2;
	System.out.println("division is :"+div);
	break;
	}
	case 5:
	{
	int mod = num1%num2;
	System.out.println("Modulus is :"+mod);
	break;
	}
	default : System.out.println("Invalid number ....");

	}
	
	}
}
