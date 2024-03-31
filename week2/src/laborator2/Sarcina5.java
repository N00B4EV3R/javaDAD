package laborator2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.Kernel;

public class Sarcina5 {
    private JFrame frame;
    private JLabel label1;
    private JLabel label2;
    private JButton button;
    private JTextField num1;
    private JTextField num2;
    private JLabel label3;

    Sarcina5(){
        frame = new JFrame("Aplicatie");
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        button = new JButton("Calculeaza");
        num1 = new JTextField(8);
        num2 = new JTextField(8);

        label1 = new JLabel("Latura mica");
        label2 = new JLabel("Latura mare");
        label3 = new JLabel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(verifica()){
                    label3.setText((Double.parseDouble(num1.getText())*Double.parseDouble(num2.getText()))+"");
                }
            }
        });

        frame.add(label1);
        frame.add(num1);
        frame.add(label2);
        frame.add(num2);
        frame.add(button);
        frame.add(label3);
        frame.setVisible(true);

    }

    private boolean verifica(){
        Double n1,n2;
        try{
            n1 = Double.parseDouble(num1.getText());
        } catch (Exception ex){
            JOptionPane.showMessageDialog(button, "Introdu la latura mica un numar corespunzator", "Eroare!", JOptionPane.ERROR_MESSAGE);
            num1.setText("");
            label3.setText("");
            return false;
        }
        try{
            n2 = Double.parseDouble(num2.getText());
        } catch (Exception ex){
            JOptionPane.showMessageDialog(button, "Introdu la latura mare un numar corespunzator", "Eroare!", JOptionPane.ERROR_MESSAGE);
            num2.setText("");
            label3.setText("");
            return false;
        }

        if(n1>=n2) {
            JOptionPane.showMessageDialog(button, "Introdu la latura mare un numar mai mare ca latura mica", "Eroare!", JOptionPane.ERROR_MESSAGE);
            num1.setText("");
            num2.setText("");
            label3.setText("");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new Sarcina5();
    }
}
