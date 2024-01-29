import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    private static BubbleSort bubbleSort;
    private static int[] unsortedArray;
    private static int[] sortedArray;

    @BeforeClass
    public static void setUp() {
        bubbleSort = new BubbleSort();
        unsortedArray = new int[]{59, 42, 16, 24, 18};
        sortedArray = new int[]{16, 18, 24, 42, 59};
    }

    @AfterClass
    public static void tearDown() {
        bubbleSort = null;
        unsortedArray = null;
        sortedArray = null;
    }

    @Test
    public void testBubbleSort() {
        bubbleSort.bubbleSort(unsortedArray);

        // Печать исходного массива
        System.out.println("Исходный массив:");
        for (int value : sortedArray) {
            System.out.print(value + " ");
        }

        // Печать отсортированного массива
        System.out.println("\nОтсортированный массив:");
        for (int value : unsortedArray) {
            System.out.print(value + " ");
        }

        // Проверка, что массив отсортирован правильно
        assertArrayEquals("Массив не отсортирован правильно", sortedArray, unsortedArray);
    }
}