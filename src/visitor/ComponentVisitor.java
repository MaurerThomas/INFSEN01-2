package visitor;

import components.MyButton;
import components.MyLabel;

public interface ComponentVisitor {
    void visit (MyButton button);
    void visit (MyLabel label);
}
