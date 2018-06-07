public class FlowControl_12 
{
public static void main(String[] args) 
{
	int num=15;
	int i;
	int count=0;
	 for(i=2; i<num; i++)
     {
         if(num%i == 0)
         {
             count++;
             break;
         }
     }
     if(count == 0)
     {
         System.out.print(num+" is a Prime Number");
     }
     else
     {
         System.out.print(num+" is not a Prime Number");
     }
}
}