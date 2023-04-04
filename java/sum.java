import java.util.*;
public class sum{
public static void fibu(int n)
{
	int a=0,b=1,c=a+b;
	System.out.println(a);
	System.out.println(b);
	n=n-2;
	while(n>0)
	{
		System.out.println(c);
		a=b;
		b=c;
		c=a+b;
		n--;
	}
}
	
public static void main(String[] args)
{
	System.out.println("Enter limit:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	fibu(n);
}}
	
