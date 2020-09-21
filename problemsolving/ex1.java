package problemsolving;

//ex1.java
/*This program calculates the roots of a quadratic and displays them along with their type*/

import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {

        double x,y;
        String aAsString,bAsString,cAsString;
        int a,b,c,determinant;
        String banner = "*****Calculating the values and types of the roots of a quadratic" +
                "equation****\n\n\nThe quadratic equation has the form ax^2 + bx + c = 0" +
                "\n\n\n";

        aAsString = JOptionPane.showInputDialog(banner + "Please enter a value for integer coefficient a: ");

        bAsString = JOptionPane.showInputDialog(banner + "Please enter a value for integer coefficient b: ");

        cAsString = JOptionPane.showInputDialog(banner + "Please enter a value for integer coefficient  c: ");

        a = Integer.parseInt(aAsString);
        b = Integer.parseInt(bAsString);
        c = Integer.parseInt(cAsString);

        determinant = b*b - 4*a*c;

        if (determinant>0){
            //calculate root1 and root2 and then build up the root types and values variable

        } else if (determinant==0){

            //calculate root1 and root2 and then build up the root types and values variable


        }else {
            //calculate values x and y
            x = -b/a*a;
            y = (-1*(b*b-4*a*a));
        }



         JOptionPane.showMessageDialog(null,"The quadratic equation has xxxx" +
                 "The value of the determinant " + determinant,"Roots and Types",JOptionPane.INFORMATION_MESSAGE);

         System.exit(0);

    }
}
