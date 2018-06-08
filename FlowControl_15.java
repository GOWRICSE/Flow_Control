import java.util.Scanner;
public class FlowControl_15
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,i;
		for(i=0;n>0;i++)
		{
			count=count + (n%10);
			n=n/10;
		}
		System.out.println(count);
		}
}