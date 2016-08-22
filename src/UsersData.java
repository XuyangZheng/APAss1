import TravelPass.TravelPass;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import Station.*;

import static java.lang.String.valueOf;

/**
 * Project APAss1,
 * Created by TonyZheng on 17/08/2016.
 */
public class UsersData {
    // this is users data storage
    static HashMap<String,Users> users = new HashMap<>();
    
    public void addNewUser(String id,String userName,String email,double balance){
        users.put(id,new Users(id,userName,email,balance));
        String s1 = id + "travel";
        String s2 = id + "topUp";
//        HashMap<String,TravelPass> (String.valueOf(s1)) = new HashMap<>();
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
    
    public static double checkUserID(String ID){
        double balance = -1;
        try{
            balance = users.get(ID).getBalance();
        }catch(Exception e){
            System.err.println("Users not found, try again");
            
        }return balance;
    }
    
//    static Hashmap<String,> history = new HashMap<>();
    
    // this is stations data storage
    static HashMap<String,Station> station = new HashMap<>();
    static ArrayList<String> stationsName = new ArrayList<>();
    
    public void addStation(String name,int zone){
        station.put(name,new Station(name,zone));
        stationsName.add(name+"            "+zone);
    }
    
    public void travelHistory(String id,TravelPass travelPass){
        
    }
    
    public void topUpHistory(String id,double balance,Date date){
        
    }
}
