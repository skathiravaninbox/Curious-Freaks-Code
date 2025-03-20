
import java.util.*;

class EmpData {

    int id;
    String name;
    String department;
    int salary;

    // Constructor
    EmpData(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Overriding toString() to print the object properly
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

public class linkedList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ✅ Defined Scanner
        LinkedList<EmpData> dataLinkedList = new LinkedList<>();

        System.out.print("Enter the number of records: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for record " + (i + 1) + ":");

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            System.out.print("Enter Salary: ");
            int salary = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Create a new EmpData object and add it to the list
            EmpData data = new EmpData(id, name, department, salary);
            dataLinkedList.add(data);
        }

        scanner.close(); // ✅ Close Scanner after use

        // Printing the stored data
        System.out.println("\nStored Data:");
        for (EmpData d : dataLinkedList) {
            System.out.println(d);
        }
    }
}
