package components;

import decorator.Window;
import factory.Component;

import javax.swing.*;

public class NormalWindow implements Window {
    private final JFrame jFrame;
    private final JPanel mainPanel;

    public NormalWindow() {
        this.jFrame = new JFrame();
        this.jFrame.setSize(300,400);
        this.mainPanel = new JPanel();
        this.jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.jFrame.setVisible(true);
    }

    @Override
    public void setTitle(String title) {
        jFrame.setTitle(title);
    }

    @Override
    public void addPanel(String message) {
        JPanel panel = new JPanel();
        mainPanel.add(panel);
    }

    @Override
    public JFrame getJFrame() {
        return jFrame;
    }

    @Override
    public void addButton(java.awt.Component component) {
        jFrame.add(component);
    }

    @Override
    public void addLabel(java.awt.Component component) {
        jFrame.add(component);
    }
}
