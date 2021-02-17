
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        double average = 0;
        if (this.count != 0) {
            average = (double) this.sum / this.count;
        }
        return average;
    }
}
