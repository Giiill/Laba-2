import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class RandomNumberGeneratorTest {

    @Test
    public void testGenerateRandomNumberInRange() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        int randomNumber = generator.generateRandomNumber();

        // Проверка, что сгенерированное число находится в диапазоне от 10 до 70
        assertTrue("Сгенерированное число не находится в нужном диапазоне",
                randomNumber >= 10 && randomNumber <= 70);
    }
}