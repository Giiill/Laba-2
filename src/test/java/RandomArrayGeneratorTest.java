import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomArrayGeneratorTest {

    private static RandomArrayGenerator arrayGenerator;

    @BeforeClass
    public static void setUp() {
        arrayGenerator = new RandomArrayGenerator();
    }

    @Test
    public void testGenerateRandomArraySize() {
        int[] randomArray = arrayGenerator.generateRandomArray();

        // Проверка размерности массива
        assertEquals("Неправильный размер массива", 5, randomArray.length);
    }

    @Test
    public void testGenerateRandomArrayValuesNotNull() {
        int[] randomArray = arrayGenerator.generateRandomArray();

        // Проверка, что значения элементов не являются null
        for (int value : randomArray) {
            assertNotNull("Значение элемента массива не должно быть null", value);
        }
    }
}
