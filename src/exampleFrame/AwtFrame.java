package src.exampleFrame;

import java.awt.*;

public class AwtFrame extends Frame {
    AwtFrame() {
        setSize(300, 300);
        setTitle("The first example");
        setLayout(null);
        Button b = new Button("Click here");
        b.setBounds(this.getWidth() / 2 - 40, 100, 80, 30);
        this.add(b);

        setVisible(true);
    }

    public static void main(String[] args) {
        AwtFrame frame1 = new AwtFrame();
    }
}
