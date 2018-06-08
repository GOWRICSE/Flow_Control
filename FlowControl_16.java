import java.util.Scanner;
public class FlowControl_16 
{
private static Scanner sc;
public static void main(String[] args) 
{
	int i,j,n;
	sc = new Scanner(System.in);
	n=sc.nextInt();
	if(n>=1)
	{
	for(i=0;i<n;i++)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	else
	{
		System.out.println("enter in numbers.");
	}
}	
}