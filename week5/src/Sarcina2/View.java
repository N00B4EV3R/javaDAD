package Sarcina2;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class View extends JFrame {
    private JTextField num1 = new JTextField(20);
    private JTextField num2 = new JTextField(20);
    private ArrayList<JButton> beforeBtn = new ArrayList<>();
    private ArrayList<JButton> afterBtn = new ArrayList<>();
    private JLabel valutaB = new JLabel("EUR");
    private JLabel valutaA = new JLabel("USD");
    private Model model;
    View(Model model){
        this.model=model;

        num1.setText(model.getINITIAL_BEFORE_VALUE()+"");
        num2.setText(model.getINITAL_AFTER_VALUE()+"");
        JPanel content = new JPanel();
        JPanel fpart = new JPanel(new GridLayout(2,1,0, 6));
        JPanel upPart = new JPanel(new GridLayout(1,2));
        upPart.add(num1);
        upPart.add(valutaB);
        fpart.add(upPart);

        JPanel bottomPart = new JPanel(new GridLayout(1,3));
        beforeBtn.add(new JButton("MDL"));
        beforeBtn.add(new JButton("USD"));
        beforeBtn.add(new JButton("EUR"));

        for(int i=0;i<beforeBtn.size();i++){
            setDim(beforeBtn.get(i).getText(),0);
            bottomPart.add(beforeBtn.get(i));
        }
        fpart.add(bottomPart);


        JPanel spart = new JPanel(new GridLayout(2,1,0, 6));
        JPanel upPartSecond = new JPanel(new GridLayout(1,2));
        upPartSecond.add(num2);
        upPartSecond.add(valutaA);
        spart.add(upPartSecond);

        JPanel bottomPartSecond = new JPanel(new GridLayout(1,3));
        afterBtn.add(new JButton("MDL"));
        afterBtn.add(new JButton("USD"));
        afterBtn.add(new JButton("EUR"));
        for(int i=0;i<afterBtn.size();i++){
            setDim(afterBtn.get(i).getText(),1);
            bottomPartSecond.add(afterBtn.get(i));
        }
        spart.add(bottomPartSecond);


        content.add(fpart);
        content.add(spart);
        add(content);

        pack();
        setTitle("Curs Valutar - MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void setDim(String but, int list){
        JButton button;
        if(list==0) {
            if(but.equalsIgnoreCase("MDL")) {
                button = beforeBtn.get(0);
            } else if(but.equalsIgnoreCase("USD")){
                button=beforeBtn.get(1);
            } else{
                button=beforeBtn.get(2);
            }
        }  else{
            if(but.equalsIgnoreCase("MDL")) {
                button = afterBtn.get(0);
            } else if(but.equalsIgnoreCase("USD")){
                button=afterBtn.get(1);
            } else{
                button=afterBtn.get(2);
            }
        }

        Font font = button.getFont();
        if(list==0){
            if(button.getText().equals(valutaB.getText())){
                button.setFont(new Font(font.getFontName(), Font.BOLD, font.getSize()));
                button.setForeground(Color.white);
                button.setBackground(Color.orange);
            } else {
                button.setFont(new Font(font.getFontName(), Font.PLAIN, font.getSize()));
                button.setForeground(Color.black);
                button.setBackground(Color.white);
            }
        } else {
            if(button.getText().equals(valutaA.getText())){
                button.setFont(new Font(font.getFontName(), Font.BOLD, font.getSize()));
                button.setForeground(Color.white);
                button.setBackground(Color.orange);
            } else {
                button.setFont(new Font(font.getFontName(), Font.PLAIN, font.getSize()));
                button.setForeground(Color.black);
                button.setBackground(Color.white);
            }
        }
    }

    String getUserInput(){
        return num1.getText();
    }

    void setPrice(String price){
        num2.setText(price);
    }

    void addL1Listener(ActionListener all){
        beforeBtn.get(0).addActionListener(all);
    }

    void addU1Listener(ActionListener aul){
        beforeBtn.get(1).addActionListener(aul);
    }

    void addE1Listener(ActionListener ael){
        beforeBtn.get(2).addActionListener(ael);
    }

    void addL2Listener(ActionListener all){
        afterBtn.get(0).addActionListener(all);
    }

    void addU2Listener(ActionListener aul){
        afterBtn.get(1).addActionListener(aul);
    }

    void addE2Listener(ActionListener ael){
        afterBtn.get(2).addActionListener(ael);
    }

    void addNum1Listener(DocumentListener num1L){
        num1.getDocument().addDocumentListener(num1L);
    }

    void addNum2Listener(DocumentListener num2L){
        num2.getDocument().addDocumentListener(num2L);
    }


    public String getValutaB() {
        return valutaB.getText();
    }

    public void setValutaB(String val) {
        valutaB.setText(val);
    }

    public String getValutaA() {
        return valutaA.getText();
    }

    public void setValutaA(String val) {
        valutaA.setText(val);
    }

    public String getSuma(){
        return num1.getText();
    }

    public String getAmount(){
        return num2.getText();
    }

    public void setSuma(String suma){
        num1.setText(suma);
    }

    public void showError(String err){
        JOptionPane.showMessageDialog(this, err);
    }
}
