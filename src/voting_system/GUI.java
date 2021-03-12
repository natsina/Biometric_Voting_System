package voting_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * The type Gui.
 *
 * @author Group 9
 */
public class GUI extends JFrame implements ActionListener{

    /**
     * Instantiates a new GUI.
     * Design of GUI is written here
     */
    GUI(){

        setBounds(0, 0, 1600, 900);
        getContentPane().setBackground(Color.white);

        JLabel l1 = new JLabel("Welcome to Ghana's Voting Portal", SwingConstants.CENTER);
        l1.setLayout(null);
        l1.setBounds(140,350,1000,100);
        l1.setFont(new Font("Tahoma", Font.BOLD,52));
        add(l1);


        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("voting_system/icons/Image.png"));
        JLabel imag = new JLabel(icon);
        imag.setBounds(500,150,511,162);
        add(imag);

        JButton button = new JButton("Next Page");
        button.setBounds(1000,600,300,150);
        button.addActionListener(this);
        button.setFont(new Font("Tahoma", Font.BOLD,30));
        add(button);

        setLayout(null);
        setVisible(true);

    }

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Voting().setVisible(true);
    }
}