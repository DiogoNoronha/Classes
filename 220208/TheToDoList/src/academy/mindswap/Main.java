package academy.mindswap;

public class Main {

    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

        toDoList.addTask("Wash dishes", 1, Importance.MEDIUM);
        toDoList.addTask("Take the trash out", 1, Importance.LOW);
        toDoList.addTask("Finish homework", 2, Importance.HIGH);
        toDoList.addTask("Feed the dog", 1, Importance.HIGH);
        toDoList.addTask("Go grocery shopping", 1, Importance.MEDIUM);
        toDoList.addTask("Call the hair salon", 2, Importance.LOW);
        toDoList.addTask("Pay bills", 2, Importance.HIGH);

        toDoList.print();
    }
}
