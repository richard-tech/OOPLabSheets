package labsheet2;

import javax.swing.*;

public class RollTheDice {
    public static void main(String[] args) {

        String no="",yes="",game;
        int gamesPlayed=0,computerWins=0,playerWins=0,draw=0;

        game = JOptionPane.showInputDialog("Would you like to play the game of roll the dice? (yes or no)");

        if(game.equals("no"))
        {
            JOptionPane.showMessageDialog(null,"Thanks for playing the game!" , "Farewell",JOptionPane.INFORMATION_MESSAGE);

        }else
        {
            while(game.equals("yes")){
                gamesPlayed++;
                char results = rollTheDice();
                if(results == 'c') {

                    computerWins++;
                }else if (results == 'p' ){
                    playerWins++;
                }else
                    draw++;

                JOptionPane.showMessageDialog(null,"Games Played " + gamesPlayed +
                        "\nComputer Wins " + computerWins + "\nPlayer Wins " + playerWins +
                        "\nDraw " + draw);

                game = JOptionPane.showInputDialog("Would you like to play another game of roll the dice? (yes or no)");


            }

        }

    }
    public static char rollTheDice(){

        int c =  (int)(Math.random()*11)+2;

        int p = (int)(Math.random()*11)+2;

        JOptionPane.showMessageDialog(null,"The computer roll generated the value " + c);

        JOptionPane.showMessageDialog(null,"The player roll generated the value " + p);

        if(c>p){
            return 'c';

        }else if(p>c){
            return 'p';


        }else
            return 'd';

    }
}