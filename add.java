public class add {
    public static void main(String[] args){
        try{
            System.out.println(args[0]+" added with "+args[1]+" gives out "+
                    (Integer.parseInt(args[0])+Integer.parseInt(args[1])));
    }
        catch(Exception e){
            System.out.println("Only numerical numbers are allowed...!");
        }
    }
}
