import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Exemplul4 {
    private JTextField numar;
    Exemplul4() {
        JFrame f = new JFrame("Button Example");
        f.setLayout(new FlowLayout());
        ImageIcon icon = new ImageIcon("img.gif");
        JButton b = new JButton(icon);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(numar.getText());
                JOptionPane.showMessageDialog(f, "Patratul este "+(n*n));
            }
        });
        f.add(new JLabel("Introduceti un numar: "));
        numar = new JTextField(8);
        f.add(numar);
        f.add(b);
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Exemplul4();
    }
}