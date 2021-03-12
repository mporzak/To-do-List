import java.time.LocalDate;
import java.util.Date;

public class Task {
    private String name;
    private LocalDate deadline;

    public Task(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDeadline(int year, int month, int day){
        deadline = LocalDate.of(year, month, day);
        this.deadline = deadline;
    }
    public String getName(){
        return name;
    }
    public LocalDate getDeadline(){
        return deadline;
    }
    public String toString(){
        if (deadline == null)
            return name;
        else
            return name + ", deadline: " + deadline;
    }
    public void display(){
    }
}
