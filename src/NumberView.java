import javax.swing.*;
import java.awt.*;

public class NumberView extends JFrame {
    Numbers model;

    public NumberView(int n1, int n2, int n3, Numbers model)
    {
        this.model = model;

        add(new JLabel("Red"));
        JTextField redNumber = new JTextField(10);
        redNumber.setText(n1 + "");
        add(redNumber);
        add(new JLabel("Green"));
        JTextField greenNumber = new JTextField(10);
        greenNumber.setText(n2 + "");
        add(greenNumber);
        add(new JLabel("Blue"));
        JTextField blueNumber = new JTextField(10);
        blueNumber.setText(n3 + "");
        add(blueNumber);

        JButton submit = new JButton("Submit");
        add(submit);
        setVisible(true);
        setSize(200, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(event -> {
            int number1 = Integer.parseInt(redNumber.getText());
            int number2 = Integer.parseInt(greenNumber.getText());
            int number3 = Integer.parseInt(blueNumber.getText());
            model.updateValues(number1, number2, number3);
        });
    }
}
