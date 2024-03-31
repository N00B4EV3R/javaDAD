package laborator1;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class P1 {

    P1(){
        main();
    }
    public void main(){
        JFrame jf = new JFrame("Problema 1");
        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Color");
        JTextField textField = new JTextField("White");
        textField.setEditable(false);
        JPanel panel = new JPanel(new FlowLayout());
        textField.setBorder(new EtchedBorder());
        textField.setBackground(Color.white);
        textField.setPreferredSize(new Dimension(180,20));
        panel.add(label);
        panel.add(textField);
        jf.add(panel);
        center(jf);


    }

    public static void center (Window w) { Dimension ws = w.getSize();

        Dimension ss = Toolkit.getDefaultToolkit().getScreenSize(); int newX = ( ss.width - ws.width ) / 2;

        int newY = ( ss.height- ws.height ) / 2;

        w.setLocation( newX, newY ); }
    public static void main(String[] args) {
        P1 p = new P1();
    }

}
