import graphics.*;
import java.util.*;

public class graphtest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius");
        float r=s.nextFloat();
        circle c=new circle(r);
        c.area();
    }
}
