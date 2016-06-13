import components.NormalWindow;
import decorator.OurWindow;
import decorator.Window;
import factory.ComponentFactory;
import visitor.ComponentElement;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Window window = new OurWindow(new NormalWindow());
        window.setTitle("test");
        ComponentFactory componentFactory = new ComponentFactory();
        List<ComponentElement> componentElements = new ArrayList<ComponentElement>();
        componentElements.add(componentFactory.createComponent("button"));
        componentElements.add(componentFactory.createComponent("label"));


        // Iterator pattern to loop through components list and add them to the main panel.

    }
}
