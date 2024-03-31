package dialog_optionP_colCh_fileCh_prBar_scrBar_slider;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Dialog2 extends JFrame implements ActionListener
{
    private JPanel topPanel;
    private JButton buttonError;
    private JButton buttonWarning;
    private JButton buttonInfo;
    private JButton buttonQuestion;
    private JButton buttonPlain;
    public Dialog2()
    {
        setTitle( "Dialog Test Frame" );
        setSize( 310, 130 );
        setBackground( Color.gray );
        topPanel = new JPanel();
        topPanel.setLayout( new FlowLayout() );
        getContentPane().add( topPanel );
        buttonError = new JButton( "Error" );
        topPanel.add( buttonError );
        buttonWarning = new JButton( "Warning" );
        topPanel.add( buttonWarning );
        buttonInfo = new JButton( "Informational" );
        topPanel.add( buttonInfo );
        buttonQuestion = new JButton( "Question" );
        topPanel.add( buttonQuestion );
        buttonPlain = new JButton( "Plain" );
        topPanel.add( buttonPlain );
        buttonError.addActionListener( this );
        buttonWarning.addActionListener( this );
        buttonInfo.addActionListener( this );
        buttonQuestion.addActionListener( this );
        buttonPlain.addActionListener( this );
    }
    public void actionPerformed( ActionEvent event )
    {
        System.out.println( event );
        if( event.getSource() == buttonError )
        {
            JOptionPane dialog = new JOptionPane();
            dialog.showMessageDialog( this, "This is an error",
                    "Error", JOptionPane.ERROR_MESSAGE );
        }
        else if( event.getSource() == buttonWarning )
        {
            Object[] possibleValues = { "First", "Second", "Third" };
            JOptionPane dialog = new JOptionPane();
            Object selectedValue= dialog.showInputDialog( this,"This is a warning",
                    "Warning", JOptionPane.WARNING_MESSAGE,
                    null, possibleValues, possibleValues[0] );
        }
        else if( event.getSource() == buttonInfo )
        {
            JOptionPane dialog = new JOptionPane();
            dialog.showConfirmDialog( this,"This is an informational message",
                    "Information", JOptionPane.CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null );
        }
        else if( event.getSource() == buttonQuestion )
        {
            JOptionPane dialog = new JOptionPane();
            dialog.showConfirmDialog( this, "Is this a question?","Question",

                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null );
        }
        else if( event.getSource() == buttonPlain )
        {
            JOptionPane dialog = new JOptionPane();
            dialog.showConfirmDialog( this, "This is a plain message","Plain",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null );
        }
    }
    public static void main( String args[] )
    {
        Dialog2 mainFrame = new Dialog2();
        mainFrame.setVisible( true );
    }
}
































