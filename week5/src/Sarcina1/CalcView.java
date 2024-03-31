package Sarcina1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalcView extends JFrame {
    private JTextField m_userInputTf = new JTextField(5);
    private JTextField m_totalTf = new JTextField(20);
    private JButton m_multiplyBtn = new JButton("Multiply");
    private JButton m_clearBtn = new JButton("Clear");
    private JButton m_addBtn = new JButton("Add");

    private CalcModel m_model;

    CalcView(CalcModel model){
        m_model = model;
        m_model.setValue(CalcModel.INITIAL_VALUE);

        m_totalTf.setText(m_model.getValue());
        m_totalTf.setEditable(false);

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(m_userInputTf);
        JPanel butoane = new JPanel();
        butoane.setLayout(new GridLayout(2,1));
        butoane.add(m_multiplyBtn);
        butoane.add(m_addBtn);
        content.add(butoane);
        content.add(new JLabel("Total"));
        content.add(m_totalTf);
        content.add(m_clearBtn);

        this.setContentPane(content);
        this.pack();

        this.setTitle("Simple Calc - MVC");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void reset(){
        m_totalTf.setText(CalcModel.INITIAL_VALUE);
    }

    String getUserInput(){
        return m_userInputTf.getText();
    }

    void setTotal(String newTotal){
        m_totalTf.setText(newTotal);
    }

    void showError(String errMessage){
        JOptionPane.showMessageDialog(this, errMessage);
    }

    void addMultiplyListener(ActionListener mal){
        m_multiplyBtn.addActionListener(mal);
    }

    void addClearListener(ActionListener cal){
        m_clearBtn.addActionListener(cal);
    }

    void addAddListener(ActionListener aal){
        m_addBtn.addActionListener(aal);
    }
}
