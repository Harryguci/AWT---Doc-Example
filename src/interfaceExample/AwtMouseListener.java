package src.interfaceExample;

import java.awt.*;
import java.awt.event.*;

public class AwtMouseListener implements MouseListener, MouseMotionListener {
    Label label;
    Label label2;
    Frame frame;

    AwtMouseListener(Label label, Label label2, Frame frame) {
        this.label = label;
        this.label2 = label2;
        this.frame = frame;
    }

    Label getLabel() {

        return this.label;
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        Label label1, label2, PosMouse;

        PosMouse = new Label("x = 0 \t y = 0");
        PosMouse.setBounds(20, 700, 200, 20);

        label1 = new Label("Contents..", Label.CENTER);
        label2 = new Label("Label2..", Label.CENTER);

        label1.setBounds(0, 40, 500, 50);
        label2.setBounds(0, 100, 500, 50);
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        label2.setFont(new Font("Arial", Font.PLAIN, 20));

        frame.setBounds(100, 100, 500, 800);
        frame.add(label1);
        frame.add(label2);
        frame.add(PosMouse);
        frame.setLayout(null);

        frame.addMouseListener(new AwtMouseListener(label1, label2, frame));
        frame.addMouseMotionListener(new AwtMouseListener(PosMouse, label2, frame));
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Clicked");
        Graphics g = frame.getGraphics();
        g.setColor(Color.GREEN);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        label2.setText("Dragged");
        Graphics g = frame.getGraphics();
        g.setColor(Color.GREEN);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("x: " + e.getX() + " y: " + e.getY());
    }
}