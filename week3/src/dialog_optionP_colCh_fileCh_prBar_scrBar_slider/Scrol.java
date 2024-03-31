package dialog_optionP_colCh_fileCh_prBar_scrBar_slider;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Scrol extends JFrame implements AdjustmentListener
{
    private JScrollBar scrollerR;
    private JScrollBar scrollerG;
    private JScrollBar scrollerB;
    private JLabel fieldR;
    private JLabel fieldG;
    private JLabel fieldB;
    private JLabel labelR;
    private JLabel labelG;
    private JLabel labelB;
    private JPanel labelColor;
    private JPanel topPanel;
    public Scrol()
    {
        setTitle( "ScrollBar Application" );
        setBackground( Color.gray );
        topPanel = new JPanel();
        topPanel.setPreferredSize( new Dimension( 300, 220 ) );
        getContentPane().add( topPanel );
        labelR = new JLabel( "Red" );
        labelR.setPreferredSize( new Dimension( 300, 24 ) );
        topPanel.add( labelR );
// Creeaza barele de defilare
        scrollerR = new JScrollBar( SwingConstants.HORIZONTAL,0, 0, 0, 255 );
        scrollerR.setPreferredSize( new Dimension( 200, 15 ) );
        scrollerR.addAdjustmentListener( this );
        topPanel.add( scrollerR );
        fieldR = new JLabel( "0" );
        fieldR.setPreferredSize( new Dimension( 50, 20 ) );
        topPanel.add( fieldR );
        labelG = new JLabel( "Green" );
        labelG.setPreferredSize( new Dimension( 300, 24 ) );
        topPanel.add( labelG );
        scrollerG = new JScrollBar( SwingConstants.HORIZONTAL,0, 0, 0, 255 );
        scrollerG.setPreferredSize( new Dimension( 200, 15 ) );
        scrollerG.addAdjustmentListener( this );
        topPanel.add( scrollerG );
        fieldG = new JLabel( "0" );
        fieldG.setPreferredSize( new Dimension( 50, 20 ) );
        topPanel.add( fieldG );
        labelB = new JLabel( "Blue" );
        labelB.setPreferredSize( new Dimension( 300, 24 ) );
        topPanel.add( labelB );
        scrollerB = new JScrollBar( SwingConstants.HORIZONTAL,0, 0, 0, 255 );
        scrollerB.setPreferredSize( new Dimension( 200, 15 ) );
        scrollerB.addAdjustmentListener( this );
        topPanel.add( scrollerB );
        fieldB = new JLabel( "0" );
        fieldB.setPreferredSize( new Dimension( 50, 20 ) );
        topPanel.add( fieldB );
        labelColor = new JPanel();
        labelColor.setPreferredSize( new Dimension( 100, 40 ) );
        labelColor.setBackground( new Color( 0, 0, 0 ) );
        topPanel.add( labelColor );
    }
    public void adjustmentValueChanged( AdjustmentEvent event )
    {
        if( event.getSource() == scrollerR ||event.getSource() == scrollerG
                ||event.getSource() == scrollerB )
        {
// Obtine setarile curente ale culorilor
            int iRed = scrollerR.getValue();
            int iGreen = scrollerG.getValue();
            int iBlue = scrollerB.getValue();
// Seteaza valorile etichetelor
            fieldR.setText( "" + iRed );
            fieldG.setText( "" + iGreen );
            fieldB.setText( "" + iBlue );
// Actualizeaza culoarea
            labelColor.setBackground(new Color( iRed, iGreen, iBlue ) );
            labelColor.repaint();
        }
    }
    public static void main( String args[] )
    {
        Scrol mainFrame = new Scrol();
        mainFrame.setVisible( true );
        mainFrame.pack();
    }
}
