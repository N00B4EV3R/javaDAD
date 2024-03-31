import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class Exemplul7 extends JFrame implements ActionListener {
    private JTextField num1;
    private JTextField num2;
    public Exemplul7(){
        setTitle("Buton cu iconite");
        setSize(300, 200);
        setLayout(new GridLayout(1,3));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon usIcon = new ImageIcon("imagini\\1.png"); //incarca imaginea
        ImageIcon caIcon = new ImageIcon("imagini\\2.png");
        ImageIcon ukIcon = new ImageIcon("imagini\\3.png");
        JButton jbt = new JButton("Click it!", usIcon);
        jbt.setPressedIcon(caIcon); //cind se executa butonul
        jbt.setRolloverIcon(ukIcon); //cursorul se misca pe buton
        jbt.addActionListener(this);
        num1 = new JTextField(5);
        num2 = new JTextField(5);
        add(num1);
        add(num2);
        add(jbt);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Exemplul7(); }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            double n1,n2,x;
            n1 = Double.parseDouble(num1.getText());
            n2 = Double.parseDouble(num2.getText());
            if(n1>n2) x = n1; else x = n2;
            JOptionPane.showMessageDialog(num1,"Cel mai mare numar dintre "+n1+" si "+n2+" este "+x);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}