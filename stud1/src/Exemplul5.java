import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Exemplul5 extends JFrame implements ActionListener {
    private JLabel label;

    Exemplul5 (){
        String nume=JOptionPane.showInputDialog("Cum vă numiți? ");
        System.out.println(nume);
        setLayout(new BorderLayout());
        JButton button = new JButton("Click aici!"); add(button, BorderLayout.NORTH);

        button.addActionListener(this);
        setSize(400,400);
        label = new JLabel();
        add(label, BorderLayout.CENTER);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Exemplul5 ();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = JOptionPane.showInputDialog("Introduceti un cuvant");
        label.setText(text.toUpperCase());
    }
}
