abstract class shape{
    abstract void area();
    void display(){
        System.out.println("AREA-------");
    }
}

class circle extends shape{
    double r;
    circle(double r){
        this.r=r;
    }
     void area(){
        System.out.println("Area is :"+(3.14*this.r*this.r));
    }
}

public class abstract1 {
    public static void main(String[] args) {
        circle c=new circle(3.4);
        c.display();
        c.area();
    }
}
