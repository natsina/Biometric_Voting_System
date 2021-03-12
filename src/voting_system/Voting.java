package voting_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;


/**
 * The type Voting.
 *
 * @author Group 9
 */
public class Voting extends JFrame implements ActionListener {

    /**
     * The Votes.
     */
    int votes;
    String name;
    JButton b1, b2, b3, b4, b5, b6;

    
    HashMap<String, Integer> map = new HashMap<>();

    /**
     * The Vote Counter for each Party.
     */
    int counter_PPP, counter_NPP, 
    counter_NDC, counter_CPP;

    
    /**
     * Instantiates a new Voting Interface.
     */
    Voting(){


        /**
         * Voting GUI Design
         */

        setBounds(0, 0, 1400, 900);
        getContentPane().setBackground(Color.white);


        /**
         * Party Images
         */
        ImageIcon candidate_1 = new ImageIcon(ClassLoader.getSystemResource("voting_system/icons/Image 4.jpeg"));
        JLabel c1 = new JLabel(candidate_1);
        c1.setBounds(50,10,300,300);
        add(c1);

        ImageIcon candidate_2 = new ImageIcon(ClassLoader.getSystemResource("voting_system/icons/Image 3.jpeg"));
        JLabel c2 = new JLabel(candidate_2);
        c2.setBounds(1000,60,200,265);
        add(c2);


        ImageIcon candidate_3 = new ImageIcon(ClassLoader.getSystemResource("voting_system/icons/Image 2.jpeg"));
        JLabel c3 = new JLabel(candidate_3);
        c3.setBounds(90,480,200,265);
        add(c3);

        ImageIcon candidate_4 = new ImageIcon(ClassLoader.getSystemResource("voting_system/icons/Image1.jpeg"));
        JLabel c4 = new JLabel(candidate_4);
        c4.setBounds(1000,550,200,133);
        add(c4);

        /**
         * Vote buttons
         */
        b1 = new JButton("VOTE");
        b1.setBounds(120,260,150,50);
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma", Font.BOLD,30));
        add(b1);

        b2 = new JButton("VOTE");
        b2.setBounds(1030,350,150,50);
        b2.addActionListener(this);
        b2.setFont(new Font("Tahoma", Font.BOLD,30));
        add(b2);

        b3 = new JButton("VOTE");
        b3.setBounds(100,720,150,50);
        b3.addActionListener(this);
        b3.setFont(new Font("Tahoma", Font.BOLD,30));
        add(b3);

        b4 = new JButton("VOTE");
        b4.setBounds(1010,700,150,50);
        b4.addActionListener(this);
        b4.setFont(new Font("Tahoma", Font.BOLD,30));
        add(b4);

        b5 = new JButton("View Current Results");
        b5.setBounds(550,400,250,100);
        b5.addActionListener(this);
        b5.setFont(new Font("Tahoma", Font.BOLD,15));
        add(b5);

        b6 = new JButton("Previous Page");
        b6.setBounds(20,360,200,80);
        b6.addActionListener(this);
        b6.setFont(new Font("Tahoma", Font.BOLD,15));
        add(b6);


        setLayout(null);
        setVisible(true);


    }

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        new Voting();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            counter_PPP+=1;
            map.put("PPP", counter_PPP);
            JOptionPane.showMessageDialog(null, "You voted for PPP");

        }

        if(e.getSource() == b2){
            counter_CPP+=1;
            map.put("CPP", counter_CPP);
            JOptionPane.showMessageDialog(null, "You voted for CPP");

        }

        if(e.getSource() == b3){
            counter_NDC+=1;
            map.put("NDC", counter_NDC);
            JOptionPane.showMessageDialog(null, "You voted for NDC");

        }

        if (e.getSource() == b4){
            counter_NPP+=1;
            map.put("NPP", counter_NPP);
            JOptionPane.showMessageDialog(null, "You voted for NPP");

        }



        if (e.getSource() == b5){


            JOptionPane.showMessageDialog(null, "CPP: " + counter_CPP + " NDC: " + counter_NDC + " PPP: " + counter_PPP +" NPP: " + counter_NPP);
        }

        if(e.getSource() == b6){
            new GUI().setVisible(true);

        }





    }

    /**
     * Party votes.
     * Displays votes for all parties
     */
    public void partyVotes() {
        for(String key: this.map.keySet()){

            System.out.println(key + ":" + map.get(key));
        }
    }

}