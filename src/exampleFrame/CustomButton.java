package src.exampleFrame;

import java.awt.*;

public class CustomButton extends Button {
    CustomButton(String title, int x, int y, int width, int height) {
        this.setLabel(title);
        this.setBounds(x, y, width, height);
    }
}
