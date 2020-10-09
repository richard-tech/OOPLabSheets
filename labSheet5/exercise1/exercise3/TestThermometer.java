package labSheet5.exercise1.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        String output="",output1="";

            Thermometer T1 = new Thermometer(35);

            output += "\n\n******Thermometer Testing********\n\n " +
                    "Calling the single-argument constructor...setting the temperature of the first thermometer to 35C\n" +
                    "First Thermometer: \n" + T1.toString();

        Thermometer T2 = new Thermometer();


        output += "******Thermometer Testing********\n\n " +
                "Calling the no-argument constructor...setting the temperature of the second thermometer to 0C\n" +
                "Second Thermometer: \n" + T2.toString();

        Thermometer T3 = new Thermometer();

        T3.setTemperature(25);

        output += "******Thermometer Testing********\n\n " +
                "Calling the setTemperature()...setting the temperature of the second thermometer to 25C\n" +
                "Second Thermometer: \n" + T3.toString();


        JOptionPane.showMessageDialog(null,output,"Thermometer Testing",JOptionPane.INFORMATION_MESSAGE);

        int currentTemp = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer to 48C"));


        Thermometer T4 = new Thermometer(currentTemp);
        T4.setMaxTemp(currentTemp);
        T4.setMinTemp(35);

        output1 += "******Thermometer Testing********\n\n " +
                "Calling setTemperature...setting the temperature of the first thermometer to 48C\n" +
                "First Thermometer: " + T4.toString();

        JOptionPane.showMessageDialog(null,output1);



    }
}
