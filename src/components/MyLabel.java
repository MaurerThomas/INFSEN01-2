package components;

import factory.Component;
import visitor.ComponentElement;
import visitor.ComponentVisitor;

import javax.swing.*;

public class MyLabel implements Component, ComponentElement {

    public MyLabel(String title) {
        drawComponent(title);
    }

    @Override
    public void accept(ComponentVisitor componentVisitor) {
        componentVisitor.visit(this);
    }

    @Override
    public void drawComponent(String title) {
        new JLabel(title);
    }
}
