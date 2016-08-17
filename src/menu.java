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
                case 0: waitingForCustomer();
                    break;
                default:
                    System.out.println("Invalid Input, Try again.");
                    menuRun();
            }
        }while(m!=0);
    }
    
    private void travelPassPurchase(){
        String userID;
        System.out.print("Which card ID: ");
        userID = keyPad.nextLine();
        double balance = UsersData.checkUserID(userID);
        if(balance!=-1){
            zoneChoose(userID,balance);
        }else {
            System.out.print("User ID not found. Try again.");
            menuRun();
        }
    }
    
    private void zoneChoose(String userID,double balance){
        int m;
        do{
            zoneMenu();
            m=keyPad.nextInt();
            switch (m){
                case 1: purchaseTwoHoursPass(userID,balance);
                    break;
                case 2: purchaseOneDayPass(userID,balance);
                    break;
                case 0: mainMenu();
                    break;
                default:
                    System.out.println("Invalid Input, Try again.");
                    zoneChoose(userID,balance);
            }
        }while(m!=0);
    }
    
    private void travelPassPurchaseMenu() {
        int m;
        do{
            purchaseMenu();
            m = keyPad.nextInt();
            switch (m){
                case 1: purchaseTwoHoursPass();
                    break;
                case 2: purchaseOneDayPass();
                    break;
                case 0: menuRun();
                    break;
                default:
                    System.out.println("Invalid Input, Try again.");
                    travelPassPurchase();
            }
        }while(m!=0);
    }
    
    private void purchaseTwoHoursPass(String id,double balance){
        try{
            if(balance - 3.9<0){
                throw new NoEnoughFundException("No enough ")
            }
        }catch NoEnougntFundException()
    }
}
