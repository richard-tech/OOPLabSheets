package labSheet5.exercise1.exercise5;

public class BankAccount {
    private String owner;
    private int number;
    public static double interestRate;
    private static int count;

    public BankAccount(){
        owner = "Owner not Available";
        number = 0;
        interestRate = 0;
    }
    public BankAccount(String owner,int number,double interestRate){
//        this.owner = owner;
//        this.number = number;
//        BankAccount.interestRate = interestRate;
        setOwner(owner);
        setNumber(count);
        setInterestRate(interestRate);
        incrementCount();

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BankAccount.count = count;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    private static void incrementCount(){
        count++;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
    public String toString(){
        return " Owner: " + getOwner() + " Account Number: " + getNumber() + " Interest Rate: " + getInterestRate();
    }
}
