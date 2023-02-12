import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame implements ActionListener {
  private JTextField num1Field, num2Field, resultField;
  private JComboBox operatorComboBox;
  private JButton calculateButton;
  
  public CalculatorUI() {
    setTitle("Calculator");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400, 200);
    setLayout(new GridLayout(4, 2));
    
    add(new JLabel("First Number: "));
    num1Field = new JTextField();
    add(num1Field);
    
    add(new JLabel("Second Number: "));
    num2Field = new JTextField();
    add(num2Field);
    
    add(new JLabel("Operator: "));
    operatorComboBox = new JComboBox(new String[]{"+", "-", "*", "/"});
    add(operatorComboBox);
    
    add(new JLabel("Result: "));
    resultField = new JTextField();
    resultField.setEditable(false);
    add(resultField);
    
    calculateButton = new JButton("Calculate");
    calculateButton.addActionListener(this);
    add(calculateButton);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    double num1 = Double.parseDouble(num1Field.getText());
    double num2 = Double.parseDouble(num2Field.getText());
    char operator = operatorComboBox.getSelectedItem().toString().charAt(0);
    
    double result = 0;
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
        result = num1 / num2;
        break;
    }
    
    resultField.setText(String.valueOf(result));
  }
  
  public static void main(String[] args) {
    CalculatorUI calculatorUI = new CalculatorUI();
    calculatorUI.setVisible(true);
  }
}
