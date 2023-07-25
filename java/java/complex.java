class cmplx{
    double r;
    double i;
    cmplx(double real,double imaginary){
        this.r=real;
        this.i=imaginary;
    }
    public void add(cmplx other){
        double nr=this.r+other.r;
        double ni=this.i+other.i;
        System.out.println(nr+" + "+ni+"i");
    }
}
public class complex {
    public static void main(String[] args) {
        cmplx c1=new cmplx(3.8,3.4);
        cmplx c2=new cmplx(4.4,5.9);
        c1.add(c2);
    }
}
