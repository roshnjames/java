import java.util.*;
public class fact{
static void factorial(int n){
	int f=1,i=1;
	while(i<=n){
	f=f*i;
	i=i+1;
	}
	System.out.println("Factorial is "+f);
}

public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	factorial(n);
	}
}
