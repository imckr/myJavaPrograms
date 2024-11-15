import java.awt.*;
import java.awt.event.*;

public class AWTComponents extends Frame implements ActionListener {
    TextField num1, num2, result;
    Button add, sub, mul, div;
    Label label1, label2, label3;

    public AWTComponents() {
        // Create components
        label1 = new Label("Number 1:");
        label2 = new Label("Number 2:");
        label3 = new Label("Result:");
        num1 = new TextField(10);
        num2 = new TextField(10);
        result = new TextField(10);
        result.setEditable(false);
        add = new Button("Add");
        sub = new Button("Subtract");
        mul = new Button("Multiply");
        div = new Button("Divide");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to frame
        add(label1);
        add(num1);
        add(label2);
        add(num2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(label3);
        add(result);

        // Add action listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Frame settings
        setTitle("Simple Calculator");
        setSize(300, 200);
        setVisible(true);

        // Window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double res = 0;

            if (ae.getSource() == add) {
                res = n1 + n2;
            } else if (ae.getSource() == sub) {
                res = n1 - n2;
            } else if (ae.getSource() == mul) {
                res = n1 * n2;
            } else if (ae.getSource() == div) {
                res = n1 / n2;
            }

            result.setText(String.valueOf(res));
        } catch (NumberFormatException e) {
            result.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new AWTComponents();
    }
}