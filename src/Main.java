import adapter.MyButtonAdapter;
import adapter.MyLabelAdapter;
import factory.ComponentFactory;
import iterator.Some;
import visitor.ComponentElement;
import visitor.ComponentVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ComponentVisitor componentVisitor = new ComponentVisitor();
        ComponentFactory componentFactory = new ComponentFactory();
        List<ComponentElement> components = new ArrayList<ComponentElement>();
        ComponentElement label = new MyLabelAdapter(componentFactory.createComponent("label"));
        ComponentElement button = new MyButtonAdapter(componentFactory.createComponent("button"));

        components.add(button);
        components.add(label);

        iterator.Option<Integer> component = new Some<>(components.size());
        component.visit(() -> {
            throw new IllegalArgumentException("Expecting a value...");
        }, i -> i + 1);


    }
}
