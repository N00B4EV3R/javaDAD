package laborator2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sarcina3 {

    private JFrame frame;
    private JTextField num1;
    private JTextField num2;
    private JLabel res;
    private JButton Add_Button;
    private JButton Subtract_Button;
    private JButton Multiply_Button;
    private JButton Divide_Button;

    Sarcina3(){
        frame = new JFrame("MiniCalculator");
        frame.setSize(400,400);
        frame.setLayout(new GridLayout(4,2));
        Add_Button = new JButton("+");
        Subtract_Button = new JButton("-");
        Multiply_Button = new JButton("*");
        Divide_Button = new JButton("/");

        num1 = new JTextField();
        num2 = new JTextField();
        res = new JLabel();

        frame.add(num1);
        frame.add(num2);
        frame.add(Add_Button);
        frame.add(Subtract_Button);
        frame.add(Multiply_Button);
        frame.add(Divide_Button);
        frame.add(res);

        Add_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Double n1 = Double.parseDouble(num1.getText());
                    Double n2 = Double.parseDouble(num2.getText());
                    res.setText((n1+n2)+"");
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(Add_Button,"Enter a valid Number",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        Subtract_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Double n1 = Double.parseDouble(num1.getText());
                    Double n2 = Double.parseDouble(num2.getText());
                    res.setText((n1-n2)+"");
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(Subtract_Button,"Enter a valid Number",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        Multiply_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Double n1 = Double.parseDouble(num1.getText());
                    Double n2 = Double.parseDouble(num2.getText());
                    res.setText((n1*n2)+"");
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(Multiply_Button,"Enter a valid Number",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        Divide_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Double n1 = Double.parseDouble(num1.getText());
                    Double n2 = Double.parseDouble(num2.getText());
                    res.setText((n1/n2)+"");
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(Divide_Button,"Enter valid numbers",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Sarcina3();
    }
}
