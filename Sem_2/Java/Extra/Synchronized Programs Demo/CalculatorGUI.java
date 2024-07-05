import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton;
    private JButton equButton, clrButton, dotButton, delButton;
    private JPanel panel;

    private double num1, num2, result;
    private char operator;

    public CalculatorGUI() {
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));
        
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        textField.setEditable(false);
        
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
            numberButtons[i].addActionListener(this);
        }

        functionButtons = new JButton[4];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;

        for (int i = 0; i < 4; i++) {
            functionButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
            functionButtons[i].addActionListener(this);
        }

        equButton = new JButton("=");
        clrButton = new JButton("C");
        dotButton = new JButton(".");
        delButton = new JButton("DEL");

        equButton.setFont(new Font("Arial", Font.PLAIN, 20));
        clrButton.setFont(new Font("Arial", Font.PLAIN, 20));
        dotButton.setFont(new Font("Arial", Font.PLAIN, 20));
        delButton.setFont(new Font("Arial", Font.PLAIN, 20));

        equButton.addActionListener(this);
        clrButton.addActionListener(this);
        dotButton.addActionListener(this);
        delButton.addActionListener(this);

        panel.add(textField);
        panel.add(clrButton);
        panel.add(delButton);
        panel.add(divButton);

        for (int i = 7; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(mulButton);

        for (int i = 4; i <= 6; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(subButton);

        for (int i = 1; i <= 3; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(addButton);

        panel.add(dotButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        for (int i = 0; i < 10; i++) {
            if (source == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if (source == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }

        if (source == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if (source == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        if (source == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if (source == equButton) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        textField.setText("Cannot divide by zero");
                    break;
            }

            textField.setText(String.valueOf(result));
            num1 = result;
        }

        if (source == clrButton) {
            textField.setText("");
        }

        if (source == dotButton) {
            textField.setText(textField.getText().concat("."));
        }

        if (source == delButton) {
            String str = textField.getText();
            textField.setText("");
            for (int i = 0; i < str.length() - 1; i++) {
                textField.setText(textField.getText() + str.charAt(i));
            }
        }
    }
}
