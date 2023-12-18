package oop;

public class Account {
  private String name;
  private double balance;

  public Account(String nameInit, double balanceInit) {
    this.name = nameInit;
    this.balance = balanceInit;
  }

  public double balance() {
    return this.balance;
  }

  public void printAccount () {
    System.out.println("Name: " + this.name + " . " + "Balance: " + String.valueOf(this.balance));
  }

  public void deposit(double amount) {
    this.balance = this.balance + amount;
  }

  public void withdraw(double amount) {
    this.balance = this.balance - amount;
  }

  public static void main (String[] args) {
    Account mattAccount = new Account("Matthews Account", 1000);
    Account myAccount = new Account("My Account", 0);
    mattAccount.printAccount();
    myAccount.printAccount();
    mattAccount.withdraw(100);
    myAccount.deposit(100);
    mattAccount.printAccount();
    myAccount.printAccount();
    //System.out.println(account.balance());
  }
}
