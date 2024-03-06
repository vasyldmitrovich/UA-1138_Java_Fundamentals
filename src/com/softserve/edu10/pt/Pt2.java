package com.softserve.edu10.pt;

import java.time.LocalDate;
import java.util.*;

import static com.softserve.edu01.hw.App.scanner;
import static java.lang.System.in;

public class Pt2 {//Good
    public static void main(String[] args) {
        var register = new EmployeeManagementSystem();
        register.run();
    }
}

class EmployeeManagementSystem {
    private Map<Integer, Employee> employees = new LinkedHashMap<>();

    public EmployeeManagementSystem() {
        addEmployee(new Employee(
                1,
                "Alice",
                Position.DEV,
                10_000,
                LocalDate.parse("1999-01-30")));
        addEmployee(new Employee(
                2,
                "Bob",
                Position.QA,
                10_000,
                LocalDate.parse("2000-03-03"))
        );
    }

    private void addEmployee(Employee employee) {
        if (employees.containsKey(employee.id())){
            throw new IllegalArgumentException("Employee with id = " +
                    employee.id() + "already exists");
        }
        employees.put(employee.id(), employee);
    }
    public void run() {
        out: while (true) {
            showMainMenu();
            int option = readOption(5);
            switch (option) {
                case 1 -> showEmployees();
                case 2 -> {
                    var employee = promptNewEmployee();
                    addEmployee(employee);
                }
                case 3 -> editEmployee();
                case 4 -> sortEmployees();
                case 5 -> {
                    break out;
                }
            }
        }
        System.out.println("Bye!");
    }

    private void sortEmployees() {
        System.out.println("""
                Choose the sorting field:
                1. id
                2. name
                3. position
                """);
        int option = readOption(3);
        Comparator<Employee> comparator = switch (option) {
            case 1 -> Comparator.comparing(Employee::id);
            case 2 -> Comparator.comparing(Employee::name);
            case 3 -> Comparator.comparing(Employee::position);
            default -> throw new IllegalArgumentException("Never should be here");
        };
        List<Employee> employeeList = new ArrayList<>(employees.values());
        employeeList.sort(comparator);
        employees = new LinkedHashMap<>();
        for (var employee: employeeList) {
            employees.put(employee.id(), employee);
        }
        showEmployees();
    }

    private void editEmployee() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter id of the employee to edit:");
        int id = Integer.parseInt(scanner.nextLine());
        var employee = employees.get(id);
        if (employee == null) {
            System.out.println("There is no employee with id = " + id);
            return;
        }
        System.out.println("The current name is " + employee.name());
        System.out.println("Enter new name or an empty line to keep current:");
        String name = scanner.nextLine().trim();
        if(!name.isEmpty()) {
            employee = employee.withName(name);
        }

        System.out.println("The current position is " + employee.position());
        System.out.println("Enter new position (one of: " +
                Arrays.toString(Position.values()) + ")\n" +
                " or an empty line to keep current:");
        String positionText = scanner.nextLine().trim().toUpperCase();
        if(!positionText.isEmpty()) {
            Position newPosition = Position.valueOf(positionText);
            employee = employee.withPosition(newPosition);
        }

        System.out.println("The current salary is " + employee.salary());
        System.out.println("Enter new salary or an empty line to keep current:");
        String salaryText = scanner.nextLine().trim();
        if(!salaryText.isEmpty()) {
            double newSalary = Double.parseDouble(salaryText);
            employee = employee.withSalary(newSalary);
        }

        employees.put(id, employee);
    }

    private int readIdForNewEmployee() {
        while (true) {
            System.out.println("Enter id for the new employee:");
            int id = Integer.parseInt(scanner.nextLine());
            if (!employees.containsKey(id)) {
                return id;
            }
            System.out.println("Such id is already occupied, choose another one");
        }
    }

    private Employee promptNewEmployee() {
        Scanner scanner = new Scanner(in);
        System.out.println("Let's add new employee!");
        int id = readIdForNewEmployee();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        Position position = readPosition();
        System.out.println("Enter salary:");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the date of birth (use format 0000-00-00):");
        LocalDate dob = LocalDate.parse(scanner.nextLine().trim());
        return new Employee(
                id,
                name,
                position,
                salary,
                dob);
    }

    private Position readPosition() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter position (one of: " +
                Arrays.toString(Position.values()) + "):");
        var positionText = scanner.nextLine();
        return Position.valueOf(positionText.trim().toUpperCase());
    }

    private void showEmployees() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees yet");
        } else {
            for (var entry: employees.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    private int readOption(int nOptions) {
        System.out.println("Enter option from (1..." + nOptions + "):");
        Scanner scanner = new Scanner(in);
        int res = Integer.parseInt(scanner.nextLine());
        return res;
    }


    private void showMainMenu() {
        System.out.println("""
                 Main menu:
                 1. Show employees
                 2. Add new employee
                 3. Edit employee
                 4. Sort
                 5. Exit
                 """);
    }
}

record Employee (
        int id,
        String name,
        Position position,
        double salary,
        LocalDate dateOfBirth
){
    @Override
    public String toString() {
        return "Employee{" +
                "name = '" + name + '\'' +
                ", position = " + position +
                ", salary = " + salary +
                ", dateOfBirth = " + dateOfBirth +
                '}';
    }

    public Employee withName(String name) {
        return new Employee(id, name, position, salary, dateOfBirth);
    }

    public Employee withPosition(Position position) {
        return new Employee(id, name, position, salary, dateOfBirth);
    }

    public Employee withSalary(double salary) {
        return new Employee(id, name, position, salary, dateOfBirth);
    }
}

enum Position {
    DEV, QA, DEVOPS, MANAGER;
}