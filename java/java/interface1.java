interface shape{
    void area();
}

interface shape1{
    void perimeter();
}

class circle implements shape,shape1{
    float rad;
    circle(float rad){
        this.rad=rad;
    }
    public void area(){
        System.out.println("Circle area is :"+(3.14*this.rad*this.rad));
    }
    public void perimeter(){
        System.out.println("Perimeter is "+(3.14*2*this.rad));
    }
}



public class interface1 {
    public static void main(String[] args) {
        circle c=new circle(2.1f);
        c.area();
        c.perimeter();
    }
    
}
