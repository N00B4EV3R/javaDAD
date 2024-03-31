package label_button;

import javax.swing.*;
import java.awt.*;

public class button {
    button(){
        JFrame frame = new JFrame("Button");
        frame.setSize(600,600);

        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Acest label se afla intr-un buton");
        label.setFont(new Font("Courier New", Font.BOLD, 21));
        JButton button = new JButton();
        button.add(label);
        button.setForeground(Color.green);
        button.setBackground(Color.red);
        frame.add(button);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new button();
    }
}
