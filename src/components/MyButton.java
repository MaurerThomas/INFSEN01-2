package components;


import factory.Component;
import visitor.ComponentElement;
import visitor.ComponentVisitor;

import javax.swing.*;

public class MyButton implements Component, ComponentElement {

    // Logic

    public MyButton(String title){
        drawComponent(title);
    }

    @Override
    public void accept(ComponentVisitor componentVisitor) {
        componentVisitor.visit(this);
    }

    @Override
    public void drawComponent(String title) {
        new JButton(title);
    }
}
