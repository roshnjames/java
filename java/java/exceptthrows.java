class sample{
    int i;
    sample(){
        this.i=90;
    }
    public void sum() throws ArithmeticException{
        if(i<100){
            throw new ArithmeticException("throws worked");
        }
    }
}
public class exceptthrows {
    public static void main(String[] args) {
        sample s1=new sample();
        try{
            s1.sum();
        } catch(Exception e){
            System.out.println(":::::"+e);
        }   
    }
}
