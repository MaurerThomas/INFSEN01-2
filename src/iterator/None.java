package iterator;

import visitor.ComponentElement;

import java.util.function.Function;
import java.util.function.Supplier;

public class None<T> implements Option<T> {

    @Override
    public <U> U visit(Supplier<U> onNone, Function<T, U> onSome) {
        return onNone.get();
    }

    @Override
    public boolean isSome() {
        return false;
    }
}
