package components;

import decorator.Window;

import javax.swing.*;

public class NormalWindow implements Window {
    private final JFrame jFrame;
    private final JPanel mainPanel;

    public NormalWindow() {
        this.jFrame = new JFrame();
        this.jFrame.setSize(300,400);
        this.mainPanel = new JPanel();
        this.jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
        this.jFrame.setVisible(true);

    }

    @Override
    public void setTitle(String title) {
        jFrame.setTitle(title);
    }

    @Override
    public void addPanel(String message) {
        JPanel panel = new JPanel();
        panel.add(new JLabel(message));
        mainPanel.add(panel);
    }

    @Override
    public JFrame getJFrame() {
        return jFrame;
    }
}
