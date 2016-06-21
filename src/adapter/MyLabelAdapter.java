package adapter;

import factory.Component;
import visitor.ComponentElement;
import visitor.IComponentVisitor;

public class MyLabelAdapter implements ComponentElement {
    private Component label;

    public MyLabelAdapter(Component label){
        this.label = label;
    }

    @Override
    public void visit(IComponentVisitor IComponentVisitor) {
        IComponentVisitor.onLabel(label);
    }
}
