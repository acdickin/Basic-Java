/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acosmic.basics;

/**
 *
 * @author v-andick
 */
public class BankAccount {
    private String account_number;
    private int account_balance;
    public BankAccount(String account_number, int account_balance){
        this.account_number =account_number;
        this.account_balance= account_balance;
        System.out.println("You created account " + this.account_number + ".");
    }
    public void deposit(int addMoney){
        if (addMoney <0){
            System.out.println("you cannot deposit a" + "negative number");
        } else {
            this.account_balance= this.account_balance+addMoney;
            System.out.println("$"+ addMoney+" " +"deposited into account " 
                    + this.account_number + ".");
        }
    }
     public void withdraw(int removeMoney){
        if (removeMoney <0){
            System.out.println("you cannot widthdraw a" + "negative number");
        }else if(removeMoney> this.account_balance){
             System.out.println("You do not have enough money in your account to withdraw $" +removeMoney );
        } 
        else {
            this.account_balance= this.account_balance-removeMoney;
            System.out.println("$"+ removeMoney+" " +"withdrawn into account " 
                    + this.account_number + ".");
        }
    }
    public void getBalance(){
        System.out.println("Current balance for account " + this.account_number 
                + " is "+this.account_balance);
    }
//    BankAccount myBank = new BankAccount("1314234sdafdsasdf", 100);
//    myBank.withdraw(200);
//    myBank.deposit(200);
//    myBank.withdraw(150);
//    myBank.getBalance();
}
