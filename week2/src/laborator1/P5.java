package laborator1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class P5 {

    P5(){
        JButton butoane[] = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton()};
        JPanel paneluri[] = {new JPanel(), new JPanel(), new JPanel(), new JPanel(), new JPanel(), new JPanel(), new JPanel(), new JPanel()};
        JPanel mainPanel = new JPanel(new GridLayout(4,2));

        for(int i=0; i< butoane.length;i++){
            butoane[i].setText("buton"+(i+1));
        }

        for(int i=0; i< paneluri.length;i++){
            paneluri[i].add(butoane[i]);
        }

        JFrame frame = new JFrame("8 butoane 8 paneluri");
        frame.setSize(200,200);

        for (int i = 0; i < paneluri.length; i++) {
            paneluri[i].setBorder(new EmptyBorder(1,1,1,1));
        }


        for(int i=0;i<paneluri.length;i++){
            mainPanel.add(paneluri[i]);
        }




        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        P5 p5 = new P5();
    }
}
