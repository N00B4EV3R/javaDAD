package laborator1;

import javax.swing.*;
import java.awt.*;

public class P6 {
    P6(){
        JFrame frame = new JFrame("Run");
        frame.setSize(400, 160);
        JPanel mainPanel = new JPanel(new GridLayout(2,1));
        JPanel upPanel = new JPanel();
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        //up
        JLabel label = new JLabel("Open");
        JTextField textField = new JTextField(" ",30);
        upPanel.add(label);
        upPanel.add(textField);
        upPanel.setBackground(Color.white);

        //bottom
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        JButton browseButton = new JButton("Browse...");
        bottomPanel.add(okButton);
        bottomPanel.add(cancelButton);
        bottomPanel.add(browseButton);

        try { UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName() );
        } catch( Exception e ) { }

        mainPanel.add(upPanel);
        mainPanel.add(bottomPanel);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        P6 p = new P6();
    }
}
