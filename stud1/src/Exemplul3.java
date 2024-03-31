import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

class Exemplul3 extends JFrame implements ActionListener {

    private JTextField nume;
    private JTextField gen;
    private JTextField pren;

    public Exemplul3(){
        setTitle("Detalii");
        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout( new GridLayout(4,2));
        nume = new JTextField(8);
        gen = new JTextField(8);
        pren = new JTextField(8);
        add(new JLabel("Nume"));
        add(nume);
        add(new JLabel("Gen"));
        add(gen);
        add(new JLabel("Prenume"));
        add(pren);
        JButton afiseaza = new JButton("Afiseaza"); add(afiseaza);
        JButton inchide = new JButton("Inchide"); add(inchide);
        afiseaza.addActionListener(this);
        inchide.addActionListener(this);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Exemplul3 (); }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("Inchide")) {
            System.exit(2);
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nume: ");String numeString = scanner.nextLine();
            System.out.print("Gen: ");String genString = scanner.nextLine();
            System.out.print("Prenume: "); String prenString = scanner.nextLine();
            nume.setText(numeString);
            gen.setText(genString);
            pren.setText(prenString);
        }
    }
}
