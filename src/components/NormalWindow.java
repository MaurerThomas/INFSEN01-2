package components;

import decorator.Window;

import javax.swing.*;
import java.awt.*;

public class NormalWindow implements Window {
    private final JFrame jFrame;
    private final JPanel mainPanel;

    public NormalWindow() {
        this.jFrame = new JFrame();
        this.jFrame.setSize(400,400);
        this.jFrame.setLayout(new GridLayout(3, 1));
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
