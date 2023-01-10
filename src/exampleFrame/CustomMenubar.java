package src.exampleFrame;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class CustomMenubar extends MenuBar {
    public CustomMenubar() {
        String[] menu_item1_subitem = { "Graphic", "Speed", "Screen" };
        CustomMenu menu_item1 = new CustomMenu("Setting", menu_item1_subitem);
        String[] menu_item2_subitem = { "Name", "Account", "Password" };
        CustomMenu menu_item2 = new CustomMenu("User", menu_item2_subitem);
        // Menu menu = new Menu("Menu");
        // Menu submenu = new Menu("Sub Menu");
        // MenuItem menuItem1 = new MenuItem("Item 1");
        // MenuItem menuItem2 = new MenuItem("Item 2");
        // MenuItem menuItem3 = new MenuItem("Item 3");
        // MenuItem menuItem4 = new MenuItem("Item 4");
        // MenuItem menuItem5 = new MenuItem("Item 5");
        // menu.add(menuItem1);
        // menu.add(menuItem2);
        // menu.add(menuItem3);
        // submenu.add(menuItem4);
        // submenu.add(menuItem5);
        // menu.add(submenu);
        this.add(menu_item1);
        this.add(menu_item2);

    }

    public static void main(String args[]) {
        new CustomMenubar();
    }
}