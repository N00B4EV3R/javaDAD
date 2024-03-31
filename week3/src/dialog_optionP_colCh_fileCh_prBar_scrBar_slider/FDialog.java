package dialog_optionP_colCh_fileCh_prBar_scrBar_slider;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FDialog extends JFrame implements ActionListener
{
    private final int ITEM_PLAIN = 0; // Item types
    private final int ITEM_CHECK = 1;
    private final int ITEM_RADIO = 2;
    private JTextArea textA;
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenuItem menuFileNew;
    private JMenuItem menuFileOpen;
    private JMenuItem menuFileSave;
    private JMenuItem menuFileExit;
    private JFileChooser chooser;
    public FDialog()
    {
        setTitle( "Complete Menu Application" );
        setSize( 700, 700 );
// Creeaza zona de text
        textA = new JTextArea();
        textA.setEditable(false);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add( textA );
        getContentPane().add( scrollPane,BorderLayout.CENTER );
// Creeaza bara de meniu
        menuBar = new JMenuBar();
// Seteaza aceasta instanta ca fiind bara de meniu a aplicatiei
        setJMenuBar( menuBar );
// Creeaza un meniu "File"
        menuFile = new JMenu( "File" );
        menuFile.setMnemonic( 'F' );
        menuBar.add( menuFile );
// Construieste optiunile meniului "File"
        menuFileNew=CreateMenuItem(menuFile,ITEM_PLAIN,"New",null, 'N', null );
        menuFileOpen=CreateMenuItem(menuFile,ITEM_PLAIN,"Open",null,
                'O',"Open a new file" );
        menuFileSave = CreateMenuItem( menuFile, ITEM_PLAIN, "Save",null,
                'S'," Save this file" );
        menuFileExit = CreateMenuItem( menuFile, ITEM_PLAIN,"Exit", null,
                'x',"Exit the program" );
//Creeaza un dialog "file chooser"
        chooser=new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
    }
    public JMenuItem CreateMenuItem( JMenu menu, int iType,String sText,
                                     ImageIcon image,
                                     int acceleratorKey, String sToolTip )
    {
// Creeaza optiunea meniului
        JMenuItem menuItem;
        switch( iType )
        {
            case ITEM_RADIO:
                menuItem = new JRadioButtonMenuItem();
                break;
            case ITEM_CHECK:
                menuItem = new JCheckBoxMenuItem();
                break;
            default:
                menuItem = new JMenuItem();
                break;
        }
// Adauga textul optiunii
        menuItem.setText( sText );
// Adauga imaginea (optional)
        if( image != null )
            menuItem.setIcon( image );
// Adauga acceleratorul (combinatia de taste)
        if( acceleratorKey > 0 )
            menuItem.setMnemonic( acceleratorKey );
// Adauga textul pentru "tool tip" (optional)
        if( sToolTip != null )
            menuItem.setToolTipText( sToolTip );
// Adauga un obiect ascultator de evenimente pentru aceasta optiune a meniului
        menuItem.addActionListener( this );
        menu.add( menuItem );
        return menuItem;
    }
    public void actionPerformed( ActionEvent event )
    {
        if (event.getSource()==menuFileNew)
        {
            textA.setEditable(true);
            textA.setText("");
        }
        if (event.getSource()==menuFileOpen)
        {
            int returnVal = chooser.showOpenDialog(FDialog.this);
            if (returnVal == chooser.APPROVE_OPTION)
            {
                File file = chooser.getSelectedFile();
                try {
                    FileReader in=new FileReader(file);
                    textA.read(in,null);
                    textA.setEditable(true);
                    in.close();
                }
                catch(IOException ex) {ex.printStackTrace();}
            }
        }
        if (event.getSource()==menuFileSave)
        {
            int returnVal = chooser.showSaveDialog(FDialog.this);
            if (returnVal == chooser.APPROVE_OPTION)
            {
                File file = chooser.getSelectedFile();
                try {
                    FileWriter out=new FileWriter(file);
                    textA.write(out);
                    out.close();
                }
                catch(IOException ex) {ex.printStackTrace();}
            }
        }
        if (event.getSource()==menuFileExit)
        {
            System.exit(0);
        }
    }
    public static void main( String args[] )
    {
        FDialog mainFrame = new FDialog();
        mainFrame.setVisible( true );
    }
}