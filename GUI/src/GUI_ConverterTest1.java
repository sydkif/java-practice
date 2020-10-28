import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class GUI_ConverterTest1 implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;
    private static JButton btn0, btn1, btn2;
    private static JLabel title, label, unit, result;
    private static JTextField textField;
    private static boolean bool;
    private static int formula = 0;
    private static double km, mi, ft, m;

    // bundarkan nombor jadi 3 titik perpuluhan
    DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {

        // Declare main frame and panel, just put on top to avoid confusion.
        frame = new JFrame();
        panel = new JPanel();

        // frame
        frame.setSize(240, 240);
        frame.setTitle("Converter");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        // Banyak lagi cara lain nak customize frame ni, Google

        // panel | banyak lagi boleh customize
        panel.setLayout(null);
        panel.setBackground(new Color(54, 59, 71));

        // label title
        title = new JLabel("GUI Converter Test"); // set text
        title.setBounds(20, 10, 180, 25); // set pos
        title.setForeground(new Color(191, 198, 211)); // warna font
        title.setFont(new Font("Unispace", Font.BOLD, 12)); // jenis font
        panel.add(title); // include dlm panel

        // button untuk miles - kilometers
        btn0 = new JButton("mi-Km"); // set default label
        btn0.setBounds(20, 40, 80, 25); // set pos (x, y, widht, heigth) .. ada je cara lain ni salah satu
        btn0.setBackground(new Color(73, 81, 98)); // warna kotak
        btn0.setForeground(new Color(171, 178, 191)); // warna Font
        btn0.setFont(new Font("Unispace", Font.BOLD, 10)); // jenis font
        btn0.setFocusPainted(false); // buang highlight
        btn0.setBorder(BorderFactory.createLineBorder(new Color(171, 178, 191), 2)); // letak border | hilang rollover effect
        btn0.addActionListener(new GUI_ConverterTest1()); // run actionPerformed() bila klik, func tu ada kat bawah
        panel.add(btn0); // wajib ada, kalau tak, tak keluar button tu

        // button untuk feets - meters
        btn1 = new JButton("ft-m");
        btn1.setBounds(120, 40, 80, 25);
        btn1.setBackground(new Color(73, 81, 98));
        btn1.setForeground(new Color(171, 178, 191));
        btn1.setFont(new Font("Unispace", Font.BOLD, 10));
        btn1.setFocusPainted(false);
        btn1.addActionListener(new GUI_ConverterTest1());
        panel.add(btn1);

        // label untuk description
        label = new JLabel("Choose one of those");
        label.setBounds(20, 80, 180, 25);
        label.setForeground(new Color(191, 198, 211));
        label.setFont(new Font("Unispace", Font.BOLD, 12));
        panel.add(label);

        // textfield 1
        textField = new JTextField();
        textField.setText(" ");
        textField.setBounds(20, 120, 80, 25);
        textField.setBackground(new Color(73, 81, 98));
        textField.setForeground(new Color(171, 178, 191));
        textField.setFont(new Font("Unispace", Font.BOLD, 12));
        panel.add(textField);
        textField.setVisible(false);

        // label untuk unit
        unit = new JLabel();
        unit.setBounds(102, 120, 90, 25);
        unit.setForeground(new Color(171, 178, 191));
        unit.setFont(new Font("Unispace", Font.BOLD, 12));
        panel.add(unit);

        // label untuk result
        result = new JLabel();
        result.setBounds(20, 160, 200, 25);
        result.setForeground(new Color(191, 198, 211));
        result.setFont(new Font("Unispace", Font.BOLD, 16));
        panel.add(result);

        // button untuk kira2
        btn2 = new JButton("Convert");
        btn2.setBounds(120, 120, 80, 25);
        btn2.setBackground(new Color(73, 81, 98));
        btn2.setForeground(new Color(171, 178, 191));
        btn2.setFont(new Font("Unispace", Font.BOLD, 10));
        btn2.setFocusPainted(false);
        btn2.addActionListener(new GUI_ConverterTest1());
        panel.add(btn2);
        btn2.setVisible(false);

        frame.setVisible(true); // kalau tak set tak kelua gui
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn2) { // convert button clicked

            switch (formula) {
                case 1: {
                    mi = Double.parseDouble(textField.getText());
                    km = mi * 1.609344;
                    result.setText(df.format(km) + " Km");
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

        if (e.getSource() == btn0) { // mi-km button clicked

            bool = !bool;

            if (bool == true) {
                label.setText("Miles to Kilometers"); // tukar label
                unit.setText("mi"); // tukar unit
                result.setText(" "); // reset result jadi kosong
                formula = 1; // convert mi - km

            } else {
                label.setText("Kilometers to Miles");
                unit.setText("Km");
                result.setText(" ");
                formula = 2; // convert km - mi
            }
        }

        if (e.getSource() == btn1) { // ft-m button clicked

            bool = !bool;

            if (bool == true) {
                label.setText("Feets to Meters");
                unit.setText("ft");
                result.setText(" ");
                formula = 3; // convert ft - m

            } else {
                label.setText("Meters to Feets");
                unit.setText("m");
                result.setText(" ");
                formula = 4; // convert m - ft
            }
        }

        textField.setVisible(true);
        btn2.setVisible(true);
    }
}
