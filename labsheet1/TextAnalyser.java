package labsheet1;

import java.util.Scanner;

public class TextAnalyser {
    public static void main(String[] args) {

        String text;
        char character;
        int totalLetters=0,i=0,vowels=0,numWords=1,edAppears=0,index=0;

        Scanner input = new Scanner(System.in);
    do {

        System.out.println("Please enter piece of text 1: ");
            text = input.nextLine();
            i++;

        character = text.charAt(index);

        System.out.println(i);

            for (int j = 0; j<text.length(); j++) {

                totalLetters++;
            }

        for(int l=0; l<text.length(); l++) {
            if(text.charAt(l) == 'a'|| text.charAt(l) == 'e'|| text.charAt(l) == 'i' || text.charAt(l) == 'o' || text.charAt(l) == 'u')
               vowels++;

            }

            for(int k =1; k<text.length();k++) {
                if(text.charAt(k) == ' ')
                    ++numWords;


            }

            for(int n=0; n<text.length();n++) {
            if(text.endsWith("ed") && text.charAt(n) ==' ')
                edAppears++;

            }

        character = text.charAt(index);


            int sorted = totalLetters - numWords+(1);

        System.out.println("********Text Data**********" +
                "\n\nNumber of characters: " + sorted +
                "\nNumber of lower case vowels: " + vowels+
                "\nNumber of words " + numWords +
                "\nNumber of times \"ed\" appears in the text: " + edAppears );

        }
            while(i<=2);

        }
    }

