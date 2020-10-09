package labSheet5.exercise1.exercise5;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        String output="";

        BankAccount B1 = new BankAccount();

        output += "Calling the no argument BankAccount constructor. The first BankAccount object details are: \n\n" +
                B1.toString();

        BankAccount B2 = new BankAccount("Richy Rich",2342343,0.75);

        output += "\n\nCalling the multi-argument constructor. The second BankAccount object details are: \n\n " +
                B2.toString();

        BankAccount B3 = new BankAccount();
        B3.setInterestRate(.05);

        output += "\n\nNow calling the setInterestRate() method to change the rate to 0.05\n\n";


        output += " The first BankAccount object details are: \n\n" +
                B3.toString();

        BankAccount B4 = new BankAccount("Richy Rich",2342343,.05);


        output += "\n\nThe second BankAccount object details are: \n\n" +
                B4.toString();



        output += "\nThe number of Bank Account objects created is: " +BankAccount.getCount();

        JOptionPane.showMessageDialog(null,output,"BankAccount Object Date",JOptionPane.INFORMATION_MESSAGE);
    }
}
