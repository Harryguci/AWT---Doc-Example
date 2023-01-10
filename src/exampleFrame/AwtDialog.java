package src.exampleFrame;

import java.awt.*;
import java.awt.event.*;

public class AwtDialog {
    private Dialog dialog1;
    private Dialog dialog2;

    AwtDialog() {
        Frame frame = new Frame("Dialog Example");
        dialog1 = new Dialog(frame, "Dialog 1", true);
        dialog2 = new Dialog(frame, "Dialog 2", true);

        dialog1.setLayout(new FlowLayout());
        dialog2.setLayout(new FlowLayout());

        dialog1.setBounds(100, 100, 300, 600);
        dialog2.setBounds(400, 150, 200, 200);

        Button button1 = new Button("Open dialog 2");

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dialog2.add(new Label("Dialog 2"));
                dialog2.setVisible(true);
            }
        });

        dialog1.add(new Label("Click to continue..."));
        dialog1.add(button1);
        dialog1.setVisible(true);
        dialog2.add(new Label("Dialog 2"));
        dialog2.setVisible(false);
    }

    public static void main(String[] args) {
        AwtDialog frame = new AwtDialog();

    }
}
