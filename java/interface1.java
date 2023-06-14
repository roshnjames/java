import java.util.*;


interface shape{
	public void area();
	public void peri();
	}



class circle implements shape{
	
	public void area(){
		double carea;
		double r;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius:");
		r=s.nextDouble();
		carea=3.14*r*r;
		System.out.println("Area ="+carea);
	}
	// public void perimeter(double r){
	// 	double c_p = 2*3.14*r;
	// 	System.out.println("Perimeter ="+c_p); 
	// }
}
	
	
	
class rectangle implements shape{
	public void area(){
		int l,b,recarea;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length:");
	    l = s.nextInt();
		System.out.println("Enter breadth:");
		b = s.nextInt();
		recarea=l*b;
	System.out.println("Area ="+recarea); 
	}
	}
	
	
		
	
public class interface1{
	public static void main(String[] args){
	
	int op;
	Scanner s = new Scanner(System.in);
	double le,ra,br;
	do{
	System.out.println("Enter option\n1.Circle\n2.Rectangle\n3.Exit :");

	op=s.nextInt();
	switch(op){
	case 1:
	        circle c=new circle();
		c.area();
		// c.perimeter(ra);
	case 2:
		rectangle r=new rectangle();
	// 	System.out.println("Enter length:");
	//         le = s.nextInt();
	// 	System.out.println("Enter breadth:");
	// 	br = s.nextInt();
		r.area();
	// 	r.perimeter(le,br);
	default :
		System.out.println("Invalid option...");
	
	}
	}while(op!=3);
	}
	}
	
