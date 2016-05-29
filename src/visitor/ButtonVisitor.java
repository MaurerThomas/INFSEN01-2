package visitor;

import components.MyButton;

public interface ButtonVisitor {

    void visit(MyButton button);
}
