package src.exampleFrame;

import java.awt.event.*;
import src.exampleFrame.AwtFrame2;

public class Outer implements ActionListener {
    AwtFrame2 obj;

    Outer(AwtFrame2 obj) {
        this.obj = obj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        obj.setHeading("Welcome");
    }
}
