import java.util.Scanner;

/**
 * Project APAss1,
 * Created by TonyZheng on 16/8/9.
 */
public class menu {
    private void mainMenu(){ //main menu
        System.out.println("Welcome to MyTi");
        System.out.println("Choose an option:");
        System.out.println("1. Buy a travel pass");
        System.out.println("2. Charge my MyTi");
        System.out.println("3. Show remaining credit");
//        System.out.println("4. Purchase a Journey using a MyTi card");
        System.out.println("0. Quit");
    }
    
    private void purchaseMenu(){ //option 1
        System.out.println("What time period");
        System.out.println("1. 2 Hours");
        System.out.println("2. All Day");
        System.out.println("0. Cancel");
    }
    
    private void zoneMenu(){ //option 1
        System.out.println("Which zone: ");
        System.out.println("1. Zone 1");
        System.out.println("2. Zone 1 and 2");
        System.out.println("0. Cancel");
    }
    
    private Scanner keyPad = new Scanner(System.in);
    
    public void menuRun(){
        int m;
        do {
            mainMenu();
            m = keyPad.nextInt();
            switch (m){
                case 1: travelPassPurchase();
                    break;
                case 2: chargeMyTiCard();
                    break;
                case 3: showCreditMenu();
                    break;
//                case 4: journeyPurchase();
//                    break;
//                case 0: waitingForCustomer();
//                    break;
                default:
                    System.out.println("Invalid Input, Try again.");
                    menuRun();
            }
        }while(m!=0);
    }
    
    private void travelPassPurchase(){ //check user info
        String userID;
        System.out.print("Which card ID: ");
        userID = keyPad.nextLine();
        double balance = UsersData.checkUserID(userID);
        if(balance!=-1){
            travelPassPurchaseMenu(userID,balance);
        }else {
            System.out.print("User ID not found. Try again.");
            menuRun();
        }
    }
    
    private void purchaseTwoHoursPass(String userID,double balance){ //zone choose (2hours)
        int m;
        do{
            zoneMenu();
            m=keyPad.nextInt();
            switch (m){
                case 1: purchaseZoneOneTwoHoursPass(userID,balance);
                    break;
                case 2: purchaseZoneTwoTwoHoursPass(userID,balance);
                    break;
                case 0: mainMenu();
                    break;
                default:
                    System.out.println("Invalid Input, Try again.");
                    purchaseTwoHoursPass(userID,balance);
            }
        }while(m!=0);
    }
    
    private void travelPassPurchaseMenu(String id,double balance) { //purchase choose pass type
        int m;
        do{
            purchaseMenu();
            m = keyPad.nextInt();
            switch (m){
                case 1: purchaseTwoHoursPass(id,balance);
                    break;
                case 2: purchaseOneDayPass(id,balance);
                    break;
                case 0: menuRun();
                    break;
                default:
                    System.out.println("Invalid Input, Try again.");
                    travelPassPurchase();
            }
        }while(m!=0);
    }
    
    private void purchaseZoneOneTwoHoursPass(String id,double balance){ //make purchase of 2hours zone1
        try{
            if(balance - 3.5<0){
                throw new NoEnoughFundExcpetion("No enough Fund in your card");
            }else{
                UsersData.users.get(id).purchase(3.5);
            }
        }catch (NoEnoughFundExcpetion e){
            System.err.println(e);
            menuRun();
        }
    }
    
    private void purchaseZoneTwoTwoHoursPass(String id,double balance){
        try{
            if(balance - 5.0<0){
                throw new NoEnoughFundExcpetion("No enough Fund in your card");
            }else{
                UsersData.users.get(id).purchase(5.0);
            }
        }catch (NoEnoughFundExcpetion err){
            System.err.println(err);
            menuRun();
        }
    }
    
    private void purchaseOneDayPass(String id,double balance){
        
    }
}
