import java.util.HashMap;

/**
 * Project APAss1,
 * Created by TonyZheng on 17/08/2016.
 */
public class UsersData {
    static HashMap<String,Users> users = new HashMap<>();
    
    public void addNewUser(String id,String userName,String email,double balance){
        users.put(id,new Users(id,userName,email,balance));
    }
    
    public void addNewUser(String id,String userName,String email){
        users.put(id,new Users(id,userName,email));
    }
    
    
/*    public static double checkUserID(String ID){
        String id = ID;
        double balance ;
        try{
            balance = users.get(id).getBalance();
        }catch (Exception e){
            balance = -1;
        }
        return balance;
    }*/
    
    public double checkUserID(String ID){
        double balance = 0;
        try{
            balance = users.get(ID).getBalance();
        }catch(Exception e){
            System.err.println("Users not found, try again");
            
        }return balance;
    }
    
}
