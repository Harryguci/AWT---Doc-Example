package src.interfaceExample;

import java.awt.*;
import java.awt.event.*;

public class AwtActionListener {
    Label heading;

    AwtActionListener() {
        heading = new Label("Welcome", Label.CENTER);
        heading.setVisible(false);
        Frame frame = new Frame();
        frame.setBounds(100, 100, 400, 600);
        frame.setLayout(new FlowLayout());
        Button button = new Button("Click here");
        button.setBounds(50, 50, 200, 100);

        // Anonymous class
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Action listeners");
                heading.setVisible(true);
                frame.setVisible(true);
            }
        });
        frame.add(button);
        frame.add(heading);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        AwtActionListener demo = new AwtActionListener();

    }
}
