package decorator;
import components.NormalWindow;
import factory.Component;

import javax.swing.*;

public class OurWindow extends WindowDecorator {

    public OurWindow(NormalWindow normalWindow) {
        super(normalWindow);
        getNormalWindow().addPanel("Our Decorated Window");
        getNormalWindow().getJFrame().setResizable(false);
    }
}
