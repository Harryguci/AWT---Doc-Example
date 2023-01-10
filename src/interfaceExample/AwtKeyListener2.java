package src.interfaceExample;

import java.awt.*;
import java.awt.event.*;

public class AwtKeyListener2 implements KeyListener {
    TextField textField1;
    Label label1;

    AwtKeyListener2(TextField textField1, Label label1) {
        this.textField1 = textField1;
        this.label1 = label1;
    }

    public static void main(String[] args) {
        Frame frame = new Frame("KeyListener Demo");
        TextField textField1 = new TextField();
        textField1.setBounds(30, 300, 200, 30);
        Label label1 = new Label("Press any key");
        frame.setBounds(100, 100, 300, 500);
        label1.setBounds(30, 30, 300, 100);
        label1.setBackground(null);
        frame.add(label1);
        frame.add(textField1);
        frame.setBackground(Color.WHITE);
        frame.setLayout(null);
        textField1.addKeyListener(new AwtKeyListener2(textField1, label1));
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        String content = textField1.getText().toString();
        int count = content.length();
        int word_count = content.split(" ").length;

        label1.setText("Characters: " + count + " Words: " + word_count);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
