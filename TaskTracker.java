import java.util.HashMap;
import java.util.ArrayList;

public class TaskTracker {
	private HashMap<String, ArrayList<Integer>> completedExercises;

	public TaskTracker() {
		this.completedExercises = new HashMap<>();
	}

	public void add(String user, int exercise) {
		// an empty list has to be added for a new user if one has not already been created
		this.completedExercises.putIfAbsent(user, new ArrayList<>());

		// let's first retrieve the list containing the exercises completed by the user and add to it
		// ArrayList<Integer> completed = this.completedExercises.get(user);
		// completed.add(exercise);
		// without using helper variable:
		this.completedExercises.get(user).add(exercise);

	}

	public void print() {
		for (String name : completedExercises.keySet()) {
			System.out.println(name + ": " + completedExercises.get(name));
		}
	}
}
