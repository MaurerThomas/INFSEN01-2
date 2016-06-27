package components;

import factory.Component;
import visitor.ComponentElement;
import visitor.IComponentVisitor;

import javax.swing.*;

public class MyLabel implements Component {

    public MyLabel(String title) {
        drawComponent(title);
    }

    @Override
    public JLabel drawComponent(String title) {
        return new JLabel(title);
    }

}
