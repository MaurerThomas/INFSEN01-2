package iterator;

import java.util.List;

public class ComponentIterator<T> implements Iterator<T> {

    private List<T> list;
    private int index = -1;

    public ComponentIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public Option<T> getNext() {
        if (list.size()-1 == index) {
            return new None<>();
        } else {
            index++;
            return new Some<>(list.get(index));
        }
    }
}
