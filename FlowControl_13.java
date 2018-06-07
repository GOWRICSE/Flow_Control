public class FlowControl_13
{
public static void main(String[] args) 
{
int i,num,count;
for(num=10;num<=99;num++)
{
	count=0;
	for(i=2; i<num; i++)
    {
		count=0;
        if(num%i == 0)
        {
            count++;
            break;
        }
    }
	if(count==0)
	{
		System.out.println(num);
	}
}
}
}
