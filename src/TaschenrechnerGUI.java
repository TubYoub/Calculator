import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class TaschenrechnerGUI {
    private JFrame frame;
    private JButton minus, geteilt, mal, plus;
    private JTextField zahl1, zahl2, zahl3, zahl4, ausgabeFeld;
    private JLabel ergebnisLabel;

    public TaschenrechnerGUI() {
        frame = new JFrame("Taschenrechner GUI");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        minus = new JButton("-");
        geteilt = new JButton("/");
        mal = new JButton("*");
        plus = new JButton("+");

        zahl1 = new JTextField(5);
        zahl2 = new JTextField(5);
        zahl3 = new JTextField(5);
        zahl4 = new JTextField(5);
        ausgabeFeld = new JTextField(10);
        ausgabeFeld.setEditable(false); // Das Ausgabefeld sollte nicht bearbeitbar sein

        ergebnisLabel = new JLabel();

        GridBagConstraints gbc = new GridBagConstraints();

        // Adding components based on the XML constraints
        gbc.gridx = 0; gbc.gridy = 1;
        frame.add(zahl1, gbc);

        gbc.gridx = 2; gbc.gridy = 1;
        frame.add(zahl3, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        frame.add(zahl2, gbc);

        gbc.gridx = 2; gbc.gridy = 2;
        frame.add(zahl4, gbc);

        gbc.gridx = 3; gbc.gridy = 0;
        frame.add(plus, gbc);

        gbc.gridx = 3; gbc.gridy = 1;
        frame.add(minus, gbc);

        gbc.gridx = 3; gbc.gridy = 3;
        frame.add(geteilt, gbc);

        gbc.gridx = 3; gbc.gridy = 4;
        frame.add(mal, gbc);

        gbc.gridx = 5; gbc.gridy = 1; gbc.gridheight = 3;
        frame.add(ausgabeFeld, gbc);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TaschenrechnerGUI());
    }
}
