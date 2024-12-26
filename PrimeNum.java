// prime number 

import java.util.Scanner;

class PrimeNum
{
	public static void main(String[] arge )
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	int i =1;
	int c =0;
	while(i <= num)
	{
	if(num % i == 0)
	{
	c++;
	}
	i++;
	}

	if ( c == 2)
	{
	System.out.println("This is prime number...");
	}else 
	{
	System.out.println("This is not prime number...");
	}

	}
}