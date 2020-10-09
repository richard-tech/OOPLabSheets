package problemsolving;

import javax.swing.*;

public class ex2 {
    public static void main(String[] args) {

        double a,b,c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the first side of the triangle: "));

        b = Double.parseDouble( JOptionPane.showInputDialog("Please enter the length of the second side of the triangle: "));

        c = Double.parseDouble( JOptionPane.showInputDialog("Please enter the length of the third side of the triangle: "));

        triangleDetails(a,b,c);

        System.exit(0);
    }
    public static void triangleDetails(double a, double b, double c){

        double s,area;
        String category;

        s = (a+b+c)/2;

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        if(a == b && a == c)
            category = "equilateral";
        else if(a == b && a != c ||
                a == c && a != b ||
                b == c && b != a)
            category = "isosceles";
        else
            category = "scalene";

        JOptionPane.showMessageDialog(null,"The area of the triangle " + String.format("%.3f",area) +
                " It was a " + category + " triangle","Triangle Details",JOptionPane.INFORMATION_MESSAGE);

    }
}
