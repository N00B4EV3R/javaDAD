package list_comboBox_spinner_textField;

import javax.swing.*;

public class COMBOBOX extends JFrame {
    COMBOBOX(){
        super("comboBox");
        setSize(400,400);
        JComboBox combo = new JComboBox();
        combo.addItem("Element1");
        combo.addItem("Element2");
        combo.addItem("Element3");
        combo.addItem("Element4");
        combo.addItem("Element5");

        add(combo);
        setVisible(true);
    }

    public static void main(String[] args) {
        new COMBOBOX();
    }
}
