package laborator2;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Sarcina6 {
    private JFrame frame;
    private JLabel label1;
    private JTextField textField;
    private JButton button;
    private JLabel label2;

    Sarcina6(){
        frame = new JFrame("Aplicatie");
        frame.setSize(500,500);
        JPanel panel = new JPanel();
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setLayout(new GridLayout(4,1));
        label1 = new JLabel("Introduceti o fraza");
        textField = new JTextField(30);
        button = new JButton("Afiseaza");
        label2 = new JLabel();


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField.getText()=="") {
                    JOptionPane.showMessageDialog(button, "N-ai introdus nicio fraza", "Eroare!", JOptionPane.ERROR_MESSAGE);
                } else {
                    int k=0;
                    String fraza = textField.getText();
                    ArrayList<Integer> pozitii = new ArrayList<>();
                    for(int i=0;i<fraza.length();i++){
                        if(fraza.charAt(i) == 'a' || fraza.charAt(i) == 'A') {
                            k++;
                            pozitii.add(i);
                        }
                    }
                        if(k==0) {
                            label2.setText("Litera a n-a aparut niciodata");
                        } else if(k==1) {
                            label2.setText("Litera a a aparut o singura data, pe pozitia "+(pozitii.get(0)+1)+".");
                        } else {
                            label2.setText("Litera a aparut de "+k+" ori, pe pozitiile ");
                            for(int i=0;i<k-1;i++)
                                label2.setText(label2.getText()+(pozitii.get(i)+1)+", ");
                            label2.setText(label2.getText()+(pozitii.get(k-1)+1)+".");
                        }


                }
            }
        });


        panel.add(label1);
        panel.add(textField);
        panel.add(button);
        panel.add(label2);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Sarcina6();
    }
}
