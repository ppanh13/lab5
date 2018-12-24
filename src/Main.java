import task3.Task3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1 (Check output1.txt)");
        Task1 task1 = new Task1("output1.txt");
        task1.output();

        System.out.println("\nTask2\nAlso check output2.txt");
        Task2 task2 = new Task2("output2.txt");
        task2.sorting();

        System.out.println("\nTask3");
        Task3 task3 = new Task3("Employees.txt", "EmployeesSorted.txt");
        task3.employeesHadler();

        System.out.println("\nTask4");
        Task4 task4 = new Task4();
        task4.guess();

        System.out.println("\nTask5");
        Task5 task5 = new Task5("input5.txt");
        task5.sorting();

        System.out.println("\nTask6");
        Task6 task6 = new Task6();
        task6.reverse();
    }
}
