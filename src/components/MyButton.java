package components;


import visitor.Button;
import visitor.ButtonVisitor;

public class MyButton extends Button {
    @Override
    public void accept(ButtonVisitor buttonVisitor) {
        buttonVisitor.visit(this);
    }
}
