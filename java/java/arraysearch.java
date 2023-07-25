import java.util.Scanner;

public class arraysearch{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ele,loc=-1,flag=0;
        System.out.println("ENter the length of the array");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("Enter the "+i+" element");
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element you want to search");
        ele=s.nextInt();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==ele){
                loc=++i;
                ++flag;
                break;
            }
        }
        if(flag!=0){
            System.out.println("Found at "+loc);
        }else{
            System.out.println("Element not found");
        }

    }
}