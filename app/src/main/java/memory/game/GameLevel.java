package memory.game;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GameLevel implements ActionListener{
    JButton level1, level2, level3;
    public GameLevel()
    {
        JFrame mainFrame = new JFrame();
        mainFrame.setLayout(new BorderLayout());
        

        //Layout panel  
        JPanel mainPanel = new JPanel();
        
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); 
        mainPanel.setBackground(Color.pink);
        mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT); 
        //mainPanel.add(Box.createVerticalStrut(40));

        //label
        JLabel label = new JLabel("Select a level to play");
        //label.add(Box.createVerticalStrut(80));
        label.setFont(new Font("Bauhaus 93", Font.PLAIN, 40));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Adding the label to a panel that will be at the top (NORTH)
        JPanel labelPanel = new JPanel();
        labelPanel.setBackground(Color.pink);
        labelPanel.add(Box.createVerticalStrut(200));
        labelPanel.add(label);

        //button size
        Dimension buttonSize = new Dimension(220, 40);

        //level 1 button
        level1 = new JButton("Easy level (4x4)");
        level1.setFont(new Font("Stencil", Font.PLAIN, 18));
        level1.setOpaque(false);
        level1.setMaximumSize(buttonSize);
        level1.setHorizontalAlignment(SwingConstants.CENTER);
        level1.setAlignmentX(Component.CENTER_ALIGNMENT);
        level1.addActionListener(this);
        level1.setFocusable(false);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(level1);

        //level 2 button
        level2 = new JButton("Medium level (6x6)");
        level2.setFont(new Font("Stencil", Font.PLAIN, 18));
        level2.setOpaque(false);
        level2.setMaximumSize(buttonSize);
        level2.setHorizontalAlignment(SwingConstants.CENTER);
        level2.setFocusable(false);
        level2.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(level2);

        //level 3 button
        level3 = new JButton("Hard level (8x8)");
        level3.setFont(new Font("Stencil", Font.PLAIN, 18));
        level3.setOpaque(false);
        level3.setMaximumSize(buttonSize);
        level3.setHorizontalAlignment(SwingConstants.CENTER);
        level3.setFocusable(false);
        level3.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(level3);

        mainFrame.add(labelPanel,BorderLayout.NORTH);
        mainFrame.add(mainPanel,BorderLayout.CENTER);

        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        JButton eventListen = (JButton)event.getSource();
        if(eventListen == level1)
        {
            NumberGame mainGame = new NumberGame(5,5);
        }
    }
}
