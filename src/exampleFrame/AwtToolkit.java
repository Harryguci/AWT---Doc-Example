package src.exampleFrame;

import java.awt.*;
import java.awt.event.*;

public class AwtToolkit {
    Toolkit tk;

    AwtToolkit() {
        tk = Toolkit.getDefaultToolkit();
    }

    int getScreenWidth() {
        return tk.getScreenSize().width;
    }

    int getScreenHeight() {
        return tk.getScreenSize().height;
    }

    int getScreenResolution() {
        return tk.getScreenResolution();
    }

    public static void main(String[] args) {
        AwtToolkit demo = new AwtToolkit();
        Frame frame1 = new Frame("DEMO TOOLKIT");
        frame1.setBounds(100, 100, 300, 500);
        Button button1 = new Button("Click to Show Screen information");
        button1.setBounds(frame1.getWidth() / 2 - 100, frame1.getHeight() / 2 - 25, 200, 50);
        frame1.add(button1);
        Dialog dialog1 = new Dialog(frame1, "Screen Information", false);
        dialog1.setVisible(false);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {
                    dialog1.setBounds(300, 150, 200, 200);
                    dialog1.add(new Label("Screen width: " + demo.getScreenWidth(), Label.CENTER));
                    dialog1.add(new Label("Screen height: " + demo.getScreenHeight(), Label.CENTER));
                    dialog1.add(new Label("Screen resolution: " + demo.getScreenResolution(), Label.CENTER));
                    dialog1.setLayout(new FlowLayout());
                    dialog1.setVisible(true);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        frame1.setLayout(null);
        frame1.setVisible(true);
    }
}
