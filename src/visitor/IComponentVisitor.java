package visitor;

import factory.Component;


public interface IComponentVisitor {

    void onButton (Component button);

    void onLabel (Component label);

}
