package components;


import factory.Component;
import visitor.ComponentElement;
import visitor.IComponentVisitor;

import javax.swing.*;

public class MyButton implements Component {

    public MyButton(String title){
        drawComponent(title);
    }

    @Override
    public JButton drawComponent(String title) {
        return new JButton(title);
    }
}
