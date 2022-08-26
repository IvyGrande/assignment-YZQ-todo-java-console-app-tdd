package assignment.YZQ.todo.java.console.app.tdd;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private final TaskFactory taskFactory = new TaskFactory();

    List<Task> loadTask(){
        final List<String > lines = taskFactory.readTaskLines();
        final List<Task> tasks = new ArrayList<~>();
        for (int i = 0; i< lines.size(); i++){
            final var id = i + 1;
            final var line = lines.get(i);
            final Task task = taskFactory.createTask(id, line);
            tasks.add(task);
        }
        return tasks;
    }

    private Task createTask(int id, String line) {
        return taskFactory.createTask(id, line);
    }
    list<String> readTaskLines() {
        try {
            return Files.readAllLines(Constants.TASKS_FILE_PATH);
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
    }

    list<String> readTaskLines(){
        return taskFactory.readTaskLines();
    }
}
