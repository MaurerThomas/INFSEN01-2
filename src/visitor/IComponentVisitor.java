package visitor;

import components.MyButton;
import components.MyLabel;


public interface IComponentVisitor {

    void onButton (MyButton button);

    void onLabel (MyLabel label);
}
