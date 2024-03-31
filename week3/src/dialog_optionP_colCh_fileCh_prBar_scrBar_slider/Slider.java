package dialog_optionP_colCh_fileCh_prBar_scrBar_slider;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class Slider extends JFrame implements ChangeListener
{
    private JSlider scrollerR;
    private JSlider scrollerG;
    private JSlider scrollerB;
    private JLabel labelR;
    private JLabel labelG;
    private JLabel labelB;
    private Label labelColor;
    private JPanel topPanel;
    public Slider()
    {
        setTitle( "Slider Application" );
        setSize( 330, 280 );
        setBackground( Color.gray );
        topPanel = new JPanel();
        topPanel.setLayout( null );
        topPanel.setDoubleBuffered( false );
        getContentPane().add( topPanel );
        labelR = new JLabel( "Red" );
        labelR.setBounds( 20, 15, 250, 20 );
        topPanel.add( labelR );
        labelG = new JLabel( "Green" );
        labelG.setBounds( 20, 75, 250, 20 );
        topPanel.add( labelG );
        labelB = new JLabel( "Blue" );
        labelB.setBounds( 20, 135, 250, 20 );
        topPanel.add( labelB );
        labelColor = new Label();
        labelColor.setBounds( 100, 210, 100, 30 );
        labelColor.setBackground( new Color( 0, 0, 0 ) );
        topPanel.add( labelColor );
        scrollerR = new JSlider( SwingConstants.HORIZONTAL,0, 255, 0 );
        scrollerR.setBounds( 20, 35, 290, 40 );
        scrollerR.setMajorTickSpacing( 40 );
        scrollerR.setMinorTickSpacing( 10 );
        scrollerR.setPaintTicks( true );
        scrollerR.setPaintLabels( true );
        scrollerR.addChangeListener( this );
        topPanel.add( scrollerR );
        scrollerG = new JSlider( SwingConstants.HORIZONTAL,0, 255, 0 );
        scrollerG.setBounds( 20, 95, 290, 40 );
        scrollerG.setMajorTickSpacing( 40 );
        scrollerG.setMinorTickSpacing( 10 );
        scrollerG.setPaintTicks( true );
        scrollerG.setPaintLabels( true );
        scrollerG.addChangeListener( this );
        topPanel.add( scrollerG );
        scrollerB = new JSlider( SwingConstants.HORIZONTAL,0, 255, 0 );
        scrollerB.setBounds( 20, 155, 290, 40 );
        scrollerB.setMajorTickSpacing( 40 );
        scrollerB.setMinorTickSpacing( 10 );
        scrollerB.setPaintTicks( true );
        scrollerB.setPaintLabels( true );
        scrollerB.addChangeListener( this );
        topPanel.add( scrollerB );
    }
    public void stateChanged( ChangeEvent event )
    {
        if( event.getSource() == scrollerR ||
                event.getSource() == scrollerG ||
                event.getSource() == scrollerB )
        {
// Obtine setarile curente ale culorilor
            int iRed = scrollerR.getValue();
            int iGreen = scrollerG.getValue();
            int iBlue = scrollerB.getValue();
// Actualizeaza culoarea
            labelColor.setBackground(
                    new Color( iRed, iGreen, iBlue ) );
        }
    }
    public static void main( String args[] )
    {
        Slider mainFrame = new Slider();
        mainFrame.setVisible( true );
    }
}
