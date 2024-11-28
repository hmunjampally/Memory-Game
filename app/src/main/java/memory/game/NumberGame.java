package memory.game;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class NumberGame {

    JPanel numberPanel, other, bottomPanel;
    JFrame numberFrame = new JFrame();
    JLabel label, timeLabel, chanceLabel;
    JButton numberbuttons, saveButton;
    ArrayList<Integer> numbers = new ArrayList<>();
    Random rand = new Random();

    public NumberGame(int x, int y)
    {
        int row = x;
        int col = y;
        
        //chances left label
        chanceLabel = new JLabel("Number of chances left: 5");
        chanceLabel.setFont(new Font("Stencil", Font.BOLD, 20));
        chanceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        chanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        chanceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        //bottom panel
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        bottomPanel.add(chanceLabel);

        numberFrame.setPreferredSize(new Dimension(800,800));
        numberFrame.setLayout(new BorderLayout());

        numberPanel = new JPanel();
        numberPanel.setLayout(new GridLayout(row,col));
        numberPanel.setPreferredSize(new Dimension(500, 500));

        other = new JPanel();
        other.setLayout(new BoxLayout(other, BoxLayout.Y_AXIS));

        label = new JLabel("Your number game is here");
        label.setFont(new Font("Stencil", Font.PLAIN,30));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.add(Box.createVerticalStrut(20));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        other.add(label);
        other.add(Box.createVerticalStrut(20));

        timeLabel = new JLabel("Time taken to pair the match : 7 sec ");
        timeLabel.setFont(new Font("Stencil", Font.PLAIN,20));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        timeLabel.add(Box.createVerticalStrut(20));
        other.add(timeLabel);

        other.add(Box.createVerticalStrut(20));
        JButton button1= new JButton("3");
        JButton button2= new JButton();
        JButton button3= new JButton();
        JButton button4= new JButton();
        JButton button5= new JButton();
        JButton button6= new JButton();
        JButton button7= new JButton();
        JButton button8= new JButton();
        JButton button9= new JButton();
        JButton button10= new JButton();
        JButton button11= new JButton("3");
        JButton button12= new JButton();
        JButton button13= new JButton();
        JButton button14= new JButton();
        JButton button15= new JButton();
        JButton button16= new JButton();

        button1.setEnabled(false);
        button11.setEnabled(false);

        button1.setFont(new Font("Arial", Font.BOLD, 50));
        button11.setFont(new Font("Arial", Font.BOLD, 50));


        numberPanel.add(button1);
        numberPanel.add(button2);
        numberPanel.add(button3);
        numberPanel.add(button4);
        numberPanel.add(button5);
        numberPanel.add(button6);
        numberPanel.add(button7);
        numberPanel.add(button8);
        numberPanel.add(button9);
        numberPanel.add(button10);
        numberPanel.add(button11);
        numberPanel.add(button12);
        numberPanel.add(button13);
        numberPanel.add(button14);
        numberPanel.add(button15);
        numberPanel.add(button16);

        
        numberFrame.add(other,BorderLayout.NORTH);
        numberFrame.add(numberPanel,BorderLayout.CENTER);
        numberFrame.add(bottomPanel, BorderLayout.SOUTH);
        numberFrame.pack();
        numberFrame.setVisible(true);
        numberFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
