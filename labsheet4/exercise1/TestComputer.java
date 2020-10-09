package labsheet4.exercise1;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output="";

        Computer c1 = new Computer();

        output += "Calling the no argument Computer constructor. " +
                "The first Computer object details are: \n\n" + c1.toString();

       /* Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);

        Computer c3 = new Computer("Apple","Desktop",-3.15,-16,-500.25);

       // c3.setSpeed(-3.15);
        c2.setPrice(-500);
        c3.setRAM(-8);
        c3.setPrice(-800);

        output += "\n\nCalling the multi-argument Computer constructor.The second computer object details are \n\n "
                + c2.toString();

        output += "\n\nCalling the multi-argument Computer constructor.The third computer object are \n\n "
                + c3.toString();*/

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
