import java.util.Scanner;

public class FlowControl_18 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=num;
	int rev=0;
	while(num!=0)
	{
		rev =rev*10;
		rev=rev+num%10;
		num =num/10;
	}
	if(n==rev)
		{
			System.out.println(n+" is palindrome.");
		}
		else
		{
			System.out.println(n+" is not a palindrome.");
		}  
}}