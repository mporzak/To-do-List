import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list name: ");
        String listName = sc.nextLine();
        TodoList list1 = new TodoList(listName);
        list1.createTask();
        list1.createTask();
        list1.displayList();
    }
}
