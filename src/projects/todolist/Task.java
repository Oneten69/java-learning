package projects.todolist;

public class Task {
    private final String title;
    private final String description;
    private boolean isCompleted;

    public Task(String title, String description, boolean isCompleted) {
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public void complete() {
        isCompleted = true;
    }
    public void printInfo() {
        if (!isCompleted) {
            System.out.println("[ ] " + title + " - " + description);
        }
        else {
            System.out.println("[✓] " + title + " - " + description);
        }
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
}
