package labSheet5.exercise1;

import labsheet4.exercise1.exercise4.Book;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {
        String output="";

        labsheet4.exercise1.exercise4.Book b1 = new labsheet4.exercise1.exercise4.Book();

        output += "Calling the no argument Book constructor. The first book object details are: \n\n" +
                b1.toString();

        labsheet4.exercise1.exercise4.Book b2 = new labsheet4.exercise1.exercise4.Book("The Davinci Code",19.99,"3452617232",348);

        output += "\n\nCalling the multi-argument Book constructor. The second book object details are: \n\n" +
                b2.toString();

        String titleFavourite,ISBNFavourite,leastFavourite,ISBNLeastFavourite;
              int  pagesFavourite,LeastPagesFavourite;
         double priceFavourite,priceLeastFavourite;

        titleFavourite = JOptionPane.showInputDialog("\nPlease tell us the title of your favourite book? ");

        priceFavourite = Double.parseDouble(JOptionPane.showInputDialog("\nPlease tell us the price of your favourite book?"));

        ISBNFavourite = JOptionPane.showInputDialog("\nPlease enter the ISBN of your favourite book? ");

        pagesFavourite = Integer.parseInt(JOptionPane.showInputDialog("\nPlease enter how many pages are in your favourite book? "));

        leastFavourite = JOptionPane.showInputDialog("\nAnd tell us your least favourite book?");

        priceLeastFavourite = Double.parseDouble(JOptionPane.showInputDialog("\nPlease enter the price of your least favourite book?"));

        ISBNLeastFavourite = JOptionPane.showInputDialog("\nPlease enter the ISBN of your least favourite book?");

        LeastPagesFavourite = Integer.parseInt(JOptionPane.showInputDialog("\nPlease tell us the number of pages in Least favourite book? "));


        labsheet4.exercise1.exercise4.Book favouriteBook = new labsheet4.exercise1.exercise4.Book(titleFavourite,priceFavourite,ISBNFavourite,pagesFavourite);
        labsheet4.exercise1.exercise4.Book leastFavouriteBook = new Book(leastFavourite,priceLeastFavourite,ISBNLeastFavourite,LeastPagesFavourite);

        String textAreaOutput = "";
        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced", Font.PLAIN,12);
        textArea.setFont(font);


        textAreaOutput += String.format("%-25s%-8s%-15s%s\n\n%-25s%-8.2f%-15s%d\n\n%-25s%-8.2f%-15s%d","Title","Price","ISBN","Pages",
                favouriteBook.getTitle(),favouriteBook.getPrice(),favouriteBook.getISBN(),favouriteBook.getPages(), leastFavouriteBook.getTitle(),
        leastFavouriteBook.getPrice(),leastFavouriteBook.getISBN(),leastFavouriteBook.getPages());

        textArea.append(textAreaOutput);

        //output += "Details of favourite book is" + String("%-10" favouriteBook.toString() +
        //"\n\nDetails of least favourite book" + leastFavouriteBook.toString();


        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",JOptionPane.INFORMATION_MESSAGE);
    }
}
