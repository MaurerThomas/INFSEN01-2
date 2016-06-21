package factory;

import visitor.ComponentElement;
import visitor.IComponentVisitor;

public interface Component{
    java.awt.Component drawComponent(String title);
}
