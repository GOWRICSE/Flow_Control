public class FlowControl_14 
{
public static void main(String[] args) 
{
	int i,count1=0,num=7;
	int count2=0;
	for(i=2; i<num; i++)
     {
         if(num%i == 0)
         {
             count1++;
             break;
         }
     }
	if((num%2 ==0) || (num%3 ==0) || (num%5 ==0)) 
	{
	count2++;	
	}
     if(count1 == 0)
     {
    	 if(count2 !=0 || num==0 || num==1)
    	 {
         System.out.print(num+" is either Prime Number nor composite number.");
    	 }
    	 else
    	 {
    		 System.out.println(num+" is prime number");
    	 }
     }
     else
     {
         System.out.print(num+" is not a Prime Number");
     }
}
		
}

