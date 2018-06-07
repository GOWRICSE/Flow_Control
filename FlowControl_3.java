
public class FlowControl_3 {
public static void main(String[] args) {
if(args.length==0)
{
	System.out.println("No values ");
}
else
{
	for(int i=0;i<args.length-1;i++)
	{
		args[0]= args[0]+ "," + args[i+1];
	}
}
System.out.println(args[0]);
}
}
