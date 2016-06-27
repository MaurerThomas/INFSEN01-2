import adapter.MyButtonAdapter;
import adapter.MyLabelAdapter;
import factory.Component;
import factory.ComponentFactory;
import iterator.*;
import visitor.ComponentElement;
import visitor.ComponentVisitor;

import java.util.ArrayList;

import java.util.List;

public class Main{

    public static void main(String[] args) {
        ComponentVisitor componentVisitor = new ComponentVisitor();
        ComponentFactory componentFactory = new ComponentFactory();
        List<ComponentElement> components = new ArrayList<ComponentElement>();
        ComponentElement label = new MyLabelAdapter(componentFactory.createComponent("label"));
        ComponentElement button = new MyButtonAdapter(componentFactory.createComponent("button"));

        components.add(button);
        components.add(label);

        ComponentIterator<ComponentElement> iterator = new ComponentIterator(components);
        Option<ComponentElement> value;

         while((value = iterator.getNext()).isSome()) {
            value.visit(() -> {
                throw new IllegalArgumentException("Expecting a value...");
            }, i -> {i.visit(componentVisitor); return null;});
        }

    }
}
