/**
 * Project APAss1,
 * Created by TonyZheng on 19/08/2016.
 */
public class Test {
    public static void main(String []args) {
        try {
    
            UsersData a = new UsersData();
            a.addStation("Central", 1);
            a.addStation("Flagstaff", 1);
            a.addStation("Richmond", 1);
            a.addStation("Lilydale", 2);
            a.addStation("Epping", 2);
    
            a.addNewUser("abc", "abce", "abced", 40.0);
            System.out.println("Station Name    :  Zone");
            for(int i=0;i<UsersData.stationsName.size();i++){
                System.out.println(UsersData.stationsName.get(i));
            }
        }catch(Exception e){
            System.err.print(e);
        }
    }
}
