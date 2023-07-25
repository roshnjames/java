class sample extends Exception{
    sample(String str){
        super(str);
    }
}

public class exceptthrow {
    public static void main(String[] args) {
        int m=0;
        try{
            if(m==0){
                throw new sample("Element is zero");
            }
        }catch(sample e){
            System.out.println("::::"+e);
        }finally{
            System.out.println("in finally")
        }
    }
}
