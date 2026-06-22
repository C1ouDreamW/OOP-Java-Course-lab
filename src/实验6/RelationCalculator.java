package 实验6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RelationCalculator extends JFrame implements ActionListener {
    JTextField text1, text2, resultText;
    JComboBox<String> operatorBox;
    JButton calcBtn;

    public RelationCalculator() {
        setTitle("关系运算计算器");
        setLayout(new FlowLayout());

        text1 = new JTextField(5);
        String[] operators = {">", "<", "==", ">=", "<=", "!="};
        operatorBox = new JComboBox<>(operators);
        text2 = new JTextField(5);
        calcBtn = new JButton("判断");
        resultText = new JTextField(10);
        resultText.setEditable(false);

        add(text1);
        add(operatorBox);
        add(text2);
        add(calcBtn);
        add(resultText);

        calcBtn.addActionListener(this);

        setBounds(200, 200, 400, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(text1.getText());
            double num2 = Double.parseDouble(text2.getText());
            String op = (String) operatorBox.getSelectedItem();
            boolean res = false;

            switch (op) {
                case ">": res = num1 > num2; break;
                case "<": res = num1 < num2; break;
                case "==": res = num1 == num2; break;
                case ">=": res = num1 >= num2; break;
                case "<=": res = num1 <= num2; break;
                case "!=": res = num1 != num2; break;
            }
            resultText.setText(Boolean.toString(res));
        } catch (NumberFormatException ex) {
            resultText.setText("输入格式错误");
        }
    }

    public static void main(String[] args) {
        new RelationCalculator();
    }
}