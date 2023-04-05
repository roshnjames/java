import java.util.*;
public class search{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		int arr[],i,ele,flag=0,loc=-1,size;
		System.out.println("Enter the size of the array");
		size=s.nextInt();
		arr=new int[size];
		for(i=0;i<size;i++){
			System.out.println("ENter new element");
			arr[i]=s.nextInt();
		}
		System.out.println("ENter the element you want to search for");
		ele=s.nextInt();
		for(i=0;i<size;i++){
			if(arr[i]==ele){
				flag=1;
				loc=i+1;
				break;
			}
		}
		if(flag==1){
			System.out.println("element found at location "+loc);
			}
		else{
			System.out.println("element not found");
			}
	}
}
