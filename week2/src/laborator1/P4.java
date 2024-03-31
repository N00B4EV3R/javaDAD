package laborator1;

import javax.swing.*;
import java.awt.*;

public class P4 {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    P4(){
        JFrame frame = new JFrame("Problema 4");
        frame.setSize(240,200);
        String pos[] = { "East", "West", "North", "South", "Center"};
        button1 = new JButton(pos[0]);
        button2 = new JButton(pos[1]);
        button3 = new JButton(pos[2]);
        button4 = new JButton(pos[3]);
        button5 = new JButton(pos[4]);
        JPanel panel = new JPanel(new BorderLayout());


        panel.add(button1, BorderLayout.EAST);
        panel.add(button2, BorderLayout.WEST);
        panel.add(button3, BorderLayout.NORTH);
        panel.add(button4, BorderLayout.SOUTH);
        panel.add(button5, BorderLayout.CENTER);

//        button1.add(button1.getName(), frame.getContentPane());
//        button2.add(button2.getName(), frame.getContentPane());
//        button3.add(button3.getName(), frame.getContentPane());
//        button4.add(button4.getName(), frame.getContentPane());
//        button5.add(button5.getName(), frame.getContentPane());

        frame.add(panel);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        P4 p4 = new P4();
    }

}
