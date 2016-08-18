import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.*;

/**
 * Project APAss1,
 * Created by TonyZheng on 16/8/9.
 */
public class data {
    public static double readDataFromFile(String userName){ //this method is to read user file.
        String user = userName;
        double balance = -1;
        try {
            String s;
            BufferedReader br = new BufferedReader(new FileReader("Data"));
            while((s=br.readLine())!=null){
                if(s.contains(user)){
//                    System.out.println(s);
                    StringTokenizer inReader = new StringTokenizer(s,",");
                    String name = inReader.nextToken();
//                    System.out.println(name);
                    balance = Double.parseDouble(inReader.nextToken());
                }
            }
        }catch (Exception e){
            System.err.print(e);
            System.err.println("error in data reading");
        }
        return balance;
    }
    
    public void writeDataIntoFile(String userName,double balance){
        
    }
    
    public static void main(String []args){
        double balance = readDataFromFile("a");
        
        System.out.print(balance);
        
    }
    
    public double getBalalce(String userID){  //this method is to loop if username not found
        
        double balance = readDataFromFile(userID);
        double b = 0;
        if(balance==-1){
            System.out.println("Invalid Username, Try again!");
            MyTiSystem.checkUser();
        }else b = balance;
        return b;
    }

    
/*    public void writeDataToFile(String userName,double balance) { //I want to rewrite file in this method.
        String user = userName;
        double addBalance = balance;
        double privousBalance = getBalalce(user);
        double afterBalance = privousBalance + addBalance;
        try {
            String s,putData;
            BufferedReader brForWrite = new BufferedReader(new FileReader("Data"));
            while((s = brForWrite.readLine()!=null)){
                if(s.contains(user)){
                    putData = s.replaceAll(Double.toString(privousBalance),Double.toString(afterBalance));
                    BufferedWriter bw = new BufferedWriter(new FileWriter("Data")):
                    
                }
            }
        }
    }*/
}
