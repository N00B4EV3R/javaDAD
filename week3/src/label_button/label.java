package label_button;

import javax.swing.*;
import java.awt.*;

public class label {
    label(){
        JFrame frame = new JFrame("Label");
        frame.setSize(500,321);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Acesta este un label / o eticheta");
        label.setFont(new Font("Times New Roman", Font.ITALIC, 43));
        frame.add(label);
    }

    public static void main(String[] args) {
        new label();
    }
}
