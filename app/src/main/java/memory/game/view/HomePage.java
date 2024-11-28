package memory.game.view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HomePage implements ActionListener {
    private JFrame mainFrame;
    private JLabel label1,label2, score1, score2, score3, board;
    private JPanel labelPanel, buttonPanel, scorePanel;
    private JButton button1,button2,button3;
    //private JTextArea leaderboardTextArea;

    public HomePage(){
    mainFrame = new JFrame();
    mainFrame.setLayout(new BorderLayout());
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    HomePageUI();

    }

    private void HomePageUI(){
        labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
        Dimension buttonSize = new Dimension(200, 40);    

        label1 = new JLabel("Welcome to Memory Game");
        label1.setFont(new Font("Bauhaus 93", Font.PLAIN, 50));    
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelPanel.add(label1);

        label2 = new JLabel("Select an option to play");
        label2.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelPanel.add(label2);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        
        //button1
        button1 = new JButton("Number Game");
        button1.setFont(new Font("Stencil", Font.PLAIN, 20));
        button1.setMaximumSize(buttonSize);
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonPanel.add(button1);

        //button2
        button2 = new JButton("Word Game");
        button2.setFont(new Font("Stencil", Font.PLAIN, 20));
        button1.setMaximumSize(buttonSize);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonPanel.add(button2);

        //button3
        button3 = new JButton("Image Game");
        button3.setFont(new Font("Stencil", Font.PLAIN, 20));
        button1.setMaximumSize(buttonSize);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonPanel.add(button3);

        scorePanel = new JPanel();
        scorePanel.setLayout(new BoxLayout(scorePanel, BoxLayout.Y_AXIS));
        
        board = new JLabel("Leader Board");
        board.setFont(new Font("Stencil", Font.PLAIN, 25));
        scorePanel.add(board);

        // leaderboardTextArea = new JTextArea(10, 30);
        // leaderboardTextArea.setFont(new Font("Arial", Font.PLAIN, 18));
        // leaderboardTextArea.setEditable(false);
        // scorePanel.add(leaderboardTextArea);

        mainFrame.add(labelPanel, BorderLayout.NORTH);
        mainFrame.add(buttonPanel, BorderLayout.CENTER);
        mainFrame.add(scorePanel, BorderLayout.SOUTH);

        mainFrame.pack();
        mainFrame.setVisible(true);
    }
    
    //leader board scores
    // public void updateLeaderboard(ArrayList<String> leaderboardData) {
    //     leaderboardTextArea.setText(""); // Clear previous data
    //     for (String entry : leaderboardData) {
    //         leaderboardTextArea.append(entry + "\n");
    //     }
    // }

    // attach action listeners to buttons
    public void addActionListener(ActionListener listener) {
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
    }

    public JFrame getMainFrame() {
        return mainFrame;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

}

