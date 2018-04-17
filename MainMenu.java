/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniGameProject;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageProducer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Zachary House
 */
public class MainMenu
{
    private JFrame buildMainMenuFrame()
    {
        JFrame menuFrame = new JFrame( "Test Game" );
        JPanel gamePanel = new JPanel( false );
        
        menuFrame.setContentPane( new JLabel( new ImageIcon( getClass().getClassLoader().getResource( "resources/sword-shield.jpg" ) ) ) );
        
        menuFrame.setResizable( true );         // Change to false after testing
        menuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuFrame.setSize(889, 500);
        menuFrame.setVisible(true);
        
        Insets margin = new Insets( 0, 0, 0, 0 );
        
        JPanel menuPanel = new JPanel();
        menuFrame.add( menuPanel );
//        menuPanel.add( new JLabel( new ImageIcon( getClass().getClassLoader().getResource( "resources/sword-shield.jpg" ) ) ) );
        menuPanel.setBorder( null );
        menuPanel.setSize(889, 500);
        menuPanel.setOpaque( false );
        menuPanel.setLayout( null );
        
        JLabel menuTitleTop = new JLabel( "My First" );
        menuPanel.add( menuTitleTop );
        menuTitleTop.setBorder( null );
        menuTitleTop.setSize( 300, 100 );
        menuTitleTop.setLocation( 20, 10 );
        menuTitleTop.setVisible( true );
        menuTitleTop.setFont( new Font( "Bodoni MT Poster Compressed", Font.PLAIN, 80));
        
        JLabel menuTitleBottom = new JLabel( "RPG" );
        menuPanel.add( menuTitleBottom );
        menuTitleBottom.setBorder( null );
        menuTitleBottom.setSize( 300, 100 );
        menuTitleBottom.setLocation( menuTitleTop.getX(), menuTitleTop.getY() + menuTitleTop.getHeight() );
        menuTitleBottom.setVisible( true );
        menuTitleBottom.setFont( new Font( "Bodoni MT Poster Compressed", Font.PLAIN, 150 ));
        
        JButton buttonStart = new JButton( "", new ImageIcon( getClass().getClassLoader().getResource( "resources/Start-Button.jpg" ) ) );
        menuPanel.add( buttonStart );
        buttonStart.setFocusable( false );
        buttonStart.setContentAreaFilled( false );
        buttonStart.setBorder( null );
        buttonStart.setMargin( margin );
        buttonStart.setSize( 202, 104 );
        buttonStart.setLocation( 665, 150 );
        buttonStart.setVisible( true );
        turnGreenOnMouseOver( buttonStart, "resources/Start-Button.jpg", "resources/Start-Button-MouseOver.jpg" );
        buttonStart.addActionListener( ( ActionEvent e ) ->
        {
            menuPanel.setVisible( false );
            gamePanel.setVisible( true );
        } );
        
        JButton buttonLoad = new JButton( "", new ImageIcon( getClass().getClassLoader().getResource( "resources/Load-Button.jpg" ) ) );
        menuPanel.add( buttonLoad );
        buttonLoad.setFocusable( false );
        buttonLoad.setContentAreaFilled( false );
        buttonLoad.setBorder( null );
        buttonLoad.setMargin( margin );
        buttonLoad.setSize( 202, 104 );
        buttonLoad.setLocation( 665, 250 );
        buttonLoad.setVisible( true );
        turnGreenOnMouseOver( buttonLoad, "resources/Load-Button.jpg", "resources/Load-Button-MouseOver.jpg" );
        buttonStart.addActionListener( ( ActionEvent e ) -> {  } );
        
        JButton buttonAbout = new JButton( "", new ImageIcon( getClass().getClassLoader().getResource( "resources/About-Button.jpg" ) ) );
        menuPanel.add( buttonAbout );
        buttonAbout.setFocusable( false );
        buttonAbout.setContentAreaFilled( false );
        buttonAbout.setBorder( null );
        buttonAbout.setMargin( margin );
        buttonAbout.setSize( 202, 104 );
        buttonAbout.setLocation( 665, 350 );
        buttonAbout.setVisible( true );
        turnGreenOnMouseOver( buttonAbout, "resources/About-Button.jpg", "resources/About-Button-MouseOver.jpg" );
        buttonStart.addActionListener( ( ActionEvent e ) -> { buttonStart.doClick(); } );
        
        buttonStart.requestFocusInWindow();
        menuPanel.validate();
        menuFrame.validate();
        return menuFrame;
    }
    
    public void turnGreenOnMouseOver( JButton button, String fileName_Regular, String fileName_MouseOver )
    {
        button.addMouseListener( new MouseAdapter()
        {
            @Override
            public void mouseExited(MouseEvent me)
            {
                button.setIcon( new ImageIcon( getClass().getClassLoader().getResource( fileName_Regular ) ) );
            }
            
            @Override
            public void mouseEntered(MouseEvent me)
            {
                button.setIcon( new ImageIcon( getClass().getClassLoader().getResource( fileName_MouseOver ) ) );
            }
        });
    }
    
    public MainMenu()
    {
        JFrame menuFrame = buildMainMenuFrame();
    }
    
    public static void main( String[] args ) {
        MainMenu main = new MainMenu();
    }
}
