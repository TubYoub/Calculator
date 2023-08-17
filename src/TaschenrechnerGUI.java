import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaschenrechnerGUI {
    private JFrame frame;
    private JTextField zaehler1Field, nenner1Field, zaehler2Field, nenner2Field, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton, simplifyButton;
    private Rechner rechner;

    public TaschenrechnerGUI() {
        rechner = new Rechner();

        frame = new JFrame("Bruch Rechner");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2));

        zaehler1Field = new JTextField();
        nenner1Field = new JTextField();
        zaehler2Field = new JTextField();
        nenner2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        simplifyButton = new JButton("Kuerzen");

        frame.add(new JLabel("Bruch 1:"));
        frame.add(zaehler1Field);
        frame.add(new JLabel(""));
        frame.add(nenner1Field);

        // Add an empty JPanel to create a space
        frame.add(new JPanel());
        frame.add(new JPanel());

        frame.add(new JLabel("Bruch 2:"));
        frame.add(zaehler2Field);

        frame.add(new JLabel(""));
        frame.add(nenner2Field);
        frame.add(new JLabel("Ergebnis:"));
        frame.add(resultField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4));
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        frame.add(buttonPanel);
        frame.add(simplifyButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("add");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("subtract");
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("multiply");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("divide");
            }
        });

        simplifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("simplify");
            }
        });

        frame.setVisible(true);
    }

    private void performOperation(String operation) {
        int zaehler1 = Integer.parseInt(zaehler1Field.getText());
        int nenner1 = Integer.parseInt(nenner1Field.getText());
        Bruch bruch1 = new Bruch(zaehler1, nenner1);

        if (!operation.equals("simplify")) {
            int zaehler2 = Integer.parseInt(zaehler2Field.getText());
            int nenner2 = Integer.parseInt(nenner2Field.getText());
            Bruch bruch2 = new Bruch(zaehler2, nenner2);

            switch (operation) {
                case "add":
                    resultField.setText(rechner.addieren(bruch1, bruch2).toString());
                    break;
                case "subtract":
                    resultField.setText(rechner.subtrahieren(bruch1, bruch2).toString());
                    break;
                case "multiply":
                    resultField.setText(rechner.multiplizieren(bruch1, bruch2).toString());
                    break;
                case "divide":
                    resultField.setText(rechner.dividieren(bruch1, bruch2).toString());
                    break;
            }
        } else {
            resultField.setText(rechner.kuerzen(bruch1).toString());
        }
    }

    public static void main(String[] args) {
        new TaschenrechnerGUI();
    }
}
