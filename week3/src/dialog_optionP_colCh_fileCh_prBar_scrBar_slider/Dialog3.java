package dialog_optionP_colCh_fileCh_prBar_scrBar_slider;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Dialog3 extends JFrame implements ActionListener
{
    private JPanel topPanel;
    private JButton buttonFile;
    public Dialog3()
    {
        setTitle( "Color Chooser Dialog Example" );
        setSize( 380, 120 );
        setBackground( Color.gray );
        topPanel = new JPanel();
        topPanel.setLayout( new FlowLayout() );
        getContentPane().add( topPanel );
        buttonFile = new JButton( "Select Color" );
        topPanel.add( buttonFile );
        buttonFile.addActionListener( this );
    }
    public void actionPerformed( ActionEvent event )
    {
        System.out.println( event );
        if( event.getSource() == buttonFile )
        {
// Deschide un dialog "color chooser" si extrage culoarea
            Color color=JColorChooser.showDialog(this,"Select Color",Color.white );
        }
    }
    public static void main( String args[] )
    {
        Dialog3 mainFrame = new Dialog3();
        mainFrame.setVisible( true );
    }
}