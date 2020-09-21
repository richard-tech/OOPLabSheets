package labsheet1;

import javax.swing.JOptionPane;

public class SnackDeal {
    public static void main(String[] args) {

        String name, course, snackAsString;
        int snack, total = 0;

        name = JOptionPane.showInputDialog("Please enter your name");

        course = JOptionPane.showInputDialog("Please enter your course");

        snackAsString = JOptionPane.showInputDialog("How many snacks would you like?");

        snack = Integer.parseInt(snackAsString);

        snack += total;

        total = snack * 2;


        JOptionPane.showMessageDialog(null, "Name " + name + "\nCourse " + course +
                "\nSnacks " + snackAsString + "\nCost " + total, "Receipt", JOptionPane.INFORMATION_MESSAGE);


    }
}
