import java.util.*;
class shape{
	int l,b,r;
	shape(int rad){
		this.r=rad;
	}
	shape(int len,int bre){
		this.l=len;
	
	}

	void display(){
		float area=22/7*this.r*this.r;
		System.out.println("Area of circle is  "+area);
	}
	void display(int bre){
		float area=this.l*bre;
		System.out.println("Area of rectangle is  "+area);
	}
}
public class shapeoverload{
	public static void main(String[] args){
		int r,l,b;
		System.out.println("Enter radius");
		Scanner s=new Scanner(System.in);
		r=s.nextInt();
		System.out.println("Enter length");
		l=s.nextInt();
		System.out.println("Enter breadth");
                b=s.nextInt();
		
		shape obj=new shape(r);
		shape obj1=new shape(l,b);
		obj.display();
		obj1.display(b);
	}
}
