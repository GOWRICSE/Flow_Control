import java.util.Scanner;
public class FlowControl_4
{
	public static void main(String[] args) 
	{
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter Characters :");
		 String s1=sc.next();
		 String s2=sc.next();
		 char ch1=s1.charAt(0);
		 char ch2=s2.charAt(0);
	     int ascii1 = (int) ch1;
	     int ascii2 = (int) ch2;
	     System.out.println("Ordered Characters are :");
	     if(ascii1<ascii2)
	     {
	    	 System.out.println(ch1+","+ch2);
	     }
	     else
	     {
	    	 System.out.println(ch2+","+ch1);
	     }
	}
}