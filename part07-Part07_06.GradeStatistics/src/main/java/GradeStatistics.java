
import java.util.ArrayList;

public class GradeStatistics {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public GradeStatistics() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public ArrayList<Integer> getPoints() {
        return this.points;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double averagePoint() {
        int sumPoint = 0;
        sumPoint = this.points.stream().map((point) -> point).reduce(sumPoint, Integer::sum);
        return (double) sumPoint / this.points.size();
    }

    public double averagePassingPoint() {
        int sumPoint = 0;
        int numberPassingPoint = 0;

        for (Integer point : this.points) {
            if (point >= 50) {
                sumPoint += point;
                numberPassingPoint++;
            }
        }

        if (numberPassingPoint == 0) {
            return sumPoint;
        }

        return (double) sumPoint / numberPassingPoint;
    }

    public double passPercent() {
        int numberPass = 0;
        for (Integer point : points) {
            numberPass = point >= 50 ? numberPass + 1 : numberPass;
        }

        return (double) numberPass * 100 / this.points.size();
    }

    public int pointToGrade(int point) {
        int grade = 0;

        if (point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int numberOfGrade(int grade) {
        int count = 0;

        for (Integer gd : grades) {
            if (grade == gd) {
                count++;
            }
        }
        return count;
    }
}
