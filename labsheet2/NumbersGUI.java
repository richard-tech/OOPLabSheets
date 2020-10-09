package labsheet2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbersGUI {

    JLabel jLabelLargest, jLabelSmallest;
    float largest = -1e38f, smallest = 1e38f;
    JTextField jTextField;


    public NumbersGUI() {

        JFrame jFrameWindow = new JFrame("Numbers Application");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);

        jFrameWindow.setSize(500, 150);

        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel promptLabel = new JLabel("Please enter your numbers here");
        jLabelLargest = new JLabel("No numbers entered yet");
        jLabelSmallest = new JLabel();


        jFrameWindow.add(promptLabel);

        jTextField = new JTextField(20);

        jFrameWindow.add(jTextField);

        jLabelLargest = new JLabel();


        jFrameWindow.add(promptLabel);

        jFrameWindow.add(jTextField);

        jFrameWindow.add(jLabelLargest);
        jFrameWindow.add(jLabelSmallest);

        EventHandler handler = new EventHandler();

        jTextField.addActionListener(handler);

        jFrameWindow.setVisible(true);


    }

    public static void main(String[] args) {

        NumbersGUI GUI = new NumbersGUI();

    }

    private class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String numberAsString = "";
            float numbers;


            if (jTextField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "You must enter something", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {

                numberAsString = jTextField.getText();
                jTextField.setText("");
                numbers = Float.parseFloat(numberAsString);

                if (numbers > largest)
                    largest = numbers;
                if (numbers < smallest)
                    smallest = numbers;

                jLabelLargest.setText("Largest number so far is: " + largest);
                jLabelSmallest.setText("Smallest number so far is: " + smallest);

            }
        }
    }
}

