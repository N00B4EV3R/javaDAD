import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Exemplul6 extends JFrame implements ActionListener {
    private JButton albastru;
    private JButton verde;
    private JButton galben;
    private JPanel panel;
    Exemplul6(){ addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
        int a=JOptionPane.showConfirmDialog(null,"Sunteti siguri?","Selectati o optiune",JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }}});

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        albastru = new JButton("Albastru");
        albastru.setBackground(Color.blue);
        verde = new JButton("Verde");
        verde.setBackground(Color.green);
        galben = new JButton("Galben");
        galben.setBackground(Color.yellow);
        add(verde, BorderLayout.NORTH);
        add(galben, BorderLayout.WEST);
        add(albastru, BorderLayout.EAST);
        albastru.addActionListener(this);
        verde.addActionListener(this);
        galben.addActionListener(this);

        setVisible(true);

        }
public static void main(String[] args) {
        new Exemplul6();
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equalsIgnoreCase("Albastru"))
        getContentPane().setBackground(Color.blue);
        else if(cmd.equalsIgnoreCase("verde"))
        getContentPane().setBackground(Color.green);
        else getContentPane().setBackground(Color.yellow);
    }
}