public class FlowControl_7 
{
public static void main(String[] args) 
{
String str="A";
char alpha=str.charAt(0);
int ascii = alpha;
if(ascii>=97 && ascii<=122)
{
	System.out.println(str.toUpperCase());
}
else if(ascii>=65 && ascii<=90)
{
	System.out.println(str.toLowerCase());
}
}
}
