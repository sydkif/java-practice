import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUI_Test {

    private static int numberOfLabels = 7;
    private static JLabel headLabel;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(800, 600);
        frame.setTitle("GUI Testing");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(new GridLayout(8, 0));
        panel.setBackground(new Color(54, 59, 71));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        headLabel = new JLabel();
        headLabel.setText("GUI Experimenting");
        headLabel.setForeground(new Color(123, 154, 114));
        headLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headLabel.setFont(new Font("Consolas", Font.BOLD, 24));
        panel.add(headLabel);

        JLabel[] labels = new JLabel[numberOfLabels];
        for (int i = 0; i < numberOfLabels; i++) {
            labels[i] = new JLabel();
            labels[i].setText("Label " + (i + 1));
            labels[i].setForeground(new Color(224, 108, 113));
            labels[i].setFont(new Font("Consolas", Font.PLAIN, 16));
            panel.add(labels[i]);
        }

        frame.setVisible(true);
    }

}
