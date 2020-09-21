

    package labsheet1;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;


    public class makeGui implements ActionListener {

            int count = 0;
            JFrame frame;
            JLabel label;
            JButton button;
            JPanel panel;

    public makeGui(){


             frame = new JFrame();

             button = new JButton("Click me");
            button.addActionListener(this);
             label = new JLabel("Number of clicks: 0");

             panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
            panel.setLayout(new GridLayout(0,1));
            panel.add(button);
            panel.add(label);

            frame.add(panel,BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Our GUI");
            frame.pack();
            frame.setVisible(true);


    }
    public static void main(String[] args) {
        new makeGui();

    }
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Number of clicks: " + count);
    }
}
