package src.interfaceExample;

import java.awt.*;
import java.awt.event.*;

public class AwtKeyListener implements KeyListener {
    Label label1;
    TextField textField1;

    AwtKeyListener(Label label1, TextField textField1) {
        this.label1 = label1;
        this.textField1 = textField1;
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(100, 100, 350, 500);
        frame.setLayout(null);
        Label label1 = new Label("Listening Key events..");
        label1.setFont(new Font("Arial", Font.PLAIN, 25));

        TextField textField = new TextField();
        textField.setBounds(20, 50, 300, 100);
        textField.setFont(new Font("Arial", Font.PLAIN, 16));

        try {
            textField.addKeyListener(new AwtKeyListener(label1, textField));
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

        label1.setBounds(20, 250, 300, 100);
        label1.setAlignment(Label.CENTER);

        frame.add(textField);
        frame.add(label1);

        frame.setVisible(true);
    }

    // overriding the keyPressed() method of KeyListener interface where we set the
    // text of the label when key is pressed
    public void keyPressed(KeyEvent e) {
        label1.setText("Key Pressed");
    }

    // overriding the keyReleased() method of KeyListener interface where we set the
    // text of the label when key is released
    public void keyReleased(KeyEvent e) {
        label1.setText(textField1.getText());
    }

    // overriding the keyTyped() method of KeyListener interface where we set the
    // text of the label when a key is typed
    public void keyTyped(KeyEvent e) {
        label1.setText("Key Typed");
    }
}
