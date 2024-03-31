import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class Exemplul8 extends JFrame implements ActionListener {
    JSpinner spinner;
    JLabel label;
    Exemplul8(){
        super("Utilizare JSpinner");
        setSize(300,200);
        SpinnerModel setari =
                new SpinnerNumberModel(0, //valoarea initiala
                        0, //valoarea minima
                        20, //valoarea maxima
                        2); //pasul de incremetare
        spinner = new JSpinner(setari);
        add(spinner,BorderLayout.NORTH);
        JButton button = new JButton("Calculeaza");
        add(button);
        button.addActionListener(this);
        label = new JLabel();
        add(label);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        new Exemplul8();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n=1;
        System.out.println(spinner.getValue());
        for(int i=1;i<=(Integer) spinner.getValue();i++)
            n*=i;
        label.setText("Factorialul numarului "+((Integer) spinner.getValue())+" este "+n);
    }
}