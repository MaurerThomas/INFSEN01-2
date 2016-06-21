import components.NormalWindow;
import decorator.OurWindow;
import decorator.Window;
import factory.Component;
import factory.ComponentFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Window window = new OurWindow(new NormalWindow());
        window.setTitle("test");
        ComponentFactory componentFactory = new ComponentFactory();
        List<Component> componentElements = new ArrayList<Component>();
        componentElements.add(componentFactory.createComponent("button"));
        componentElements.add(componentFactory.createComponent("label"));

        for(Component component : componentElements) {
            window.addLabel(component.drawComponent("sdf"));

        }

        // Iterator pattern to loop through components list and add them to the main panel.

    }
}
