package factory;


import components.MyButton;
import components.MyLabel;

public class ComponentFactory {

    public Component createComponent(String componentType) {
        if ("button".equals(componentType)) {
            return new MyButton("button");
        } else if ("label".equals(componentType)) {
            return new MyLabel("label");
        }
        return null;
    }

}
