package src.exampleFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.LabelUI;

public class AwtExample1 extends Frame {
    TextField textField1;
    TextField textField2;
    TextField textField3;
    Label label1;
    Button button1;
    Button operationButton;

    Dimension Size;

    AwtExample1() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Size = new Dimension(500, 800);
        this.setBounds(tk.getScreenSize().width / 2 - this.Size.width, tk.getScreenSize().height / 2 - this.Size.height,
                this.Size.width, this.Size.height);
        this.setLayout(null);
        this.setLocation(100, 100);

        textField1 = new TextField();
        textField1.setBounds(this.getWidth() / 2 - 100, 100, 200, 40);
        textField2 = new TextField();
        textField2.setBounds(this.getWidth() / 2 - 100, 300, 200, 40);
        textField3 = new TextField("Result");
        textField3.setBounds(this.getWidth() / 2 - 100, 500, 200, 40);
        textField3.setEditable(false);

        label1 = new Label("Calculator", Label.CENTER);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        label1.setBounds(this.getWidth() / 2 - 100, 50, 200, 40);

        button1 = new Button("Calculate");
        button1.setBounds(this.getWidth() / 2 - 100, 400, 200, 40);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField3.setText(textField1.getText().toString() + textField2.getText().toString());
            }
        });
        operationButton = new Button("+");
        operationButton.setBounds(this.getWidth() / 2 - 100, 200, 200, 40);

        this.add(button1);
        this.add(label1);
        this.add(textField1);
        this.add(textField2);
        this.add(textField3);
        this.add(operationButton);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        AwtExample1 frame = new AwtExample1();

    }
}
