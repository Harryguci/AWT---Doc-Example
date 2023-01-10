package src.interfaceExample;

import java.awt.*;
import java.awt.event.*;

public class AwtWindowAdapter2 implements WindowListener {

    Frame frame;

    AwtWindowAdapter2(Frame frame) {
        this.frame = frame;
    }

    public static void main(String[] args) {
        Frame frame1 = new Frame("Test Window Adapter");
        frame1.setBounds(100, 100, 300, 600);
        frame1.setVisible(true);
        frame1.addWindowListener(new AwtWindowAdapter2(frame1));
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        frame.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window is closed successfully");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

}
