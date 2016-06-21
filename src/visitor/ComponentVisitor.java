package visitor;

import components.NormalWindow;
import decorator.OurWindow;
import factory.Component;

public class ComponentVisitor implements IComponentVisitor {
    private decorator.Window window = new OurWindow(new NormalWindow());

    public ComponentVisitor() {
        window.setTitle("test");
    }

    @Override
    public void onButton(Component button) {
        window.addButton(button.drawComponent("button"));
    }

    @Override
    public void onLabel(Component label) {
        window.addLabel(label.drawComponent("label"));
    }

}
