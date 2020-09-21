package labsheet1;

import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float height=0,smallest=0,total=0,aboveAvg=0;
        int totalBetween=0;


        for(int i=1;i<=6;i++) {

            System.out.print("Loop "+ i +" Please enter your height: ");
            height = input.nextFloat();

            while (height < 0.5464 || height > 2.72) {

                System.out.println("Loop "+ i +" Invalid!!!Please enter a valid height");
                height = input.nextFloat();

            }

            total += height;


        if(height >1.3 && height < 1.9) {
            totalBetween+= height;
        }
        if(height > 1.665) {
            aboveAvg++;
        }

         }
        if(height > smallest) {
            smallest += height;

        }
        System.out.println("--------------------------"+
                            "\n\t\tHeight Statistics"+
                           "\n-----------------------" +
                "\n\nThe average height entered is " + String.format("%.1f",total/6) +"m" +
                "\nThe smallest height value entered is " + smallest + "m" +
                "\nThe number of height values between 1.3m and 1.9m inclusive is: " + String.format("%.0f",(float)totalBetween) +
                "\nThe percentage of height values exceeding the global average height is " +
                String.format("%.2f",aboveAvg/6*100));




    }
}
