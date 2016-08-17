import java.util.HashMap;

/**
 * Project APAss1,
 * Created by TonyZheng on 16/8/9.
 */
public class Users {
    private String id;
    private String userName;
    private String email;
    private double balance;
    public Users(String id,String userName,String email,double balance){
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.balance = balance;
    }
    
    public Users(String id,String userName,String email){
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.balance = 0.0;
    }
    
    public String getId(){
        return id;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public String getEmail(){
        return email;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void topUp(double amount){
        balance = balance+amount;
    }
    
    public void purchase(double amount){
        balance = balance - amount;
    }
    
}
