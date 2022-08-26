package assignment.YZQ.todo.java.console.app.tdd;

import java.util.ArrayList;
import java.util.List;

public class App {


    private final TaskRepository = new TaskRepository();

    public static void main(String[] args) {
        throw new UnsupportedOperationException();
    }

    public List<String> run() {
        final List<String> lines = TaskRepository.loadTasks();
        final List<String> result =new ArrayList<>();
        result.add("# To be done");
        for (var task : Tasks){
            result.add(task.format());
        }
        return result;

    }
    private  List<Task> loadTasks(){
        return TaskRepository.loadTasks();
    }


    private List<String> readTaskLines() {

        return TaskRepository.readTaskLines();
    }
}






