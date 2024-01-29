import java.util.Random;

public class RandomNumberGenerator {
    private final Random random;

    public RandomNumberGenerator() {
        this.random = new Random();
    }

    public int generateRandomNumber() {
        // Генерация случайного числа в диапазоне от 10 до 70
        return random.nextInt(61) + 10;
    }

    public static void main(String[] args) {
        // Пример использования
        RandomNumberGenerator generator = new RandomNumberGenerator();
        int randomNumber = generator.generateRandomNumber();
        System.out.println("Случайное число: " + randomNumber);
    }
}
