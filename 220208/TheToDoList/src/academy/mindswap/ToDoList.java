package academy.mindswap;

import java.util.PriorityQueue;
import java.util.Queue;

public class ToDoList{

    private Queue<Task> priorityQueue;

    public ToDoList(){
        this.priorityQueue = new PriorityQueue<>();
    }

    public void addTask(String task, int priority, Importance importance){
        priorityQueue.add(new Task(task, priority, importance));
    }

    public void removeTask(){
        priorityQueue.remove();
    }

    public void print(){
        while(!priorityQueue.isEmpty()){
            Task task = priorityQueue.poll();
            System.out.println(task.getIMPORTANCE() + " " + task.getPRIORITY() + " " + task.getTASK());
        }
    }

    public static class Task implements Comparable<ToDoList.Task>{
        private final String TASK;
        private final int PRIORITY;
        private final Importance IMPORTANCE;

        public Task(String task, int priority, Importance importance){
            this.TASK = task;
            this.PRIORITY = priority;
            this.IMPORTANCE = importance;
        }

        public String getTASK() {
            return TASK;
        }

        public int getPRIORITY() {
            return PRIORITY;
        }

        public Importance getIMPORTANCE() {
            return IMPORTANCE;
        }

        @Override
        public int compareTo(Task o) {
            int result = Integer.compare(IMPORTANCE.getImportance(), o.IMPORTANCE.getImportance());
            if(result == 0){
                result = Integer.compare(PRIORITY, o.PRIORITY);
                if(result == 0){
                    result = TASK.compareTo(o.TASK);
                }
            }
            return result;
        }
    }
}

    /*
        @Override
    public int compareTo(Person o) {
        int result = Integer.compare(age,o.getAge());
        if(result == 0) {
            result = name.compareTo(o.getName());
        }
        return result;
    }
} */

