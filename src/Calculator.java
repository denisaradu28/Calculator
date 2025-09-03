import javax.swing.*;
import java.awt.*;

public class Calculator {

    int boardWidth = 360;
    int boardHeight = 540;

    Color costumCoralPink = new Color(248, 131, 121);
    Color costumClaret = new Color(156, 27, 61);
    Color costumRose = new Color(243, 58, 106);
    Color costumPink = new Color(255, 182, 193);

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

    public Calculator() {
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        displayTextField.setEditable(false);
        displayTextField.setBackground(costumClaret);
        displayTextField.setForeground(Color.black);
        displayTextField.setHorizontalAlignment(JTextField.RIGHT);
        displayTextField.setFont(new Font("Arial", Font.PLAIN, 80));
        frame.add(displayTextField, BorderLayout.NORTH);

        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setBackground(costumClaret);
        frame.add(buttonPanel, BorderLayout.CENTER);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0; c.gridy = 0;
        buttonPanel.add(clearButton, c);
        c.gridx = 1; c.gridy = 0;
        buttonPanel.add(signButton, c);
        c.gridx = 2; c.gridy = 0;
        buttonPanel.add(percentButton, c);
        c.gridx = 3; c.gridy = 0;
        buttonPanel.add(divButton, c);

        c.gridx = 0; c.gridy = 1;
        buttonPanel.add(sevenButton, c);
        c.gridx = 1; c.gridy = 1;
        buttonPanel.add(eightButton, c);
        c.gridx = 2; c.gridy = 1;
        buttonPanel.add(nineButton, c);
        c.gridx = 3; c.gridy = 1;
        buttonPanel.add(multiButton, c);

        c.gridx = 0; c.gridy = 2;
        buttonPanel.add(fourButton, c);
        c.gridx = 1; c.gridy = 2;
        buttonPanel.add(fiveButton, c);
        c.gridx = 2; c.gridy = 2;
        buttonPanel.add(sixButton, c);
        c.gridx = 3; c.gridy = 2;
        buttonPanel.add(subButton, c);

        c.gridx = 0; c.gridy = 3;
        buttonPanel.add(oneButton, c);
        c.gridx = 1; c.gridy = 3;
        buttonPanel.add(twoButton, c);
        c.gridx = 2; c.gridy = 3;
        buttonPanel.add(threeButton, c);
        c.gridx = 3; c.gridy = 3;
        buttonPanel.add(addButton, c);

        c.gridx = 0; c.gridy = 4;
        c.gridwidth = 2;
        buttonPanel.add(zeroButton, c);
        c.gridwidth = 1;
        c.gridx = 2; c.gridy = 4;
        buttonPanel.add(decimalButton, c);
        c.gridx = 3; c.gridy = 4;
        buttonPanel.add(equalButton, c);

        clearButton.setBackground(costumPink);
        clearButton.setFont(new Font("Arial", Font.BOLD, 20));
        signButton.setBackground(costumPink);
        signButton.setFont(new Font("Arial", Font.BOLD, 20));
        percentButton.setBackground(costumPink);
        percentButton.setFont(new Font("Arial", Font.BOLD, 20));
        divButton.setBackground(costumRose);
        divButton.setFont(new Font("Arial", Font.BOLD, 20));
        multiButton.setBackground(costumRose);
        multiButton.setFont(new Font("Arial", Font.BOLD, 20));
        addButton.setBackground(costumRose);
        addButton.setFont(new Font("Arial", Font.BOLD, 20));
        subButton.setBackground(costumRose);
        subButton.setFont(new Font("Arial", Font.BOLD, 20));
        equalButton.setBackground(costumRose);
        equalButton.setFont(new Font("Arial", Font.BOLD, 20));
        zeroButton.setBackground(costumCoralPink);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 20));
        oneButton.setBackground(costumCoralPink);
        oneButton.setFont(new Font("Arial", Font.BOLD, 20));
        twoButton.setBackground(costumCoralPink);
        twoButton.setFont(new Font("Arial", Font.BOLD, 20));
        threeButton.setBackground(costumCoralPink);
        threeButton.setFont(new Font("Arial", Font.BOLD, 20));
        fourButton.setBackground(costumCoralPink);
        fourButton.setFont(new Font("Arial", Font.BOLD, 20));
        fiveButton.setBackground(costumCoralPink);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 20));
        sixButton.setBackground(costumCoralPink);
        sixButton.setFont(new Font("Arial", Font.BOLD, 20));
        sevenButton.setBackground(costumCoralPink);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 20));
        eightButton.setBackground(costumCoralPink);
        eightButton.setFont(new Font("Arial", Font.BOLD, 20));
        nineButton.setBackground(costumCoralPink);
        nineButton.setFont(new Font("Arial", Font.BOLD, 20));
        decimalButton.setBackground(costumCoralPink);
        decimalButton.setFont(new Font("Arial", Font.BOLD, 30));

    }

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
    }
}

