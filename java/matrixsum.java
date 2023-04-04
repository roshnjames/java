import java.util.*;

public class matrixsum{

public static void main(String []args){
	int arr1[][],arr2[][],arr3[][];
	int n,m,i,j;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no if rows for the matrix");
	n=s.nextInt();
	System.out.println("Enter no if columns for the matrix");
	m=s.nextInt();
	arr1=new int[n][m];
	arr2=new int[n][m];
	arr3=new int[n][m];
	for(i=0;i<n;i++){
		for(j=0;j<m;j++){
			System.out.println("Enter the new element for first matrix ");
			arr1[i][j]=s.nextInt();
		}
	}
	
	System.out.println("\n\nEnter Second Matrix elements\n");
	for(i=0;i<n;i++){
		for(j=0;j<m;j++){
			System.out.println("Enter the new element for Second matrix");
			arr2[i][j]=s.nextInt();
		}
	}
	
	System.out.println("The new Matrix formed is:");
	for(i=0;i<n;i++){ 
	System.out.println("\n");
		for(j=0;j<m;j++){
			
			arr3[i][j]=arr1[i][j]+arr2[i][j];
			System.out.print(arr3[i][j]+" ");
		}
	}
	System.out.println("\n");
	}
}
	
