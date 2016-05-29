package decorator;

import javax.swing.*;

public interface Window {

    void setTitle(String title);

    void addPanel(String message);

    JFrame getJFrame();
}
