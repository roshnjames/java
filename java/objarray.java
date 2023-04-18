import java.util.*;
class employee{
	int empid;
	string name;
        float salary;
	string address;
        employee(int id,string name,float sal,string add){
		this.empid=id;
		this.name=name;
		this.salary=sal;
		this.add=address;
	}
	
	void display(){
		System.out.println("Employee id :"+this.empid+"EMployee name :"+this.name);
		System.out.println("Employee salary :"+this.salary+"EMployee address :"+this.address);
	}
}

class teacher extends employee{
	string department,subject;
	teacher(string dep,string sub){
		super();
		this.department=dep;
		this.subject=sub;
	}
	
	void display(){
		System.out.println("Teacher's department :"+this.department+"Teacher's subject :"+this.subject);
	}
}

public class objarray{
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("ENter no of teachers");
		n=s.nextInt();
                for(int i=0;i<n;i++){
			teacher obj[i]=new teacher
