
import java.util.ArrayList;

public class GradeStatistics {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    private int numberPassingPoints;

    public GradeStatistics() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.numberPassingPoints = 0;
    }

    public ArrayList<Integer> getPoints() {
        return this.points;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addPoints(int point) {
        this.points.add(point);
        this.grades.add(pointToGrade(point));
        if (isPassingPoints(point)) {
            numberPassingPoints++;
        }
    }

    public double averagePoint() {
        int sumPoints = 0;

        for (Integer point : this.points) {
            sumPoints += point;
        }

        return (double) sumPoints / this.points.size();
    }

    public double averagePassingPoints() {
        int sumPoints = 0;
        int numberPassingPoints = 0;

        for (Integer point : this.points) {
            if (point >= 50) {
                sumPoints += point;
                numberPassingPoints++;
            }
        }

        if (numberPassingPoints == 0) {
            return sumPoints;
        }

        return (double) sumPoints / numberPassingPoints;
    }

    public double passPercentage() {
        return (double) this.numberPassingPoints * 100 / this.points.size();
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

    public boolean isPassingPoints(int point) {
        return point >= 50;
    }
}
