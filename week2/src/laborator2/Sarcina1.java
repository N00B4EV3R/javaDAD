package laborator2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Sarcina1 implements ActionListener {

    private JTextField textField;
    private JButton button;
    private JLabel label;
    private JPanel panel;
    Sarcina1(){
        textField = new JTextField("",10);
        button = new JButton("Patrat");
        label = new JLabel("");
        panel = new JPanel();
        JFrame frame = new JFrame("Patratul unui numar");
        frame.setSize(400,140);
        frame.setVisible(true);
        button.addActionListener(this);

        panel.add(textField);
        panel.add(button);
        panel.add(label);
        frame.add(panel);

    }


    public static void main(String[] args) {
        Sarcina1 s = new Sarcina1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int nr = Integer.parseInt(textField.getText());
            label.setText((nr*nr)+"");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
