package list_comboBox_spinner_textField;

import javax.swing.*;
import java.awt.*;

public class lista extends JFrame {
    lista() {
        super("lista");
        setLayout(new BorderLayout());
        setSize(400,400);
        String[] listData = {"elementul 1", "i", "n", "f"};
        JList<String> list = new JList(listData);
        list.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(list, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new lista();
    }
}