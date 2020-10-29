import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class GUI_ConverterTest2 implements ActionListener {

    // List of declarations
    private static JFrame frame;
    private static JPanel panel;
    private static JMenu menu;
    private static JMenuBar menuBar;
    private static JMenuItem iL, iW, iT; // Length, Weight, Temperature
    private static JTextField tf1, tf2; // textField1, textField2
    private static JComboBox<String> cb1, cb2; // comboBox1, comboBox2
    private static JLabel label1, label2, label3; // Label symbol1, symbol2, instruction
    private static JButton invBtn; // invisibleButton

    // Custom color (R, G, B)
    static Color C51 = new Color(51, 51, 51); // Easy way to change color on multiple object
    static Color C31 = new Color(31, 31, 31); // No need to change 1 by 1 in the code
    // Also used to shorten the code for setColor

    // The MAIN method
    public static void main(String[] args) {

        new GUI_ConverterTest2();

    }

    // GUI Codes
    GUI_ConverterTest2() {

        frame = new JFrame(); // Create frame
        panel = new JPanel(new BorderLayout()); // Create layout

        menuBar = new JMenuBar(); // Create a menubar
        menu = new JMenu("≡   Click here to begin"); // Create a menu

        frame.setSize(336, 336); // Default window size
        frame.setTitle("Converter"); // Set window title
        frame.setResizable(false); // Lock window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stop process once closed
        frame.setJMenuBar(menuBar); // Include the menubar to the frame
        frame.add(panel); // Add panel to the frame

        iL = new JMenuItem("Length"); // Create new item for menu
        iL.setBackground(C51); // Set BACKGROUND color
        iL.setForeground(Color.WHITE); // Set FONT color
        iL.addActionListener(this); // To implement action on click
        iL.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Set FONT type and size

        iW = new JMenuItem("Weight"); // Create new item for menu
        iW.setBackground(C51); // Set BACKGROUND color
        iW.setForeground(Color.WHITE); // Set FONT color
        iW.addActionListener(this); // To implement action on click
        iW.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Set FONT type and size

        iT = new JMenuItem("Temperature"); // Create new item for menu
        iT.setBackground(C51); // Set BACKGROUND color
        iT.setForeground(Color.WHITE); // Set FONT color
        iT.addActionListener(this); // To implement action on click
        iT.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Set FONT type and size

        menu.setBackground(C31); // Set BACKGROUND color
        menu.setForeground(Color.WHITE); // Set FONT color
        menu.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20)); // Set FONT type and size
        menu.add(iL); // Add items
        menu.add(iW); // in the
        menu.add(iT); // menu
        // menu.setFocusPainted(false);

        menuBar.setBackground(C31); // Set BACKGROUND color
        menuBar.setBorder(BorderFactory.createEmptyBorder()); // To hide white border line
        menuBar.add(menu); // To add menu in menubar

        panel.setBackground(C31); // Set panel BACKGROUND color
        panel.setLayout(null); // To set manually the position of each object

        tf1 = new JTextField("Input value"); // Create a text field for input
        tf1.setBounds(12, 20, 296, 48); // Set the object position (x-axis, y-axis, width, height)
        tf1.setBackground(C31); // Set BACKGROUND color
        tf1.setForeground(Color.WHITE); // Set FONT color
        tf1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 35)); // Set FONT type and size
        tf1.setBorder(BorderFactory.createEmptyBorder()); // To hide white border line
        // tf1.setVisible(false); // To hide or show
        tf1.setFocusable(false); // Lock it from being edited (Only initially, later will be unlocked)
        panel.add(tf1); // Add into the panel

        tf2 = new JTextField("Output value"); // Create a text field for input
        tf2.setBounds(12, 140, 296, 48); // Set the object position (x-axis, y-axis, width, height)
        tf2.setBackground(C31); // Set BACKGROUND color
        tf2.setForeground(Color.WHITE); // Set FONT color
        tf2.setFont(new Font("Segoe UI Light", Font.PLAIN, 35)); // Set FONT type and size
        tf2.setBorder(BorderFactory.createEmptyBorder()); // To hide white border line
        // tf2.setVisible(false); // To hide or show
        tf2.setFocusable(false); // Lock it from being edited
        panel.add(tf2); // Add into the panel

        label1 = new JLabel(""); // Create a label, this one, a symbol (can be labeled anything)
        label1.setBounds(12, 89, 20, 24); // Set the object position (x-axis, y-axis, width, height)
        label1.setForeground(Color.WHITE); // Set FONT color
        label1.setFont(new Font("Segoe MDL2 Assets", Font.PLAIN, 12)); // Set FONT type and size
        // Segoe MDL2 Assets is a special Windows10 for symbols
        panel.add(label1); // Add the label into panel
        label1.setVisible(false); // To hide or show

        label2 = new JLabel(""); // Create a label, this one, a symbol (can be labeled anything)
        label2.setBounds(12, 209, 20, 24); // Set the object position (x-axis, y-axis, width, height)
        label2.setForeground(Color.WHITE); // Set FONT color
        label2.setFont(new Font("Segoe MDL2 Assets", Font.PLAIN, 12)); // Set FONT type and size
        // Segoe MDL2 Assets is a special Windows10 for symbols
        panel.add(label2); // Add the label into panel
        label2.setVisible(false); // To hide or show

        label3 = new JLabel("Press enter or change unit to calculate"); // Create a label for instruction
        label3.setBounds(12, 240, 260, 24); // Set the object position (x-axis, y-axis, width, height)
        label3.setForeground(Color.GRAY); // Set FONT color
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 12));  // Set FONT type and size
        panel.add(label3); // Add the label into panel
        label3.setVisible(false); // To hide or show

        cb1 = new JComboBox<String>(); // Create a combo box
        cb1.setBounds(28, 88, 120, 24); // Set the object position (x-axis, y-axis, width, height)
        cb1.addActionListener(this); // To implement action on click
        cb1.setBackground(C31); // Set BACKGROUND color
        cb1.setForeground(Color.WHITE); // Set FONT color
        cb1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14)); // Set FONT type and size
        cb1.setFocusable(false); // To avoid being highlighted when clicked
        cb1.setUI(ColorArrowUI.createUI(cb1)); // Set the design of comboBox (custom copy from internet)
        panel.add(cb1); // Add the comboBox into panel
        cb1.setVisible(false); // Make it invisible initially

        cb2 = new JComboBox<String>(); // Create a combo box
        cb2.setBounds(28, 208, 120, 24); // Set the object position (x-axis, y-axis, width, height)
        cb2.addActionListener(this); // To implement action on click
        cb2.setBackground(C31); // Set BACKGROUND color
        cb2.setForeground(Color.WHITE); // Set FONT color
        cb2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14)); // Set FONT type and size
        cb2.setFocusable(false); // To avoid being highlighted when clicked
        cb2.setUI(ColorArrowUI.createUI(cb2)); // Set the design of comboBox (custom copy from internet)
        panel.add(cb2); // Add the comboBox into panel
        cb2.setVisible(false); // Make it invisible initially

        invBtn = new JButton(); // Create a button
        invBtn.addActionListener(this); // To implement action on click
        frame.getRootPane().setDefaultButton(invBtn); // Press enter will trigger action
        panel.add(invBtn); // Add button into panel
        // This button is invisible, a dirty trick to trigger action when pressed ENTER.

        frame.setVisible(true); // Display the frame
    }

    @Override
    // This code will run when an action is triggered
    public void actionPerformed(ActionEvent e) {

        cb1.setVisible(true); // Show the comboBox 1
        cb2.setVisible(true); // Show the comboBox 2
        label1.setVisible(true); // Show the label 1
        label2.setVisible(true); // Show the label 2
        label3.setVisible(true); // Show the label 3
        tf1.setFocusable(true); // Unlock textField 1

        // Run this code when LENGTH is selected
        if (e.getSource() == iL) {

            reset(); // Reset both value to 0

            // List of item inside comboBox
            String[] lengthList = { "Centimeters", "Meters", "Kilometers", "Inches", "Feet", "Miles" };
            // Create model for the list
            DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(lengthList);
            DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(lengthList);
            // Apply model to comboBox
            cb1.setModel(model1);
            cb2.setModel(model2);

            menu.setText("≡   Length"); // Change the menu label

        }

        // Run this code when WEIGHT is selected
        if (e.getSource() == iW) {

            reset(); // Reset both value to 0

            // List of item inside comboBox
            String[] weightList = { "Milligrams", "Grams", "Kilograms", "Metric tonnes", "Pounds" };
            // Create model for the list
            DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(weightList);
            DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(weightList);
            // Apply model to comboBox
            cb1.setModel(model1);
            cb2.setModel(model2);

            menu.setText("≡   Weight"); // Change the menu label

        }

        // Run this code when TEMPERATURE is selected
        if (e.getSource() == iT) {

            reset(); // Reset both value to 0

            // List of item inside comboBox
            String[] tempList = { "Celsius", "Fahrenheit", "Kelvin" };
            // Create model for the list
            DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(tempList);
            DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(tempList);
            // Apply model to comboBox
            cb1.setModel(model1);
            cb2.setModel(model2);

            menu.setText("≡   Temperature"); // Change the menu label

        }

        String s = menu.getText(); // Assign menu label text to s
        String s1 = (String) cb1.getSelectedItem(); // Assign selected item of the comboBox to s1
        String s2 = (String) cb2.getSelectedItem(); // Assign selected item of the comboBox to s2

        if (s == "≡   Length") { // If LENGTH is selected run these codes

            LengthConverter from = new LengthConverter(s1);
            LengthConverter to = new LengthConverter(s2);

            double val = Double.parseDouble(tf1.getText()); // Get input from textField1 as DOUBLE
            double meters = from.toMeters(val);
            double converted = to.fromMeters(meters);

            converted = round(converted, 5); // Rounded the number to 5 digits
            tf2.setText(String.valueOf(converted)); // Change textField2 to output value

        } else if (s == "≡   Weight") { // If WEIGHT is selected run these codes

            WeightConverter from = new WeightConverter(s1);
            WeightConverter to = new WeightConverter(s2);

            double val = Double.parseDouble(tf1.getText()); // Get input from textField1 as DOUBLE
            double kilograms = from.toKilograms(val);
            double converted = to.fromKilograms(kilograms);

            converted = round(converted, 5); // Rounded the number to 5 digits
            tf2.setText(String.valueOf(converted)); // Change textField2 to output value

        } else if (s == "≡   Temperature") { // If TEMPERATURE is selected run these codes

            double C, F, K, converted = 0;

            if (s1.equals("Celsius")) { // Celsius to others

                C = Double.parseDouble(tf1.getText()); // Get input from textField1 as DOUBLE

                if (s2.equals("Fahrenheit")) // C to F
                    converted = (C * 9 / 5) + 32;
                else if (s2.equals("Kelvin")) // C to K
                    converted = C + 273.15;
                else // C to C
                    converted = C;

            } else if (s1.equals("Fahrenheit")) { // Fahrenheit to others

                F = Double.parseDouble(tf1.getText());

                if (s2.equals("Celsius")) // F to C
                    converted = (F - 32) * 5 / 9;
                else if (s2.equals("Kelvin")) // F to K
                    converted = (F - 32) * 5 / 9 + 273.15;
                else // F to F
                    converted = F;

            } else if (s1.equals("Kelvin")) { // Kelvin to others

                K = Double.parseDouble(tf1.getText());

                if (s2.equals("Fahrenheit")) // K to F
                    converted = (K - 273.15) * 9 / 5 + 32;
                else if (s2.equals("Celsius")) // K to C
                    converted = K - 273.15;
                else // K to K
                    converted = K;

            }

            converted = round(converted, 5); // Rounded the number to 5 digits
            tf2.setText(String.valueOf(converted)); // Change textField2 to output value

        }
    }

    // reset function
    static void reset() {
        tf1.setText("0"); // Make both textField
        tf2.setText("0"); // to 0
    }

    // Copy paste from internet.
    // To round number, avoid being too long.
    private static double round(double value, int places) {
        if (places < 0)
            throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}

// Conversion class for LENGTH
class LengthConverter {

    final private double CM_TO_METER = 0.01;
    final private double KM_TO_METER = 1000;
    final private double INCH_TO_METER = 0.0254;
    final private double FEET_TO_METER = 0.3048;
    final private double METER_TO_METER = 1;
    final private double MILES_TO_METER = 1609.334;

    private double factor;

    public LengthConverter(String unit) {

        if (unit.equals("Centimeters"))
            factor = CM_TO_METER;
        else if (unit.equals("Kilometers"))
            factor = KM_TO_METER;
        else if (unit.equals("Inches"))
            factor = INCH_TO_METER;
        else if (unit.equals("Feet"))
            factor = FEET_TO_METER;
        else if (unit.equals("Meters"))
            factor = METER_TO_METER;
        else if (unit.equals("Miles"))
            factor = MILES_TO_METER;

    }

    public double toMeters(double measurement) {
        return (measurement * factor);
    }

    public double fromMeters(double measurement) {
        return (measurement / factor);
    }

}

// Conversion class for WEIGHT
class WeightConverter {

    final private double MG_TO_KG = 0.000001;
    final private double GR_TO_KG = 0.001;
    final private double KG_TO_KG = 1;
    final private double MT_TO_KG = 1000;
    final private double PD_TO_KG = 0.453592;

    private double factor;

    public WeightConverter(String unit) {

        if (unit.equals("Milligrams"))
            factor = MG_TO_KG;
        else if (unit.equals("Grams"))
            factor = GR_TO_KG;
        else if (unit.equals("Kilograms"))
            factor = KG_TO_KG;
        else if (unit.equals("Metric tonnes"))
            factor = MT_TO_KG;
        else if (unit.equals("Pounds"))
            factor = PD_TO_KG;

    }

    public double toKilograms(double measurement) {
        return (measurement * factor);
    }

    public double fromKilograms(double measurement) {
        return (measurement / factor);
    }
}

// Copy pasted from internet.
// To create custom flexible design for comboBox
// Make it all black to merge with background.
class ColorArrowUI extends BasicComboBoxUI {

    static Color BLANK = new Color(31, 31, 31);

    public static ComboBoxUI createUI(JComponent c) {
        return new ColorArrowUI();
    }

    @Override
    protected JButton createArrowButton() {
        return new BasicArrowButton(BasicArrowButton.SOUTH, BLANK, BLANK, BLANK, BLANK);
    }
}