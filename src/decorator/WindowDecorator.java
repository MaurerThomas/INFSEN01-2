package decorator;

import components.NormalWindow;

import javax.swing.*;

public abstract class WindowDecorator implements Window {
    private final NormalWindow normalWindow;

    protected WindowDecorator(NormalWindow normalWindow) {
        this.normalWindow = normalWindow;
    }

    public void setTitle(String title) {
        normalWindow.setTitle(title);
    }

    public void addPanel(String message) {
        normalWindow.addPanel(message);
    }

    public JFrame getJFrame() {
        return normalWindow.getJFrame();
    }

    public NormalWindow getNormalWindow() {
        return normalWindow;
    }
}
