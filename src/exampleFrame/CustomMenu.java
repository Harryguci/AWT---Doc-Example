package src.exampleFrame;

import java.awt.*;

public class CustomMenu extends Menu {
    CustomMenu(String title, String[] item) {
        this.setLabel(title);
        for (int i = 0; i < item.length; i++) {
            this.add(new MenuItem(item[i], null));
        }
    }
}
