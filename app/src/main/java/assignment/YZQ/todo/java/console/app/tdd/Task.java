package assignment.YZQ.todo.java.console.app.tdd;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Task {
    private final int id;
    private final String name;
    private boolean isCompleted;
    public Task(int id ,String name) {
        this.id = id;
        this.name = name;
    }
    public int getId(){ return id;}

    public String getName(){ return name;}

    String format() {
        return String.format("%d %s", getId(), getName());
    }

    public boolean isCompleted(){
        return this.isCompleted;
    }

    String formatTask(int id, String name) {
        return String.format("%d %s", id, name);
    }

    List<String> readTaskLines() {
        try {
            return Files.readAllLines(Constants.TASKS_FILE_PATH);
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }

    }
}