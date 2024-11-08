import java.util.Scanner;

public class BankAccount {

    private int money;

    public static void main(String[] args) {
        BankAccount myBA= new BankAccount();
        Scanner scanner= new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Welcome to your Bank Account");
        myBA.printMoney();
        System.out.println("1 reset money");
        System.out.println("2 change money");
        System.out.println("3 quit");

        int val;
        do{
            myBA.printMoney();
            System.out.print("your choice (1 - 3):");
            val= scanner.nextInt();

            if (val== 1) {
                System.out.print("reset to: ");
                int newMoney= scanner.nextInt();
                myBA.resetMoney(newMoney);
            }
            if (val== 2) {
                System.out.print("change with: ");
                int newMoney= scanner.nextInt();
                myBA.changeMoney(newMoney);
            }
        }while(val!=3);
    }

    public BankAccount(){
        money=500;
    }

    public void printMoney(){
        System.out.println("money: "+ money);
    }

    public void resetMoney(int moneyInAccount){
        if (!checkMoneyLowerThan0(moneyInAccount)){
            money=moneyInAccount;
            System.out.println("money change to: "+ money);
        }
    }

    public void changeMoney(int changeMoney){
        int newMoney= money+ changeMoney;
        if (!checkMoneyLowerThan0(newMoney)){
            money=newMoney;
            System.out.println("money change to: "+ money);
            }
    }

    public boolean checkMoneyLowerThan0(int checkMoney){
        if (checkMoney < 0){
            System.out.println("money lower than 0, opration fail. money: "+ money);
            return true;
        } else return false;

    }
}
