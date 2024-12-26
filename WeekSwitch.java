import java.util.Scanner;
	
class WeekSwitch
{

	public static void main(String[] age){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your choice:");
	int num = sc.nextInt();

	switch(num)
 {
	case 1: System.out.println("sunday");
	break;
	case 2: System.out.println("monday");
	break;

	case 3: System.out.println("tuesday");
	break;

	case 4: System.out.println("wednday");
	break;
	case 5: System.out.println("thesday");
	break;
	case 6: System.out.println("firday");
	break;
	case 7: System.out.println("satrday");
	break;
	default:System.out.println("Invaild number...");

}
	}	
}
