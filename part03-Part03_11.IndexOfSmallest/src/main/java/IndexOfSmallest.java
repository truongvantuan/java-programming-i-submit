
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        int smallest;
        while (true) {
            int input = scanner.nextInt();

            if (input == 9999) {
                smallest = list.get(0);
                break;
            }

            list.add(input);
        }

        smallest = smallestKey(list);

        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < list.size(); i++) {
            if (smallest == list.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }

    public static int smallestKey(ArrayList<Integer> list) {
        int smallest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
            }
        }
        return smallest;
    }

}
