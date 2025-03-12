package Practice;


// Change the below class to have setters and Getters and Constructors
class Account1  {
    String accNo;
    double balance;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

//Create an implementation of the below Interface
interface ATM {
    boolean deposit(Account1 account, double amount);
    boolean withdraw(Account1 account,double amount) throws Exception;
    double getBalance();
}
public class Prac3 implements ATM{

    Account1 acc1 = new Account1();
    


    @Override
    public boolean deposit(Account1 account, double amount) {
        return false;
    }

    @Override
    public boolean withdraw(Account1 account, double amount) throws Exception {
        return false;
    }

    @Override
    public double getBalance() {
        return acc1.getBalance();
    }
}
