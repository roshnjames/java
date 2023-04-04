import java.util.*;
public class fin{
static void fibu(int n)
{
	int a=0,b=1,c;
	//System.out.println(a);
	//System.out.println(b);
	//n=n-2;
	while(n>0)
	{
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
		n--;
	}
}
	
public static void main(String[] args)
{
	System.out.println("Enter limit:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println("fibu :");
	fibu(n);
}
}	
