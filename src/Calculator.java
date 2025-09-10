import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    int boardWidth = 460;
    int boardHeight = 640;

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
    JButton squareRootButton = new JButton("√");
    JButton[] digitButton = {zeroButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton};
    JButton MCButton = new JButton("MC");
    JButton MPlusButton = new JButton("M+");
    JButton MMinusButton = new JButton("M-");
    JButton MRButton = new JButton("MR");
    double firstNum = 0;
    String operator = "";
    double memoryValue = 0;

    JScrollPane scrollPane = new JScrollPane(displayTextField);

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
        displayTextField.setFont(new Font("Arial", Font.BOLD, 50));
        displayTextField.setPreferredSize(new Dimension(0, 120));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBackground(costumCoralPink);
        frame.add(scrollPane, BorderLayout.NORTH);

        buttonPanel.setLayout(new GridBagLayout());
        buttonPanel.setBackground(costumClaret);
        frame.add(buttonPanel, BorderLayout.CENTER);


        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(5, 5, 5, 5);

        c.gridx = 0; c.gridy = 0;
        buttonPanel.add(MCButton, c);
        c.gridx = 1; c.gridy = 0;
        buttonPanel.add(MPlusButton, c);
        c.gridx = 2; c.gridy = 0;
        buttonPanel.add(MMinusButton, c);
        c.gridx = 3; c.gridy = 0;
        buttonPanel.add(MRButton, c);

        c.gridx = 0; c.gridy = 1;
        buttonPanel.add(clearButton, c);
        c.gridx = 1; c.gridy = 1;
        buttonPanel.add(signButton, c);
        c.gridx = 2; c.gridy = 1;
        buttonPanel.add(percentButton, c);
        c.gridx = 3; c.gridy = 1;
        buttonPanel.add(divButton, c);

        c.gridx = 0; c.gridy = 2;
        buttonPanel.add(sevenButton, c);
        c.gridx = 1; c.gridy = 2;
        buttonPanel.add(eightButton, c);
        c.gridx = 2; c.gridy = 2;
        buttonPanel.add(nineButton, c);
        c.gridx = 3; c.gridy = 2;
        buttonPanel.add(multiButton, c);

        c.gridx = 0; c.gridy = 3;
        buttonPanel.add(fourButton, c);
        c.gridx = 1; c.gridy = 3;
        buttonPanel.add(fiveButton, c);
        c.gridx = 2; c.gridy = 3;
        buttonPanel.add(sixButton, c);
        c.gridx = 3; c.gridy = 3;
        buttonPanel.add(subButton, c);

        c.gridx = 0; c.gridy = 4;
        buttonPanel.add(oneButton, c);
        c.gridx = 1; c.gridy = 4;
        buttonPanel.add(twoButton, c);
        c.gridx = 2; c.gridy = 4;
        buttonPanel.add(threeButton, c);
        c.gridx = 3; c.gridy = 4;
        buttonPanel.add(addButton, c);

        c.gridx = 0; c.gridy = 5;
        buttonPanel.add(zeroButton, c);
        c.gridx = 1; c.gridy = 5;
        buttonPanel.add(decimalButton, c);
        c.gridx = 2; c.gridy = 5;
        buttonPanel.add(squareRootButton, c);
        c.gridx = 3; c.gridy = 5;
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
        multiButton.setFont(new Font("Arial", Font.BOLD, 30));
        addButton.setBackground(costumRose);
        addButton.setFont(new Font("Arial", Font.BOLD, 20));
        subButton.setBackground(costumRose);
        subButton.setFont(new Font("Arial", Font.BOLD, 30));
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
        squareRootButton.setBackground(costumCoralPink);
        squareRootButton.setFont(new Font("Arial", Font.BOLD, 20));
        MCButton.setBackground(costumPink);
        MCButton.setFont(new Font("Arial", Font.BOLD, 20));
        MPlusButton.setBackground(costumPink);
        MPlusButton.setFont(new Font("Arial", Font.BOLD, 20));
        MMinusButton.setBackground(costumPink);
        MMinusButton.setFont(new Font("Arial", Font.BOLD, 20));
        MRButton.setBackground(costumPink);
        MRButton.setFont(new Font("Arial", Font.BOLD, 20));

        ActionListener digitListener = e -> {
            String digit = e.getActionCommand();
            displayTextField.setText(displayTextField.getText() + digit);
        };

        for(JButton button : digitButton) {
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
            if(value == 0){
                displayTextField.setText("0");
            }
            else
            {
                value *= -1;
                displayTextField.setText(Double.toString(value));
            }
        });

        decimalButton.addActionListener(_ -> {
            String text =  displayTextField.getText();
            if(text.isEmpty()){
                displayTextField.setText("0.");
            }
            else if(!text.contains(".")){
                displayTextField.setText(text + ".");
            }
        });

        squareRootButton.addActionListener(_ -> {
           double crtValue  = Double.parseDouble(displayTextField.getText());
           double result = 0;
           if(crtValue < 0)
               displayTextField.setText("NaN");
           else
               result = Math.sqrt(crtValue);
           displayTextField.setText(Double.toString(result));
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

        bindKey("1", oneButton);
        bindKey("2", twoButton);
        bindKey("3", threeButton);
        bindKey("4", fourButton);
        bindKey("5", fiveButton);
        bindKey("6", sixButton);
        bindKey("7", sevenButton);
        bindKey("8", eightButton);
        bindKey("9", nineButton);
        bindKey("0", zeroButton);
        bindKey("ADD", addButton);
        bindKey("SUBSTRACT", subButton);
        bindKey("MULTIPLY", multiButton);
        bindKey("DIVIDE", divButton);
        bindKey("ENTER", equalButton);
        bindKey("DECIMAL", decimalButton);

    }

    private void bindKey(String keyStroke, JButton button){
        InputMap im = frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = frame.getRootPane().getActionMap();
        im.put(KeyStroke.getKeyStroke(keyStroke), keyStroke);
        am.put(keyStroke, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.doClick();
            }
        });
    }


    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
    }
}

