package iterator;


import java.util.function.Function;
import java.util.function.Supplier;

public interface Option<T> {
    <U> U visit(Supplier<U> onNone, Function<T, U> onSome);

}
