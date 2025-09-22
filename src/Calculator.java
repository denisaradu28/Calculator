import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator {

    int boardWidth = 460;
    int boardHeight = 640;

    Color costumeCoralPink = new Color(248, 131, 121);
    Color costumeClaret = new Color(156, 27, 61);
    Color costumeRose = new Color(243, 58, 106);
    Color costumePink = new Color(255, 182, 193);

    JFrame frame = new JFrame("Calculator");
    JTextField displayTextField = new JTextField();
    JPanel buttonPanel = new JPanel();
    JButton zeroButton = new JButton("0");
    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton fourButton = new JButton("4");
    JButton fiveButton = new JButton("5");
    JButton sixButton = new JButton("6");
    JButton sevenButton = new JButton("7");
    JButton eightButton = new JButton("8");
    JButton nineButton = new JButton("9");
    JButton clearButton = new JButton("AC");
    JButton addButton = new JButton("+");
    JButton subButton = new JButton("-");
    JButton multiButton = new JButton("*");
    JButton divButton = new JButton("/");
    JButton equalButton = new JButton("=");
    JButton percentButton = new JButton("%");
    JButton decimalButton = new JButton(".");
    JButton signButton = new JButton("+/-");
    JButton squareRootButton = new JButton("√");
    JButton[] digitButton = {zeroButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton};
    JButton MCButton = new JButton("MC");
    JButton MPlusButton = new JButton("M+");
    JButton MMinusButton = new JButton("M-");
    JButton MRButton = new JButton("MR");
    JButton powerButton = new JButton("^");
    JButton factorialButton = new JButton("x!");
    JButton piButton = new JButton("π");
    double firstNum = 0;
    String operator = "";
    double memoryValue = 0;


    public Calculator() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayTextField.setEditable(false);
        displayTextField.setBackground(costumeClaret);
        displayTextField.setForeground(Color.black);
        displayTextField.setHorizontalAlignment(JTextField.RIGHT);
        displayTextField.setFont(new Font("Arial", Font.BOLD, 50));
        displayTextField.setPreferredSize(new Dimension(0, 120));
        frame.add(displayTextField, BorderLayout.NORTH);

        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setBackground(costumeClaret);
        frame.add(buttonPanel, BorderLayout.CENTER);


        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(5, 5, 5, 5);

        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        buttonPanel.add(MCButton, c);
        c.gridx = 1;
        c.gridy = 0;
        buttonPanel.add(MPlusButton, c);
        c.gridx = 2;
        c.gridy = 0;
        buttonPanel.add(MMinusButton, c);
        c.gridx = 3;
        c.gridy = 0;
        buttonPanel.add(MRButton, c);

        c.gridx = 0;
        c.gridy = 1;
        buttonPanel.add(powerButton, c);
        c.gridx = 1;
        c.gridy = 1;
        buttonPanel.add(squareRootButton, c);
        c.gridx = 2;
        c.gridy = 1;
        buttonPanel.add(factorialButton, c);
        c.gridx = 3;
        c.gridy = 1;
        buttonPanel.add(piButton, c);

        c.gridx = 0;
        c.gridy = 2;
        buttonPanel.add(clearButton, c);
        c.gridx = 1;
        c.gridy = 2;
        buttonPanel.add(signButton, c);
        c.gridx = 2;
        c.gridy = 2;
        buttonPanel.add(percentButton, c);
        c.gridx = 3;
        c.gridy = 2;
        buttonPanel.add(divButton, c);

        c.gridx = 0;
        c.gridy = 3;
        buttonPanel.add(sevenButton, c);
        c.gridx = 1;
        c.gridy = 3;
        buttonPanel.add(eightButton, c);
        c.gridx = 2;
        c.gridy = 3;
        buttonPanel.add(nineButton, c);
        c.gridx = 3;
        c.gridy = 3;
        buttonPanel.add(multiButton, c);

        c.gridx = 0;
        c.gridy = 4;
        buttonPanel.add(fourButton, c);
        c.gridx = 1;
        c.gridy = 4;
        buttonPanel.add(fiveButton, c);
        c.gridx = 2;
        c.gridy = 4;
        buttonPanel.add(sixButton, c);
        c.gridx = 3;
        c.gridy = 4;
        buttonPanel.add(subButton, c);

        c.gridx = 0;
        c.gridy = 5;
        buttonPanel.add(oneButton, c);
        c.gridx = 1;
        c.gridy = 5;
        buttonPanel.add(twoButton, c);
        c.gridx = 2;
        c.gridy = 5;
        buttonPanel.add(threeButton, c);
        c.gridx = 3;
        c.gridy = 5;
        buttonPanel.add(addButton, c);

        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 6;
        buttonPanel.add(zeroButton, c);
        c.gridwidth = 1;
        c.gridx = 2;
        c.gridy = 6;
        buttonPanel.add(decimalButton, c);
        c.gridx = 3;
        c.gridy = 6;
        buttonPanel.add(equalButton, c);

        clearButton.setBackground(costumePink);
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));
        signButton.setBackground(costumePink);
        signButton.setFont(new Font("Arial", Font.BOLD, 20));
        percentButton.setBackground(costumePink);
        percentButton.setFont(new Font("Arial", Font.BOLD, 20));
        divButton.setBackground(costumeRose);
        divButton.setFont(new Font("Arial", Font.BOLD, 20));
        multiButton.setBackground(costumeRose);
        multiButton.setFont(new Font("Arial", Font.BOLD, 30));
        addButton.setBackground(costumeRose);
        addButton.setFont(new Font("Arial", Font.BOLD, 20));
        subButton.setBackground(costumeRose);
        subButton.setFont(new Font("Arial", Font.BOLD, 30));
        equalButton.setBackground(costumeRose);
        equalButton.setFont(new Font("Arial", Font.BOLD, 20));
        zeroButton.setBackground(costumeCoralPink);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 20));
        oneButton.setBackground(costumeCoralPink);
        oneButton.setFont(new Font("Arial", Font.BOLD, 20));
        twoButton.setBackground(costumeCoralPink);
        twoButton.setFont(new Font("Arial", Font.BOLD, 20));
        threeButton.setBackground(costumeCoralPink);
        threeButton.setFont(new Font("Arial", Font.BOLD, 20));
        fourButton.setBackground(costumeCoralPink);
        fourButton.setFont(new Font("Arial", Font.BOLD, 20));
        fiveButton.setBackground(costumeCoralPink);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 20));
        sixButton.setBackground(costumeCoralPink);
        sixButton.setFont(new Font("Arial", Font.BOLD, 20));
        sevenButton.setBackground(costumeCoralPink);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 20));
        eightButton.setBackground(costumeCoralPink);
        eightButton.setFont(new Font("Arial", Font.BOLD, 20));
        nineButton.setBackground(costumeCoralPink);
        nineButton.setFont(new Font("Arial", Font.BOLD, 20));
        decimalButton.setBackground(costumeCoralPink);
        decimalButton.setFont(new Font("Arial", Font.BOLD, 30));
        squareRootButton.setBackground(costumePink);
        squareRootButton.setFont(new Font("Arial", Font.BOLD, 20));
        MCButton.setBackground(costumePink);
        MCButton.setFont(new Font("Arial", Font.BOLD, 20));
        MPlusButton.setBackground(costumePink);
        MPlusButton.setFont(new Font("Arial", Font.BOLD, 20));
        MMinusButton.setBackground(costumePink);
        MMinusButton.setFont(new Font("Arial", Font.BOLD, 20));
        MRButton.setBackground(costumePink);
        MRButton.setFont(new Font("Arial", Font.BOLD, 20));
        powerButton.setBackground(costumePink);
        powerButton.setFont(new Font("Arial", Font.BOLD, 20));
        factorialButton.setBackground(costumePink);
        factorialButton.setFont(new Font("Arial", Font.BOLD, 20));
        piButton.setBackground(costumePink);
        piButton.setFont(new Font("Arial", Font.BOLD, 20));

        ActionListener digitListener = e -> {
            String digit = e.getActionCommand();
            displayTextField.setText(displayTextField.getText() + digit);
        };

        for (JButton button : digitButton) {
            button.addActionListener(digitListener);
        }

        addButton.addActionListener(_ -> {
            firstNum = Double.parseDouble(displayTextField.getText());
            operator = "+";
            displayTextField.setText("");
        });

        subButton.addActionListener(_ -> {
            firstNum = Double.parseDouble(displayTextField.getText());
            operator = "-";
            displayTextField.setText("");
        });

        multiButton.addActionListener(_ -> {
            firstNum = Double.parseDouble(displayTextField.getText());
            operator = "*";
            displayTextField.setText("");
        });

        divButton.addActionListener(_ -> {
            firstNum = Double.parseDouble(displayTextField.getText());
            operator = "/";
            displayTextField.setText("");
        });

        percentButton.addActionListener(_ -> {
            firstNum = Double.parseDouble(displayTextField.getText());
            operator = "%";
            displayTextField.setText("");
        });

        equalButton.addActionListener(_ -> {
            double secondNum = Double.parseDouble(displayTextField.getText());
            double result = switch (operator) {
                case "+" -> firstNum + secondNum;
                case "-" -> firstNum - secondNum;
                case "*" -> firstNum * secondNum;
                case "/" -> firstNum / secondNum;
                case "%" -> firstNum % secondNum;
                case "^" -> Math.pow(firstNum, secondNum);
                default -> 0;
            };

            displayTextField.setText(Double.toString(result));
        });

        clearButton.addActionListener(_ -> {
            displayTextField.setText("");
            firstNum = 0;
            operator = "";
        });

        signButton.addActionListener(_ -> {
            double value = Double.parseDouble(displayTextField.getText());
            if (value == 0) {
                displayTextField.setText("0");
            } else {
                value *= -1;
                displayTextField.setText(Double.toString(value));
            }
        });

        decimalButton.addActionListener(_ -> {
            String text = displayTextField.getText();
            if (text.isEmpty()) {
                displayTextField.setText("0.");
            } else if (!text.contains(".")) {
                displayTextField.setText(text + ".");
            }
        });

        squareRootButton.addActionListener(_ -> {
            double crtValue = Double.parseDouble(displayTextField.getText());
            double result = 0;
            if (crtValue < 0)
                displayTextField.setText("NaN");
            else
                result = Math.sqrt(crtValue);
            displayTextField.setText(Double.toString(result));
        });

        powerButton.addActionListener(_ -> {
            firstNum = Double.parseDouble(displayTextField.getText());
            operator = "^";
            displayTextField.setText("");
        });

        MPlusButton.addActionListener(_ -> {
            double crtValue = Double.parseDouble(displayTextField.getText());
            memoryValue += crtValue;
        });

        MMinusButton.addActionListener(_ -> {
            double crtValue = Double.parseDouble(displayTextField.getText());
            memoryValue -= crtValue;
        });

        MCButton.addActionListener(_ -> memoryValue = 0
        );

        MRButton.addActionListener(_ -> displayTextField.setText(String.valueOf(memoryValue)));

        factorialButton.addActionListener(_ -> {
            double crtValue = Double.parseDouble(displayTextField.getText());
            int num = (int) crtValue;
            int result = 1;
            if (crtValue < 0)
                displayTextField.setText("NaN");
            else if (crtValue == 0) {
                displayTextField.setText("1");
            } else {
                for (int i = 1; i <= num; i++) {
                    result *= i;
                }
            }
            displayTextField.setText(Double.toString(result));
        });

        piButton.addActionListener(_ -> {
            double pi = 3.14159265359;
            displayTextField.setText(Double.toString(pi));
        });
    }

    public static void main(String[] args)
    {
        new Calculator();
    }
}

