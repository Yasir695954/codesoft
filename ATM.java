import java.util.Scanner;
 class Bank {
 float balance;
public Bank(float balance) {
    this.balance = balance;
}
public void withdraw(int money){
    if (money>balance){
        System.out.println("Insufficient balance");
        return;
    }else
    balance-=money;
    System.out.println("succecfully withdraw !");
 }
 public void deposit(int money){
    balance+=money;
    System.out.println("succecfully deposited !");
 }
 public void checkBalance(){
 System.out.println("your total balance is :"+balance);
 }
public float getBalance() {
    return balance;
}
public void setBalance(float balance) {
    this.balance = balance;
}

}
class ATM{
  
    Bank userBank;
  ATM (Bank userBank){
    this.userBank=userBank;
  }
int amount;


    Scanner sc =new Scanner(System.in);

    public void withdraw(){
    System.out.print("Enter the amount to withdraw :");
     amount=sc.nextInt();
    userBank.withdraw(amount);}
    
    public void deposit(){
    System.out.print("Enter the amount to deposit:");
     amount=sc.nextInt();
     userBank.deposit(amount);}
    public void checkBalance(){
        userBank.checkBalance();
    }
 public static void main(String[] args) {
    Bank bank=new Bank(1000);
       ATM atm =new ATM(bank);
      Scanner scanner =new Scanner(System.in);
       System.out.println("\n\n\t\t\tWELCOME TO ATM \n");
       char c;
    do{
       System.out.println("Enter 1 to deposit ");
       System.out.println("Enter 2 to withdraw ");
       System.out.println("Enter 3 to check balance ");

       int input=scanner.nextInt();
       switch (input) {
        case 1:
            atm.deposit();
            break;
        case 2:
        atm.withdraw(); break;
        case 3:
        atm.checkBalance();break;

        default:
        System.out.println("invalid input!!");
            break;
       }
       System.out.println("\nDo you want to make transcation again press y");
        c=scanner.next().charAt(0);
    }while(c=='y'||c=='Y');
    System.out.println("Thank you !!");

    }
}













