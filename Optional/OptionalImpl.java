package Optional;
import java.util.Optional;
public class OptionalImpl {

    public static void main(String[] args) {
        Optional<Cat>cat = findByName("fuad");
    }
    private static Optional<Cat> findByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
    }
}
