// This is a simple java class file for a to-do list.
// Import necessary libraries
import java.util.*;
import java.time.LocalDateTime;

enum priorityIndex{
    // Priority 1,2,3 matched to their degree of criticality.
    HIGH, MEDIUM, LOW
}

enum completionStatus {
    COMPLETED,
    INPROGRESS,
    COMING SOON
}
public class ToDoManager {

    //Variables
    private String taskName;
    private LocalDateTime dueDate;
    private priorityIndex priorityIndex;




    // Constructors
    ToDoManager(String taskName, priorityIndex priorityIndex, LocalDateTime dueDate){
        this.taskName = taskName;
        this.priorityIndex = priorityIndex;
        this.dueDate = dueDate;
    }


    // Getters and Setters
    public String getTaskName(){
        return taskName;
    }
    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
    public LocalDateTime getDueDate(){
        return dueDate;
    }
    public void setDueDate(LocalDateTime dueDate){
        this.dueDate = dueDate;
    }
    public priorityIndex getPriorityIndex(){
        return priorityIndex;
    }



    // METHODS
    public void addTask(String taskName){
        // Ensure that a task with a similar name does not exist before adding task


    }

    public String removeTask(String taskName){
        System.out.println("Task: " + getTaskName)
    }

    public void markAsComplete (String taskName){

    }

    public String viewTask (String taskName, LocalDateTime dueDate){
        //Search the task using the taskName, use the getter.


    }

    public void saveTask(String taskName, LocalDateTime dueDate){

    }

    public String displayAllTasks(String taskName, LocalDateTime dueDate, priorityIndex priorityIndex){

    }


}

public class JavaToDo{
    private String taskDescription;
    private completionStatus completionStatus;
    private ToDoManager TodoManager;

        JavaToDo(String taskDescription, completionStatus completionStatus, TodoManager TodoManager){
            this.taskDescription = taskDescription;
            this.completionStatus = completionStatus;
            this.ToDoManager = new ToDoManager();
        }

        // Getters and Setters
        public String getTaskDescription(){
            return taskDescription;
        }
        public void setTaskDescription(String taskDescription){
            this.taskDescription = taskDescription;
        }
        public completionStatus getCompletionStatus(){
            return completionStatus;
        }
        public void setCompletionstatus(completionStatus completionStatus){
            this.completionStatus = completionStatus;
        }

    public static void displayMenu(){
            System.out.println("======PLAN YOUR DAY WELL!!=========");
            System.out.println("1. Display all Tasks")
            System.out.println("2. Add Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Save Task")
            System.out.println("5. Mark as Complete");
            System.out.println("6. View Task");
            System.out.println("7. List Tasks based on priority")

    }
    public static void main(String[] args){

        // To accept inputs we use scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Here to plan!! Welcome");
        System.out.println("Please enter your name:");

        String userName = sc.nextLine();

        // Create a to-do list object
        JavaToDo JavaToDo = new JavaTodo(userName);
        int choice;

        // We will use a switch case loop that is embeded in the do while loop.

        do{
            System.out.println("Please enter Option (1 - 7)");
            choice = sc.nextInt();
            sc.nextLine(); // Use the next line

            switch(choice){
                case 1:

                    break;

                case 2:

                    break;


                case 3:

                    break;

                case 4:


                    break;


                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;
            }

        } while (choice !=7){
            System.out.println("Invalid number. Choose a number between 1 - 7");
            sc.close;

        }
    }

}
