public class RandomArrayGenerator {

    private final RandomNumberGenerator numberGenerator;

    public RandomArrayGenerator() {
        this.numberGenerator = new RandomNumberGenerator();
    }

    public int[] generateRandomArray() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = numberGenerator.generateRandomNumber();
        }
        return array;
    }

    public static void main(String[] args) {
        // Пример использования
        RandomArrayGenerator arrayGenerator = new RandomArrayGenerator();
        int[] randomArray = arrayGenerator.generateRandomArray();

        // Вывод массива
        for (int value : randomArray) {
            System.out.println(value);
        }
    }
}
