public class BubbleSort {

    public void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Обмен элементов, если текущий элемент меньше предыдущего
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        // Используем RandomArrayGenerator для создания массива
        RandomArrayGenerator arrayGenerator = new RandomArrayGenerator();
        int[] randomArray = arrayGenerator.generateRandomArray();

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        for (int value : randomArray) {
            System.out.print(value + " ");
        }

        // Создаем экземпляр BubbleSort и применяем сортировку
        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(randomArray);

        // Вывод отсортированного массива
        System.out.println("\nОтсортированный массив:");
        for (int value : randomArray) {
            System.out.print(value + " ");
        }
    }
}
