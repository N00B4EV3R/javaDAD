package laborator2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sarcina2 {
    private JFrame frame;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel panel;

    public Sarcina2(){
        frame = new JFrame("Culori diverse");
       // frame.setLayout(new GridLayout(5,0));

        panel = new JPanel(/*new GridLayout(5,0)*/);
        button1 = new JButton("ROSU");
        button1.setPreferredSize(new Dimension(100,40));
        button1.setForeground(Color.RED);

        button2 = new JButton("VERDE");
        button2.setPreferredSize(new Dimension(100,40));
        button2.setForeground(Color.GREEN);

        button3 = new JButton("ALBASTRU");
        button3.setPreferredSize(new Dimension(100,40));
        button3.setForeground(Color.BLUE);

        button4 = new JButton("NEGRU");
        button4.setPreferredSize(new Dimension(100,40));
        button4.setForeground(Color.black);

        button5 = new JButton("GALBEN");
        button5.setPreferredSize(new Dimension(100,40));
        button5.setForeground(Color.YELLOW);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground((button1.getForeground()));
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground((button2.getForeground()));
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground((button3.getForeground()));
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground((button4.getForeground()));
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground((button5.getForeground()));
            }
        });



        panel.add(button1, BorderLayout.NORTH);
        panel.add(button2, BorderLayout.NORTH);
        panel.add(button3, BorderLayout.NORTH);
        panel.add(button4, BorderLayout.NORTH);
        panel.add(button5, BorderLayout.NORTH);
        frame.add(panel);
        frame.setVisible(true);
        frame.pack();
    }

    public static void main(String[] args) {
        new Sarcina2();
    }

}
