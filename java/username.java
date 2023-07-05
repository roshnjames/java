import java.util.Scanner;
class avg extends Exception{
avg(String s){
    super(s);
}
}
public class username {
 public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter size:");
    int n =s.nextInt();
    int[] a =new int[n];
    int sum=0,f=0;
    System.out.println("Enter values:");
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        if(a[i]<0){
            try{
                throw new avg("Negative number encountered!!");
            }
            catch(avg e){
                System.out.println(e);
            } 
        }
    }
    for(int i=0;i<a.length;i++){
        sum += a[i];
    }
  
    int averg = sum/n;
    System.out.println(averg);

 }   
}
