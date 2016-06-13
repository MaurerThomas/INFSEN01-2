package decorator;

import visitor.ComponentElement;

import javax.swing.*;

public interface Window {

    void setTitle(String title);

    void addPanel(String message);

    JFrame getJFrame();
}
