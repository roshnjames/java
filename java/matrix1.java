import java.util.*;

public class matrix1{

public static void main(String []args){
	int arr[][]	;
	int n,m,i,j;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no if rows for the matrix");
	n=s.nextInt();
	System.out.println("Enter no if columns for the matrix");
	m=s.nextInt();
	arr=new int[n][m];
	for(i=0;i<n;i++){
		for(j=0;j<m;j++){
			System.out.println("Enter the new matrix element");
			arr[i][j]=s.nextInt();
		}
	}
	
	System.out.println("\n\nEntered Matrix is as follows\n");
	for(i=0;i<n;i++){
	System.out.println("\n");
		for(j=0;j<m;j++){
			System.out.print(arr[i][j]+" ");
		}
	}
	System.out.println("\n");
	}
}
	
