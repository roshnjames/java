import java.util.Scanner;

class student{
    String name;
    int roll;
    float mark;
    student(String n,int r,float m){
        this.name=n;
        this.roll=r;
        this.mark=m;
    }
    public void display(){
        System.out.println("Student name :"+this.name+"\nRoll no. :"+this.roll+"\nMarks :"+this.mark);
    }
}

public class arrobjs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,r,i;
        String name;
        float m;
        System.out.println("Enter no of students");
        n=s.nextInt();
        student arr[]=new student[n];
        for (i=0;i<n;i++){
            System.out.println("Enter name");
            name=s.next();
            System.out.println("ENter roll no");
            r=s.nextInt();
            System.out.println("Enter marks");
            m=s.nextFloat();
            arr[i]=new student(name,r,m);
        }

        for (i=0;i<n;i++){
            arr[i].display();
        }

    }
    
}
