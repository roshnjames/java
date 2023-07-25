import javax.security.auth.login.AccountNotFoundException;

public class except1 {
    public static void main(String[] args) {
        int a=10,b=5;
        try{
            if(a/b==2){
            throw new AccountNotFoundException("division by zero");
            }
        }
        catch(Exception e){
            System.out.println("error:::"+e);
        }
        finally{
            System.out.println("In finally block");
        }
    }
}
