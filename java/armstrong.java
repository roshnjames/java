import java.util.*;

public class armstrong{

public static void main(String []args){
	Scanner s=new Scanner(System.in);
	int n,m,d,sum=0;
	System.out.println("Enter a number");
	n=s.nextInt();
	m=n;
	while(m>0){
		d=m%10;
		sum=sum+(d*d*d);
		m=m/10;
		}
		
	if(sum==n){
	System.out.println("It is an Armstrong Numnber");
	}
	else{
	System.out.println("It is not an Armstrong Numnber");
	}
        }
	}
		

