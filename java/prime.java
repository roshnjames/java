import java.util.*;

public class prime{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num,i=1,flag=0;
		num = sc.nextInt();
		while(i<=num/2){
			if(i == 1){
				i++;
				flag = 1;
				continue;
			}
			else if(num%i == 0){
				System.out.println(num+" is not a prime number.");
				break;
			}
			else{
				i++;
				flag = 1;
			}
			
		}
		
		if(flag == 1){
			System.out.println(num+" is a prime number.");
		}
	}
}
