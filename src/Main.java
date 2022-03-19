
import classes.OnTaskErrorListener;
import classes.Worker;
import classes.Worker.OnTaskDoneListener;

public class Main {

	public static void main(String[] args) {
		OnTaskDoneListener listener = System.out::println;
		OnTaskErrorListener errorListener = System.out::println;
		Worker worker = new Worker(listener, errorListener);
		worker.start();
	}
}
