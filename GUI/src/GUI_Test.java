import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUI_Test implements ActionListener {

    private static int numberOfLabels, balance = 5;
    private static JFrame frame;
    private static JLabel headLabel;
    private static JLabel labels;
    private static JPanel panel;
    private static JButton button, buttonNext;

    public static void main(String[] args) {

        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(800, 600);
        frame.setTitle("GUI Testing");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(new GridLayout(8, 8));
        panel.setBackground(new Color(54, 59, 71));
        panel.setMaximumSize(new Dimension(400, 400));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        headLabel = new JLabel();
        headLabel.setText("GUI Experimenting");
        headLabel.setForeground(new Color(123, 154, 114));
        headLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headLabel.setFont(new Font("Consolas", Font.BOLD, 24));
        panel.add(headLabel);

        button = new JButton("Add more labels");
        button.setPreferredSize(new Dimension(40, 40));
        button.addActionListener(new GUI_Test());
        panel.add(button);

        buttonNext = new JButton("It's the new BUTTON!");
        buttonNext.addActionListener(new GUI_Test());

        frame.setVisible(true);
    }

    public static void addLabels() {
        numberOfLabels++;
        labels = new JLabel();
        labels.setText("Label " + (numberOfLabels));
        labels.setForeground(new Color(224, 108, 113));
        labels.setFont(new Font("Consolas", Font.PLAIN, 16));
        panel.add(labels);
        balance--;
        if (balance == 0) {
            button.setVisible(false);
            panel.add(buttonNext);

        }
        System.out.println("New label added.");
        System.out.println("Balance left " + balance);
        frame.validate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            addLabels();
        } else if (e.getSource() == buttonNext) {
            System.out.println("New button is working!");
        }

    }

}
