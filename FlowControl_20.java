import java.util.Scanner;
public class FlowControl_20 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n1,n2,option;
	String c;
	do
	{
		
		System.out.println("1.Add \n2.Sub");
		System.out.println("Enter yout option :");
		option=sc.nextInt();
		if(option==1 || option==2) {
			System.out.println("Enter the two numbers :");
			n1=sc.nextInt();
			n2=sc.nextInt();
			if(option==1) {
				System.out.println("Sum :"+(n1+n2));
			}
			else if(option==2)
				System.out.println("Sub :"+(n1-n2));
			else
				System.out.println("Enter valid option .");
		}
		else {
			System.out.println("Entered number is not valid");
			break;
		}
			
		
		System.out.println("Do you want to contine :");
		c=sc.next();
	}while(c.equals("yes"));
	//System.out.println("You cancelled the program .");
	
}	        	
}