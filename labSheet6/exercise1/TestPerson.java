package labSheet6.exercise1;

import javax.swing.*;

public class  TestPerson {
    public static void main(String[] args) {
        String output="";

        Person P1 = new Person();

        output += "*******Person class Tester*********\n\nCalling the Person() Constructor......\n"+
                   "Value of the first object is: " + P1.toString();

        Person P2 = new Person();

        String first = JOptionPane.showInputDialog("Please enter the first name of the second person");
        String last = JOptionPane.showInputDialog("Please enter the first name of the second person");

        P2.setFirstName(first);
        P2.setLastName(last);

        output += "\n\nCalling the Person(String,String)Constructor after getting user-supplied values....."+
                "\nValue of the second person is: " +P2.toString();

        JOptionPane.showMessageDialog(null,output,"",JOptionPane.INFORMATION_MESSAGE);
    }
}
