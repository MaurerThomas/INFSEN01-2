package visitor;

import components.MyButton;
import components.MyLabel;

import java.util.ArrayList;
import java.util.List;

public class ComponentVisitor implements IComponentVisitor {

    // Add buttons to a list?
    // Use iterator pattern here?

    public List<MyButton> buttons = new ArrayList<MyButton>();
    public List<MyLabel> labels = new ArrayList<MyLabel>();

    @Override
    public void onButton(MyButton button) {
        button.drawComponent("button");
    }

    @Override
    public void onLabel(MyLabel label) {
        labels.add(label);

    }
}
