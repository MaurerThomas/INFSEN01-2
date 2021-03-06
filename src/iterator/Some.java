package iterator;

import visitor.ComponentElement;

import java.util.function.Function;
import java.util.function.Supplier;

public class Some<T> implements Option<T> {
    private T value;

    public Some(T value) {
        this.value = value;
    }

    @Override
    public <U> U visit(Supplier<U> onNone, Function<T, U> onSome) {
        return onSome.apply(value);
    }

    @Override
    public boolean isSome() {
        return true;
    }
}
