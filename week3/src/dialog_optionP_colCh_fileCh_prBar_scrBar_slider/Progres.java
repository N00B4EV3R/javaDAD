package dialog_optionP_colCh_fileCh_prBar_scrBar_slider;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class Progres extends JFrame implements ActionListener
{
    private JProgressBar progress;
    private JButton button;
    private JLabel label1;
    private JPanel topPanel;
    public Progres()
    {
        setTitle( "Progress Bar Application" );
        setSize( 310, 130 );
        setBackground( Color.gray );
        topPanel = new JPanel();
        topPanel.setPreferredSize( new Dimension( 310, 130 ) );
        getContentPane().add( topPanel );
// Creeaza o eticheta si o bara de progres
        label1 = new JLabel( "Waiting to start tasks..." );
        label1.setPreferredSize( new Dimension( 280, 24 ) );
        topPanel.add( label1 );
        progress = new JProgressBar();
        progress.setPreferredSize( new Dimension( 300, 20 ) );
        progress.setMinimum( 0 );
        progress.setMaximum( 20 );
        progress.setValue( 0 );
        progress.setBounds( 20, 35, 260, 20 );
        topPanel.add( progress );
        button = new JButton( "Start" );
        topPanel.add( button );
        button.addActionListener( this );
    }
    public void actionPerformed( ActionEvent event )
    {
        if( event.getSource() == button )
        {
// Nu permite mai multe apasari ale butonului
            button.setEnabled( false );
            for( int iCtr = 1; iCtr < 21; iCtr++ )
            {
                DoBogusTask( iCtr );
// Actualizeaza indicatorul si eticheta din bara de progres
                label1.setText( "Performing task " + iCtr + " of 20" );
                Rectangle labelRect = label1.getBounds();
                labelRect.x = 0;
                labelRect.y = 0;
                label1.paintImmediately( labelRect );
                progress.setValue( iCtr );
                Rectangle progressRect = progress.getBounds();
                progressRect.x = 0;
                progressRect.y = 0;
                progress.paintImmediately( progressRect );
            }
        }
    }
    public void DoBogusTask( int iCtr )
    {
        Random random = new Random( iCtr );
// Pierde un timp
        for( int iValue = 0;iValue < random.nextFloat() * 10000; iValue++ )
        {
            System.out.println( "iValue=" + iValue );
        }
    }
    public static void main( String args[] )
    {
        Progres mainFrame = new Progres();
        mainFrame.setVisible( true );
        mainFrame.pack();
    }
}