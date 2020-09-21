package labsheet1;
import javax.swing.JOptionPane;
public class CyclistSponsor {
    public static void main(String[] args) {
        String name, kmCycledAsString;
        int kmCycled;
        float amountDue=0;
        final float under10kRate=1.75f,over10kRate=2.50f;

        name = JOptionPane.showInputDialog("Please enter your name");

        kmCycledAsString = JOptionPane.showInputDialog("PLease enter the number of km cycled");

        kmCycled = Integer.parseInt(kmCycledAsString);

        if(kmCycled <= 10){
            amountDue += kmCycled * under10kRate;
        }
        else
              amountDue += (kmCycled - 10) * over10kRate + 10*under10kRate;



            JOptionPane.showMessageDialog(null,"Name " + name + "\nDistance Cycled " +
                            kmCycled + "\nSponsorship amount due: " +String.format("%.2f",amountDue));
    }
}
