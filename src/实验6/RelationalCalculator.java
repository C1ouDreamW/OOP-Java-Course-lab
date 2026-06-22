package 实验6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RelationalCalculator extends JFrame implements ActionListener {
    // 定义 GUI 组件
    private JTextField display;
    private JPanel buttonPanel;

    // 定义变量存储操作数和运算符
    private String num1 = "";
    private String num2 = "";
    private String operator = "";

    public RelationalCalculator() {
        // 1. 设置窗口基本属性
        setTitle("关系运算计算器");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 居中显示
        setLayout(new BorderLayout());

        // 2. 设置顶部显示屏
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false); // 禁止键盘直接输入
        display.setBackground(Color.WHITE);
        add(display, BorderLayout.NORTH);

        // 3. 设置按钮面板 (网格布局，5行4列)
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        // 按钮标签数组
        String[] buttons = {
                "7", "8", "9", "C",
                "4", "5", "6", ">",
                "1", "2", "3", "<",
                "0", ".", ">=", "<=",
                "==", "!=", "=", ""
        };

        // 遍历创建按钮并添加监听器
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            if (text.equals("")) {
                button.setEnabled(false); // 禁用空按钮
            } else {
                button.addActionListener(this);
            }
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    // 事件处理逻辑
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // 点击清空按钮
        if (command.equals("C")) {
            num1 = "";
            num2 = "";
            operator = "";
            display.setText("");
            return;
        }

        // 点击等号进行计算
        if (command.equals("=")) {
            if (!num1.isEmpty() && !num2.isEmpty() && !operator.isEmpty()) {
                calculateResult();
            }
            return;
        }

        // 点击关系运算符
        if (isOperator(command)) {
            if (!num1.isEmpty()) {
                operator = command;
                display.setText(num1 + " " + operator + " ");
            }
            return;
        }

        // 点击数字或小数点
        if (operator.isEmpty()) {
            num1 += command;
            display.setText(num1);
        } else {
            num2 += command;
            display.setText(num1 + " " + operator + " " + num2);
        }
    }

    // 判断是否为关系运算符
    private boolean isOperator(String str) {
        return str.equals(">") || str.equals("<") || str.equals(">=") ||
                str.equals("<=") || str.equals("==") || str.equals("!=");
    }

    // 执行计算逻辑
    private void calculateResult() {
        try {
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);
            boolean result = false;

            switch (operator) {
                case ">":  result = (n1 > n2); break;
                case "<":  result = (n1 < n2); break;
                case ">=": result = (n1 >= n2); break;
                case "<=": result = (n1 <= n2); break;
                case "==": result = (n1 == n2); break;
                case "!=": result = (n1 != n2); break;
            }

            // 显示结果
            display.setText(num1 + " " + operator + " " + num2 + " = " + result);

            // 计算完毕后重置状态，方便进行下一次计算
            num1 = "";
            num2 = "";
            operator = "";

        } catch (NumberFormatException ex) {
            display.setText("Error: 输入格式错误");
            num1 = ""; num2 = ""; operator = "";
        }
    }

    public static void main(String[] args) {
        // 启动 GUI 程序
        SwingUtilities.invokeLater(() -> {
            new RelationalCalculator();
        });
    }
}
