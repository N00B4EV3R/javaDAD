package dialog_optionP_colCh_fileCh_prBar_scrBar_slider;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Dialog1 extends JFrame implements ActionListener
{
    private JPanel topPanel;
    private JButton buttonDialog;
    public Dialog1()
    {
        setTitle( "Dialog Test Frame" );
        setSize( 310, 130 );
        setBackground( Color.gray );
        topPanel = new JPanel();
        topPanel.setLayout( new BorderLayout() );
        getContentPane().add( topPanel );
        buttonDialog = new JButton( "Open Dialog" );
        topPanel.add( buttonDialog, BorderLayout.CENTER );
        buttonDialog.addActionListener( this );
    }
    public void actionPerformed( ActionEvent event )
    {
        System.out.println( event );
        TestDialog testDialog = new TestDialog( this );
        testDialog.setVisible( true );
    }
    public static void main( String args[] )
    {
        Dialog1 mainFrame = new Dialog1();
        mainFrame.setVisible( true );
    }
}
class TestDialog extends JDialog
{
    private JFrame parentFrame;
    private JScrollPane scrollPane1;
    public TestDialog( JFrame parentFrame )
    {
// Ne asiguram ca se apela parintele acestei ferestre
        super( parentFrame );
// Salvam ferestra parinte in cazul in care va fi nevoie de ea mai tarziu
        this.parentFrame = parentFrame;
// Setam caracteristicile pentru aceasta instanta dialog
        setTitle( "Test Dialog" );
        setSize( 200, 200 );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
// Creeaza un panel pentru componente
        JPanel topPanel = new JPanel();
        topPanel.setLayout( new BorderLayout() );
        getContentPane().add( topPanel );
// Populeaza panel-ul
        CreateTopPane( topPanel );
    }
    private void CreateTopPane( JPanel topPanel )
    {
        JTextArea area = new JTextArea();
// Incarca un fisier in zona de editare
        try {
            FileReader fileStream = new FileReader( "Dialog1.java" );
            area.read( fileStream, "Dialog1.java" );
        }
        catch( FileNotFoundException e )
        {
            System.out.println( "File not found" );
        }
        catch( IOException e )
        {
            System.out.println( "IOException occurred" );
        }
// Creeaza barele de defilare pentru zona de editare
        scrollPane1 = new JScrollPane();
        scrollPane1.getViewport().add( area );
        topPanel.add( scrollPane1, BorderLayout.CENTER );
    }
}
