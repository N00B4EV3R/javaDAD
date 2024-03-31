package tree_table_menu_toolbar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Meniu extends JFrame
{
    private JPanel topPanel;
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenu menuEdit;
    private JMenu menuProperty;
    public Meniu()
    {
        setTitle( "Menu Application" );
        setSize( 310, 130 );
        topPanel = new JPanel();topPanel.setLayout( new BorderLayout() );
        getContentPane().add( topPanel );
// Creeaza bara de meniu
        menuBar = new JMenuBar();
// Seteaza aceasta instanta ca fiind bara de meniu a aplicatiei
        setJMenuBar( menuBar );
// creeaza un submeniu "Properties"
        menuProperty = new JMenu( "Properties" );
//iteme pentru properties
        JMenuItem item1 = new JMenuItem("Item1");
        JMenuItem item2 = new JMenuItem("Item2");
        JMenuItem item3 = new JMenuItem("Item3");
        menuProperty.add(item1);
        menuProperty.add(item2);
        menuProperty.add(item3);
// Creeaza un meniu "File"
        menuFile = new JMenu( "File" );
        menuBar.add( menuFile );
// Adauga submeniul "Properties" la meniul "File"
        menuFile.addSeparator();
        menuFile.add( menuProperty );
        menuFile.addSeparator();
// Creeaza meniul "Edit"
        menuEdit = new JMenu( "Edit" );
        menuBar.add( menuEdit );
    }
    public static void main( String args[] )
    {
        Meniu mainFrame = new Meniu();
        mainFrame.setVisible( true );
    }
}
