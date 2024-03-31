package list_comboBox_spinner_textField;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class spiner extends JFrame {

    spiner(){
        super("Spinner");
        setSize(700,850);
        JPanel upP = new JPanel(new BorderLayout());
        JPanel boP = new JPanel(new BorderLayout());
        setLayout(new GridLayout(2,1));
        upP.add(new JLabel("Spinner cu numere"), BorderLayout.WEST);
        upP.add(new JSpinner(new SpinnerNumberModel(7,1,10,1)), BorderLayout.EAST);

        boP.add(new JLabel("Spinner cu liste"), BorderLayout.WEST);
        String[] luni = {"Ianuarie", "Februarie", "Martie","Aprilie","Mai","Iunie","Iulie","August","Septembrie","Octombrie","Noiembrie","Decembrie"};
        boP.add(new JSpinner(new SpinnerListModel(luni)), BorderLayout.CENTER);
        add(upP);
        add(boP);
        setVisible(true);
    }
    public static void main(String[] args) {
        new spiner();
    }
}
