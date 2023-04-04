import java.util.*;

public class sort{

public static void main(String []args){
	int n,i,j,temp;
	System.out.println("Enter the limit of Array");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements of Array");
	for(i=0;i<n;i++){
		System.out.println("Enter the new element of Array");
		arr[i]=s.nextInt();
	}
	
	for(i=0;i<n;i++){
		System.out.print(" "+arr[i]);
	}
	
	for(i=0;i<n;i++){
		for(j=0;j<n-i-1;j++){
			if(arr[j]>arr[j+1]){
				temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		}
	}
	System.out.println("\nSorted array is :");
	for(i=0;i<n;i++){
		System.out.print(" "+arr[i]);
	}
	
	System.out.println();
	}
}
	
	
