package labSheet3.exercise1;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output="";

        Computer c1 = new Computer();

        System.out.println(c1.getManufacturer());

        output += "Calling the no argument Computer constructor. " +
                "The first Computer object details are: \n\n" + c1.toString();

        Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);

        Computer c3 = new Computer("Apple","Desktop",2.9,12,865.00);

        c2.setSpeed(-3.15);
        c2.setPrice(-500);
        c3.setRAM(-8);

        output += "\n\nCalling the multi-argument Computer constructor. " + c2.toString();

        output += "\n\nCalling the multi-argument Computer constructor.The third computer\n\n " + c3.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
