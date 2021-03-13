import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
    private String topic;
    ArrayList<Task> tasksList = new ArrayList<>();

    public TodoList(String topic){
        this.topic = topic;
    }
    public void createTask(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter task name: ");
        String taskName = sc.nextLine();
        System.out.println("Enter deadline in " + DATE_FORMAT);
        String sDate = sc.nextLine();
        LocalDate date = null;
        try{
            date = LocalDate.parse(sDate, formatter);
        } catch (Exception e){
            System.err.println("Invalid date value:: " + sDate);
        }
        Task t = new Task(taskName);
        t.setDeadline(date);
        tasksList.add(t);
        System.out.println("Task added to list");
    }

    public void addTask(Task task){
        tasksList.add(task);
    }
    public void isDone(Task task){
        tasksList.remove(task);
    }
    public void removeTask(Task task){
        tasksList.remove(task);
    }
    public void renameTask(Task task, String newName){
        task.setName(newName);
    }
    public void displayList(){
        for (Task task: tasksList){
            System.out.println(task.toString());
        }
    }
}
