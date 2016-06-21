package decorator;

import factory.Component;

import javax.swing.*;

public interface Window {

    void setTitle(String title);

    void addPanel(String message);

    JFrame getJFrame();

    void addButton(java.awt.Component component);

    void addLabel(java.awt.Component component);
}
