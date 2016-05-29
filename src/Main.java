import components.NormalWindow;
import decorator.OurWindow;
import decorator.Window;

public class Main {

    public static void main(String[] args) {
        Window window = new OurWindow(new NormalWindow());
    }
}
