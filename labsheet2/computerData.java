package labsheet2;

import javax.swing.*;

public class computerData {
    public static void main(String[] args) {

        String serialNum, diskAsString,type="";
        int disk = 0,totalGB=0,i=0,avg=0,price=0;

        serialNum = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit) ");

        while (!serialNum.equals(" ")) {

            diskAsString = JOptionPane.showInputDialog("Please enter hard-disk space");


            disk = Integer.parseInt(diskAsString);


            if (disk >= 50 && disk <= 5000) {

                    type = JOptionPane.showInputDialog("Please enter the processor type");

                    price = Integer.parseInt( JOptionPane.showInputDialog("Please enter the price"));

                    if(Character.isDigit(disk)){

                        totalGB += disk;
                        i++;

                       avg = totalGB/i;


                    }else{
                        diskAsString = JOptionPane.showInputDialog("Invalid Please re-enter must contain only numbers hard-disk");

                    }
                    
            } else {
                diskAsString = JOptionPane.showInputDialog("Invalid Please re-enter hard-disk");
            }


            JOptionPane.showMessageDialog(null,"The average disk space available on the computer is " + avg +
                    "\nThe price range of the computers is from " + price + "to €880.99" +
                    "\nThe processor type on the cheapest computer is " + type,"Computer Stats",JOptionPane.INFORMATION_MESSAGE);

        }

    }
}