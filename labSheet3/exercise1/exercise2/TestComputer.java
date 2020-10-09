package labSheet3.exercise1.exercise2;

import labSheet3.exercise1.Computer;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output="";

        labSheet3.exercise1.Computer c1 = new Computer();

        output += "Calling the no argument Computer constructor. " +
                "The first Computer object details are: \n\n" + c1.toString();

        labSheet3.exercise1.Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);

        labSheet3.exercise1.Computer c3 = new Computer("Apple","Desktop",2.9,12,865.00);


        c2.setSpeed(-3.15);
        c3.setRAM(-8);

        output += "\n\nCalling the multi-argument Computer constructor. \n\nManufacturer: " + c2.toString();

        output += "\n\nCalling the multi-argument Computer constructor.The third computer details.\n\nManufacturer: " + c3.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
