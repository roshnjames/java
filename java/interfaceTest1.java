import java.util.Scanner;

interface Shape {
  public void Area(double r);
  public void Perimeter(double r);
}


class Circle implements Shape {
    public void Area(double r) {
      double c_area=(3.14*r*r);
      System.out.println("Area of Circle = "+c_area);
  }
  public void Perimeter(double r) {
    double c_perim=(3.14*2*r);
    System.out.println("Perimeter of Circle = "+c_perim);
  }
}

class interfaceTest1 {
  public static void main(String[] args) {
    double c_r;
    Scanner S=new Scanner(System.in);
    System.out.print("Enter Radius : ");
    c_r = S.nextDouble();
    Circle C1 = new Circle();  
    C1.Area(c_r);
    C1.Perimeter(c_r);
  }
}
