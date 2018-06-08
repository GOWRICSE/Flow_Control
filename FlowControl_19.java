public class FlowControl_19 
{
public static void main(String[] args) 
{
	int i,count=5;
	for(i=1;count!=0;i++)
	{
		if(i%2==0 && i%3==0 && i%5==0)
		{
			System.out.print(i+" ");
			count--;
		}
	}	
}}