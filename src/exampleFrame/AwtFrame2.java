package src.exampleFrame;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.awt.event.*;

public class AwtFrame2 extends Frame {

    private TextField textField1;
    private TextField textField2;
    private Label label1;

    AwtFrame2() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        this.setLocation(150, 50);
        this.setSize(tk.getScreenSize().width / 2, tk.getScreenSize().height / 2);
        this.setIconWindow();

        /*
         * try {
         * Image icon1 = Toolkit.getDefaultToolkit()
         * .getImage(System.getProperty("user.dir") + "\\public\\images\\js.png");
         * 
         * if (icon1 == null)
         * throw new Exception("Icon is null");
         * this.setIconImage(icon1);
         * } catch (Exception e) {
         * System.out.println("Error: Cannot set icon image");
         * }
         */

        label1 = new Label("", Label.CENTER);
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        label1.setBackground(Color.CYAN);
        label1.setBounds(this.getWidth() / 2 - 150, 200, 300, 40);
        label1.setVisible(false);

        textField1 = new TextField();
        textField1.setBounds(this.getWidth() / 2 - 85, 100, 170, 30);
        textField2 = new TextField();
        textField2.setBounds(this.getWidth() / 2 - 85, 135, 170, 30);

        Button button1 = new Button("Click me");
        button1.setBounds(this.getWidth() / 2 - 50, this.getHeight() / 2 - 15, 100, 30);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")
                        && textField2.getText().equals("")) {
                    System.out.println("The text field is empty");
                } else {
                    label1.setText(textField1.getText().toString() + " " + textField2.getText().toString());
                    label1.setVisible(true);
                }
            }
        });

        CustomMenubar menubar = new CustomMenubar();
        this.add(button1);
        // this.add(button2);
        this.add(label1);
        this.add(textField1);
        this.add(textField2);
        this.setFont(new Font("Arial", Font.PLAIN, 16));
        this.setTitle("The First Program");
        this.setBackground(Color.WHITE);
        this.setMenuBar(menubar);
        this.addWindowListener(
                new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        System.exit(0);
                    }
                });
        setLayout(null);
        // setVisible(true);
    }

    public void setHeading(String str) {
        if (str != "")
            textField1.setText(str);
    }

    public void setIconWindow() {
        try {
            Image icon1 = Toolkit.getDefaultToolkit()
                    .getImage(System.getProperty("user.dir") + "\\public\\images\\js.png");

            if (icon1 == null)
                throw new Exception("Icon is null");
            this.setIconImage(icon1);
        } catch (Exception e) {
            System.out.println("Error: Cannot set icon image");
        }
    }

    
    public static void main(String[] args) {
        AwtFrame2 frame = new AwtFrame2();
        frame.show();
        
        // frame.setIconWindow();
        // frame.show();
    }
}
