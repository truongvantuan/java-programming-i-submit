//
//import java.util.Scanner;
//
//public class RepeatingBreakingAndRemembering {
//
//    public static void main(String[] args) {
//
//        // This exercise is worth five exercise points, and it is 
//        // gradually extended part by part.
//        // If you want, you can send this exercise to the server
//        // when it's just partially done. In that case the server will complain about 
//        // the parts you haven't done, but you'll get points for the finished parts.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give numbers: ");
//        int evenCount = 0;
//        int count = 0;
//        int sum = 0;
//
//        while (true) {
//            int value = Integer.parseInt(scanner.nextLine());
//            count++;
//            if (value == -1) {
//                count--;
//                break;
//            } else if (value % 2 == 0) {
//                evenCount++;
//                sum += value;
//            } else {
//                sum += value;
//            }
//        }
//        System.out.println("Thx! Bye!");
//        System.out.println("Sum: " + sum);
//        System.out.println("Numbers: " + count);
//        System.out.println("Average: " + (double) sum / count);
//        System.out.println("Even: " + evenCount);
//        System.out.println("Odd: " + (count - evenCount));
//    }
//}

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        double avg = 0;
        System.out.println("Give numbers:");
        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            sum += num;
            count++;
            avg = (double) sum / count;
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
