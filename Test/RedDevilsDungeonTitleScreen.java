import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RedDevilsDungeonTitleScreen {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Red Devil's Dungeon: The Beginning");
        frame.setSize(800, 600); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // Create a panel for the title screen
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                setBackground(Color.BLACK);

                // Draw the title
                g.setColor(Color.RED);
                g.setFont(new Font("PixelFont", Font.BOLD, 48));
                g.drawString("Red Devil's Dungeon", 180, 200);

                g.setFont(new Font("PixelFont", Font.PLAIN, 24));
                g.drawString("The Beginning", 300, 250);
            }
        };
        panel.setLayout(null); // Use absolute layout for precise button placement

        // Create the Start Game button
        JButton startButton = new JButton("Start Game");
        startButton.setBounds(300, 300, 200, 50); // Set position and size
        startButton.setFont(new Font("PixelFont", Font.PLAIN, 18));
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Starting the game...");
                // Transition to the game screen here
            }
        });
        panel.add(startButton);

        // Create the Exit button
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(300, 400, 200, 50); // Set position and size
        exitButton.setFont(new Font("PixelFont", Font.PLAIN, 18));
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(exitButton);

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
