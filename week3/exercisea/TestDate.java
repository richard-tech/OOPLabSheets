package week3.exercisea;

import javax.swing.*;

public class TestDate {
    public static void main(String[] args) {
        String output="";

        Date date1 = new Date();

        output += "The results of Testing the Date class are as follows:\n\n" +
                "Just call the Date() constructor, the value of first date object is " + date1.toString();

        int day = Integer.parseInt(JOptionPane.showInputDialog("Please enter a day value"));
        int month = Integer.parseInt(JOptionPane.showInputDialog("Please enter a day value"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Please enter a day value"));

        Date date2 = new Date(day,month,year);

        output += "\n\nJust called the Date() Constructor, the value of the second date object is " + date2.toString();


        JOptionPane.showMessageDialog(null,output,"Date Class Test Results",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
