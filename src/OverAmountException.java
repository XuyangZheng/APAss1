/**
 * Project APAss1,
 * Created by TonyZheng on 22/08/2016.
 */
public class OverAmountException extends Exception{
    public OverAmountException(String err){
        super(err);
    }
    
    public String getMessage(){
        return super.getMessage();
    }
}
