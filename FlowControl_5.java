public class FlowControl_5 {
	public static void main(String[] args) 
	{
	char a='r';
	int ascii=a;
	
	if((ascii>=65&&ascii<=90)||(ascii>=97&&ascii<=122))
	{
		System.out.println("alphabets");
	}
	else if(ascii>=48 && ascii<=57)
	{	
	System.out.println("numbers");
	}
	else
	{
		System.out.println("Special Character");
	}
		
	}
}
