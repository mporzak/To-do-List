import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {

        TodoList list1 = new TodoList("Morning");
        list1.createTask();
        list1.createTask();
        list1.displayList();
    }
}
