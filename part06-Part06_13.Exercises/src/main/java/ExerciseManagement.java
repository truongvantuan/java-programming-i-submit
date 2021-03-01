
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;
//    private ArrayList<String> completedList;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
//        this.completedList = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise ex : exercises) {
            list.add(ex.getName());
        }

        return list;
    }

    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise ex : exercises) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }
        return false;
    }
}
