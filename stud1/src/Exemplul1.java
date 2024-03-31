import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Exemplul1 extends JFrame implements ActionListener{

    private JLabel label;
    public Exemplul1(String titlu){
        super(titlu);
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //închiderea ferestrei
        Container x = getContentPane();
        x.setLayout(new FlowLayout());
        JButton A = new JButton("Buton 1"); x.add(A);
        JButton B = new JButton("Buton 2"); x.add(B);
        JButton C = new JButton("Buton 3"); x.add(C);
        label = new JLabel(); x.add(label);
        //text afișat la trecerea cursorului pe butonul B
        B.setToolTipText("Acesta este butonul 2");
        A.setToolTipText("Acesta este butonul 1");
        C.setToolTipText("Acesta este butonul 3");
        A.addActionListener(this);
        B.addActionListener(this);
        C.addActionListener(this);
        x.setBackground(Color.green);
        changeFont(x);
        setVisible(true);
    }

    public static void changeFont(Component component) {
        Font f = component.getFont();
        component.setFont(new Font(f.getName(),Font.BOLD,f.getSize()));
        if (component instanceof Container) {
            for (Component child : ((Container) component).getComponents()) {
                changeFont(child);
            }
        }
    }
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        String t;
        if(command.equals("Buton 1"))
            t="Ai apasat Buton 1";
        else if(command.equals("Buton 2")) t="Ai apasat Buton 2";
        else t="Ai apasat Buton 3";

        System.out.println(t);
        if(label.getText()!=null)
        label.setText(label.getText()+"\n"+t);
        else label.setText(t);
    }

    public static void main(String args[ ]){
        new Exemplul1("Doua butoane");
    }
}
