package Practice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Practice.Main {
//    public static void main(String[] args) {
////    intro dif = new Intro();
////    System.out.print(dif.msg);
//    int mul = Multiple.multipleByFive(5);
//    System.out.print(mul);
//    int[] array = {1,2,3,4,5};
//    Function arrFunction = new Function(array);
//
//    }
//    }
//class Function{
//    int result;
//
//
//    Function(int[] array){
//    for(int num:array){
//        System.out.print(num);
//    }
//    }
//}
//
//    class Intro{
//    String msg ="Hello from intro";
//    }
//
//    class Multiple{
//    public static int multipleByFive(int num){
//        return num*5;
//    }
//    }
public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.accNo = "10004";
        acc.setBalance(10000);
        acc.accType = "Savings";

        Account acc2 = new Account("10005",
                20000,
                "Current");


        System.out.println("Account no:" + acc.accNo);
        System.out.println( "Balance: " + acc.getBalance());

        System.out.println("Practice.Account no:" + acc2.accNo);
        System.out.println( "Balance: " + acc2.getBalance());
    }
}


class Account {

    String accNo;
    private double balance;
    String accType; // Savings, Current

    public Account() {

    }
    // Encapsulation
    public void setBalance(double balance) {
        this.balance = balance; //10000
    }
    public double getBalance() {
        return this.balance;
    }

    // Constructor Overloading
    public Account(String accNo, double balance, String accType) {
        this.accNo = accNo;
        this.balance = balance;
        this.accType = accType;
    }
}



