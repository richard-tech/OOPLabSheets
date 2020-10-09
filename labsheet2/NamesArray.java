package labsheet2;


import javax.swing.*;
import java.util.Arrays;

public class NamesArray {
    public static void main(String[] args) {


        String[] name = new String [5];
        String longest = "";
        int totalChars=0;
        populateArray(name);
        System.out.println(Arrays.toString(name));

        for(int i = 0; i<name.length;i++) {
            if(name[i].length() > longest.length())
                longest = name[i];

            totalChars += name[i].length();
        }

        Arrays.sort(name);
        System.out.println(longest + "  \n " + String.format("%.0f",(float)totalChars/5) + "\n The array sorted in ascending order is " + Arrays.toString(name) );

    }
    public static void populateArray(String[] name){
        int i;
        for(i = 0; i<name.length;i++) {
            name[i] = JOptionPane.showInputDialog("Please enter the name of person " + i);

        }


    }
}
