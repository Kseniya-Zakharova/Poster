import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void test() {
        FilmsManager manager = new FilmsManager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");

        String[] actual = manager.findAll();
        String[] expected = { "film1", "film2", "film3" };

        Assertions.assertArrayEquals(expected, actual);
    }
}
