package graphics;

public class circle {
    float rad;
    public circle(float rad){
        this.rad=rad;
    }
    public void area(){
        System.out.println("Area is :"+(3.14*this.rad*this.rad));
    }
}
