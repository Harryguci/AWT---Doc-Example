package src.interfaceExample;

import java.awt.*;
import java.awt.event.*;

public class AwtWindowAdapter extends Frame {

    AwtWindowAdapter() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                dispose();
            }
        });

        this.setBounds(100, 100, 300, 500);
        this.setLayout(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        AwtWindowAdapter adapter = new AwtWindowAdapter();
    }
}
