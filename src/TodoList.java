import java.time.Month;
import java.util.ArrayList;

public class TodoList {
    private String topic;
    ArrayList<Task> tasksList = new ArrayList<>();

    public TodoList(String topic){
        this.topic = topic;
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

    public static void main(String[] args) {
        TodoList list1 = new TodoList("Morning Routine");
        Task task1 = new Task("Brush teeth");
        task1.setDeadline(2021,1,20);
        Task task2= new Task("Do yoga");
        Task task3 = new Task("Eat breakfast");
        list1.addTask(task1);
        list1.addTask(task2);
        list1.addTask(task3);
        list1.displayList();
        System.out.println();
        list1.isDone(task1);
        list1.displayList();
    }

}
