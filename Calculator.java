import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import javax.swing.Action;
import java.awt.event.ActionEvent;

public class Calculator implements ActionListener {
  JFrame jf;
  JLabel displayLabel;
  JButton nineButton, eightButton, sevenButton;
  JButton sixButton, fiveButton, fourButton, minusButton;
  JButton threeButton, secondButton, oneButton, multiButton, clearButton;
  JButton dotButton, zeroButton, equalButton, divButton, addButton;
  boolean isoperator = false;
  String oldvalue;
  float result;
  int operator;

  public Calculator() {
    jf = new JFrame("Calculator");
    jf.setLayout(null);
    jf.setSize(600, 600);
    jf.setLocation(300, 100);

    // JLabel
    displayLabel = new JLabel();
    displayLabel.setBounds(30, 20, 500, 80);
    displayLabel.setBackground(Color.BLACK);
    displayLabel.setOpaque(true);
    displayLabel.setBorder(new LineBorder(Color.ORANGE, 5));
    displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    displayLabel.setForeground(Color.gray);
    jf.add(displayLabel);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // jbutton

    // first row

    nineButton = new JButton("9");
    nineButton.setBounds(30, 130, 80, 80);
    jf.add(nineButton);
    nineButton.addActionListener(this);

    eightButton = new JButton("8");
    eightButton.setBounds(150, 130, 80, 80);
    jf.add(eightButton);
    eightButton.addActionListener(this);

    sevenButton = new JButton("7");
    sevenButton.setBounds(270, 130, 80, 80);
    jf.add(sevenButton);
    sevenButton.addActionListener(this);

    // second row

    sixButton = new JButton("6");
    sixButton.setBounds(30, 230, 80, 80);
    jf.add(sixButton);
    sixButton.addActionListener(this);

    fiveButton = new JButton("5");
    fiveButton.setBounds(150, 230, 80, 80);
    jf.add(fiveButton);
    fiveButton.addActionListener(this);

    fourButton = new JButton("4");
    fourButton.setBounds(270, 230, 80, 80);
    jf.add(fourButton);
    fourButton.addActionListener(this);

    minusButton = new JButton("-");
    minusButton.setBounds(390, 230, 80, 80);
    jf.add(minusButton);
    minusButton.addActionListener(this);

    // third row

    threeButton = new JButton("3");
    threeButton.setBounds(30, 330, 80, 80);
    jf.add(threeButton);
    threeButton.addActionListener(this);

    secondButton = new JButton("2");
    secondButton.setBounds(150, 330, 80, 80);
    jf.add(secondButton);
    secondButton.addActionListener(this);

    oneButton = new JButton("1");
    oneButton.setBounds(270, 330, 80, 80);
    jf.add(oneButton);
    oneButton.addActionListener(this);

    multiButton = new JButton("*");
    multiButton.setBounds(390, 330, 80, 80);
    jf.add(multiButton);
    multiButton.addActionListener(this);

    // fourthrow

    dotButton = new JButton(".");
    dotButton.setBounds(30, 430, 80, 80);
    jf.add(dotButton);
    dotButton.addActionListener(this);

    zeroButton = new JButton("0");
    zeroButton.setBounds(150, 430, 80, 80);
    jf.add(zeroButton);
    zeroButton.addActionListener(this);

    equalButton = new JButton("=");
    equalButton.setBounds(270, 430, 80, 80);
    jf.add(equalButton);
    equalButton.addActionListener(this);

    divButton = new JButton("/");
    divButton.setBounds(390, 430, 80, 80);
    jf.add(divButton);
    divButton.addActionListener(this);

    // 4 th row finished

    // add button
    addButton = new JButton("+");
    addButton.setBounds(510, 230, 80, 240);
    jf.add(addButton);
    addButton.addActionListener(this);

    clearButton = new JButton("C");
    clearButton.setBounds(390, 130, 80, 80);
    jf.add(clearButton);
    clearButton.addActionListener(this);

  }

  public static void main(String[] args) {
    new Calculator();

  }
  // Action Listener start

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == nineButton) {

      if (isoperator) {
        displayLabel.setText("9");
        isoperator = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "9");

      }
    }
    if (e.getSource() == eightButton) {

      if (isoperator) {
        displayLabel.setText("8");
        isoperator = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "8");

      }
    }

    if (e.getSource() == sevenButton) {

      if (isoperator) {
        displayLabel.setText("7");
        isoperator = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "7");

      }
    }

    if (e.getSource() == sixButton) {

      if (isoperator) {
        displayLabel.setText("6");
        isoperator = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "6");

      }
    }

    if (e.getSource() == fiveButton) {

      if (isoperator) {
        displayLabel.setText("5");
        isoperator = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "5");

      }
    }

    if (e.getSource() == fourButton) {

      if (isoperator) {
        displayLabel.setText("4");
        isoperator = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "4");

      }
    }

    if (e.getSource() == threeButton) {

      if (isoperator) {
        displayLabel.setText("3");
        isoperator = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "3");

      }
    }

    if (e.getSource() == secondButton) {

      if (isoperator) {
        displayLabel.setText("2");
        isoperator = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "2");

      }
    }

    if (e.getSource() == oneButton) {

      if (isoperator) {
        displayLabel.setText("1");
        isoperator = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "1");

      }
    }

    if (e.getSource() == dotButton) {

      displayLabel.setText(displayLabel.getText() + ".");

    }
    if (e.getSource() == zeroButton) {

      if (isoperator) {
        displayLabel.setText("0");
        isoperator = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "0");

      }
    }

    // operator
    if (e.getSource() == multiButton) {
      isoperator = true;
      oldvalue = displayLabel.getText();
      operator = 1;

    }
    if (e.getSource() == addButton) {
      isoperator = true;
      oldvalue = displayLabel.getText();
      operator = 2;
    }
    if (e.getSource() == minusButton) {
      isoperator = true;
      oldvalue = displayLabel.getText();
      operator = 3;
    }
    if (e.getSource() == divButton) {
      isoperator = true;
      oldvalue = displayLabel.getText();
      operator = 4;
    }
    if (e.getSource() == equalButton) {
      String newvalue = displayLabel.getText();
      float oldvaluef = Float.parseFloat(oldvalue);
      float newvaluef = Float.parseFloat(newvalue);

      switch (operator) {
      case 1:
        result = oldvaluef * newvaluef;
        break;
      case 2:
        result = oldvaluef + newvaluef;
        break;
      case 3:
        result = oldvaluef - newvaluef;
        break;
      case 4:
        result = oldvaluef / newvaluef;
        break;
      }
      displayLabel.setText(result + "");

    }
    if (e.getSource() == clearButton) {

      displayLabel.setText("");

    }

  }

}
