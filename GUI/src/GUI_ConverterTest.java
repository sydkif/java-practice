import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class GUI_ConverterTest implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;
    private static JButton btnCalculate, btnDistance, btnLength;
    private static JLabel label, unit, result;
    private static JTextField textField;
    private static boolean con;
    private static int formula = 0;
    private static double km, mi, ft, m;

    DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {

        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(240, 240);
        frame.setTitle("Converter");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        btnDistance = new JButton("mi-Km");
        btnDistance.setBounds(20, 20, 80, 25);
        btnDistance.addActionListener(new GUI_ConverterTest());
        panel.add(btnDistance);

        btnLength = new JButton("ft-m");
        btnLength.setBounds(120, 20, 80, 25);
        btnLength.addActionListener(new GUI_ConverterTest());
        panel.add(btnLength);

        label = new JLabel("Choose one of those");
        label.setBounds(20, 60, 180, 25);
        panel.add(label);

        textField = new JTextField();
        textField.setBounds(20, 100, 80, 25);
        panel.add(textField);
        textField.setVisible(false);

        unit = new JLabel();
        unit.setBounds(100, 100, 90, 25);
        panel.add(unit);

        result = new JLabel();
        result.setBounds(20, 130, 90, 25);
        panel.add(result);

        btnCalculate = new JButton("Convert");
        btnCalculate.setBounds(120, 100, 80, 25);
        btnCalculate.addActionListener(new GUI_ConverterTest());
        panel.add(btnCalculate);
        btnCalculate.setVisible(false);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCalculate) {

            switch (formula) {
                case 1: {
                    mi = Double.parseDouble(textField.getText());
                    km = mi * 1.609344;
                    result.setText(df.format(km) + " km");
                    break;
                }

                case 2: {
                    km = Double.parseDouble(textField.getText());
                    mi = km * 0.621371;
                    result.setText(df.format(mi) + " mi");
                    break;
                }

                case 3: {
                    ft = Double.parseDouble(textField.getText());
                    m = ft * 0.3048;
                    result.setText(df.format(m) + " m");
                    break;
                }

                case 4: {
                    m = Double.parseDouble(textField.getText());
                    ft = m * 3.28084;
                    result.setText(df.format(ft) + " ft");
                    break;
                }
                default: {
                    System.out.println("Something is wrong in switch condition.");
                }
            }
        }

        if (e.getSource() == btnDistance) {

            con = !con;

            if (con == true) {
                label.setText("Miles (mi) to Kilometers (Km)");
                unit.setText("mi");
                result.setText(" ");
                formula = 1;

            } else {
                label.setText("Kilometers (Km) to Miles (mi)");
                unit.setText("Km");
                result.setText(" ");
                formula = 2;
            }
        }

        if (e.getSource() == btnLength) {

            con = !con;

            if (con == true) {
                label.setText("Feets (ft) to Meters (m)");
                unit.setText("ft");
                result.setText(" ");
                formula = 3;

            } else {
                label.setText("Meters (m) to Feets (ft)");
                unit.setText("m");
                result.setText(" ");
                formula = 4;
            }
        }
        
        textField.setVisible(true);
        btnCalculate.setVisible(true);
    }

    public boolean toggleCondition() {
        return con;
    }
}
