import java.util.Scanner;

public class FlowControl_1 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==0) {
			System.out.println(n+" is Zero.");
		}
		else if(n>0)
		{
			System.out.println(n+" is positive.");
		}
		else 
		{
			System.out.println(n+" is negative.");
		}
	}	
}
