
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int numOfTimes) {
        for (int i = 1; i <= numOfTimes; i++) {
            System.out.println(i);
        }
    }
}
