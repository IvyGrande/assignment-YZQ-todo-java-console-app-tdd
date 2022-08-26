package assignment.YZQ.todo.java.console.app.tdd;

import java.io.IOException;
import java.nio.file.Files;

public class TaskFactory {
    public TaskFactory() {
    }

    static Task createTask(int id, String line) {
        final var field = line.split(" ", 2)[1];
        final var name = field[1];
        final var isCompleted = field[0].equals("x");
        return new Task(id, name, isCompleted);
    }
}