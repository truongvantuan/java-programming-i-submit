
import java.text.MessageFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private Scanner scanner;
    private GradeStatistics gradeStatistics;

    public UserInterface(GradeStatistics gradeStatistics, Scanner scanner) {
        this.scanner = scanner;
        this.gradeStatistics = gradeStatistics;
    }

    public void start() {
        readPoints();
        statisticsPoint();
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops: ");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("-1")) {
                break;
            }

            int point = Integer.parseInt(input);

            if (point < 0 || point > 100) {
                continue;
            }
            this.gradeStatistics.addPoints(point);
        }
    }

    public void statisticsPoint() {
        averagePoints();
        averagePassingPoints();
        passPercentage();
        gradeDistribution();
    }

    public void averagePoints() {
        double average = this.gradeStatistics.averagePoint();
        System.out.println("Point average (all): " + average);
    }

    public void averagePassingPoints() {
        double average = this.gradeStatistics.averagePassingPoints();
        if (average > 0) {
            System.out.println("Point average (passing): " + average);
        } else {
            System.out.println("Point average (passing): -");
        }
    }

    public void passPercentage() {
        System.out.println("Pass percentage: " + this.gradeStatistics.passPercentage());
    }

    public void gradeDistribution() {
        for (int i = 5; i >= 0; i--) {
            System.out.println(MessageFormat.format("{0}: {1}", i, gradeStar(this.gradeStatistics.numberOfGrade(i))));
        }
    }

    public String gradeStar(int value) {
        String star = "";

        for (int i = 0; i < value; i++) {
            star += "*";
        }

        return star;
    }

}
