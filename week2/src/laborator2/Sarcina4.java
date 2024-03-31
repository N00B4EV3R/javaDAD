package laborator2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sarcina4 {
    private JFrame frame;
    private JTextField textField;
    private JButton button;
    private JLabel label1;
    private JLabel label2;
    Sarcina4(){
        frame = new JFrame("Aplicatie cu litere");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        textField = new JTextField(15);
        label1 = new JLabel();
        label2 = new JLabel();
        button = new JButton("Afiseaza");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cuvant = textField.getText();
                int voc=0, cons=0;
                for(int i=0;i<cuvant.length();i++){
                    if((cuvant.charAt(i) >= 'a' && cuvant.charAt(i) <= 'z') || (cuvant.charAt(i) >='A' && cuvant.charAt(i) <= 'Z')) {
                        if(isVocala(cuvant.charAt(i))) voc++; else cons++;
                    }
                }
                label1.setText("Vocale = "+voc);
                label2.setText("Consoane = "+cons);
            }
        });

        frame.add(textField);
        frame.add(button);
        frame.add(label1);
        frame.add(label2);
        frame.setVisible(true);
    }

    private boolean isVocala(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        new Sarcina4();
    }
}
