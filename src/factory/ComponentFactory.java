package factory;


import components.MyButton;
import components.MyLabel;
import visitor.ComponentElement;

public class ComponentFactory {
    public ComponentElement createComponent(String componentType) {
        if ("button".equals(componentType)) {
            return new MyButton("button");
        } else if ("label".equals(componentType)) {
            return new MyLabel("label");
        }
        return null;
    }

}
