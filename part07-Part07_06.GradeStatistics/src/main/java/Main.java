
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics grade = new GradeStatistics();

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("-1")) {
                break;
            }
            int point = Integer.parseInt(input);

            if (point < 0 || point > 100) {
                continue;
            }

            grade.getPoints().add(point);
            grade.getGrades().add(grade.pointToGrade(point));
        }

        System.out.println("Point average (all): " + grade.averagePoint());

        if (grade.averagePassingPoint() == 0) {
            System.out.print("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + grade.averagePassingPoint());
        }

        System.out.println("Pass percentage: " + grade.passPercent());

        System.out.println("Grade distribution:");
        
        
    }

    public static String printStar(int value) {
        String star = "";
        for (int i = 0; i < value; i++) {
            star += "*";

        }
        return star;
    }
    
    public static void printGrade() {
        int gra = 5;
        
        for (int i = gra; i >= 0; i--) {
            grade.numberOfGrade(i);
            
        }
    }
}
