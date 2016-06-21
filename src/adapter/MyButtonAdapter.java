package adapter;

import components.MyButton;
import factory.Component;
import visitor.ComponentElement;
import visitor.IComponentVisitor;

public class MyButtonAdapter implements ComponentElement {
        private Component button;

        public MyButtonAdapter(Component button) {
            this.button = button;
        }

        @Override
        public void visit(IComponentVisitor IComponentVisitor) {
            IComponentVisitor.onButton(button);
        }
    }

