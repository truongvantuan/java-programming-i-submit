
import static java.lang.System.arraycopy;
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            smallest = array[i] < smallest ? array[i] : smallest;
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int value = smallest(array);

        for (int i = 0; i < array.length; i++) {
            index = value == array[i] ? i : index;
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int fromIndex) {
        int[] targetTable = new int[table.length - fromIndex];
        for (int i = fromIndex; i < table.length; i++) {
            targetTable[i - fromIndex] = table[i];
        }
        return indexOfSmallest(targetTable) + fromIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int save = array[index2];
        array[index2] = array[index1];
        array[index1] = save;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = indexOfSmallestFrom(array, i);
            swap(array, index, i);
        }
    }
}
