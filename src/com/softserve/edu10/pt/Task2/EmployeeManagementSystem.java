package com.softserve.edu10.pt.Task2;

import java.time.LocalDate;
import java.util.*;

import static java.lang.System.in;

public class EmployeeManagementSystem {
    private Map<Integer, Employee> employees = new LinkedHashMap<>();

    public EmployeeManagementSystem() {
        addEmployee(new Employee(
                    1,
                    "Alice",
                    Employee.Position.DEV,
                    10_000,
                    LocalDate.parse("1999-01-30"))).
        addEmployee(new Employee(
                    2,
                    "Bob",
                    Employee.Position.QA,
                    10_000,
                    LocalDate.parse("2000-03-03")));
    }

    private EmployeeManagementSystem addEmployee(Employee employee) {
        if(employees.containsKey(employee.id())) {
            throw new IllegalArgumentException("Employee with id = " + employee.id() + " already exists");
        }
        employees.put(employee.id(), employee);
        return this;
    }


    public void run(){
        out: while (true) {
            showMainMenu();
            int option = readOption(5);
            switch (option) {
                case 1 -> showEmployee();
                case 2 -> {
                    var employee = promptNewEmployee();
                    addEmployee(employee);
                }
                case 3 -> editEmployee();
                case 4 -> sortEmployee();
                case 5 -> {
                    break out;
                }
            }
        }
        System.out.println("Bye!");
    }

    private void sortEmployee() {
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
            default -> throw new IllegalStateException("Never should be here");
        };

        List<Employee> employeeList = new ArrayList<>(employees.values());
        employeeList.sort(comparator);
        employees = new LinkedHashMap<>();
        for(var employee : employeeList) {
            employees.put(employee.id(), employee);
        }

        showEmployee();

    }

    private void editEmployee() {
        Scanner scanner = new Scanner(in);
        System.out.print("Enter id of the employee to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        var employee = employees.get(id);
        if(employee == null) {
            System.out.println("There is no employee with employee id = " + id);
            return;
        }
        System.out.println("The current name is: " + employee.name());
        System.out.println("Enter new name or an empty line to keep current:");
        String name = scanner.nextLine().trim();
        if(!name.isEmpty()) {
            employee = employee.withName(name);
        }

        System.out.println("The current position is: " + employee.position());
        System.out.println("Enter new position (one of " + Arrays.toString(Employee.Position.values()) +
                            ") " + "or an empty line to keep current:");
        String positionText = scanner.nextLine().trim().toUpperCase();
        if(!positionText.isEmpty()) {
            Employee.Position newPosition = Employee.Position.valueOf(positionText);
            employee = employee.withPosition(newPosition);
        }

        System.out.println("The current salary is: " + employee.salary());
        System.out.println("Enter new salary or an empty line to keep current:");
        String salaryText = scanner.nextLine().trim();
        if(!salaryText.isEmpty()) {
            double newSalary = Double.parseDouble(salaryText);
            employee = employee.withSalary(newSalary);
        }

        employees.put(id, employee);

    }

    private int readIDForNewEmployee() {
        Scanner scanner = new Scanner(in);
        while (true) {
            System.out.print("Enter id for the new employee: ");
            int id = Integer.parseInt(scanner.nextLine());
            if(!employees.containsKey(id)) {
                return id;
            }
            System.out.println("Such is is already exist, choose another one");

        }
    }

    private String readNameForNewEmployee() {
        Scanner scanner = new Scanner(in);
        System.out.print("Enter name for the new employee: ");
        String name = scanner.nextLine();
        return name;
    }

    private Employee.Position readPositionForNewEmployee() {
        Scanner scanner = new Scanner(in);
        System.out.print("Enter position for the new employee. One of: " +
                        Arrays.toString(Employee.Position.values()));
        String positionText = scanner.nextLine();
        return Employee.Position.valueOf(positionText.trim().toUpperCase());
    }

    private double readSalaryForNewEmployee() {
        Scanner scanner = new Scanner(in);
        System.out.print("Enter salary for the new employee: ");
        double salary = Double.parseDouble(scanner.nextLine());
        return salary;
    }

    private String readDateOfBirthForNewEmployee() {
        Scanner scanner = new Scanner(in);
        System.out.print("Enter date of birth for the new employee in format (1990-01-01): ");
        String dateOfBirth = scanner.nextLine();
        return dateOfBirth;
    }

    private Employee promptNewEmployee() {
        System.out.println("Let`s add new employee!");
        int id = readIDForNewEmployee();
        String name = readNameForNewEmployee();
        Employee.Position position = readPositionForNewEmployee();
        double salary = readSalaryForNewEmployee();
        LocalDate dateOfBirth = LocalDate.parse(readDateOfBirthForNewEmployee());

        return new Employee(
                id,
                name,
                position,
                salary,
                dateOfBirth
        );

    }

    private void showEmployee() {
        if(employees.isEmpty()) {
            System.out.println("There are no employees yet");
        } else {
            for (var entry : employees.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    private int readOption(int nOptions) {
        System.out.print("Enter option (1.." +  nOptions + "): ");
        Scanner scanner = new Scanner(in);
        int res = Integer.parseInt(scanner.nextLine());
        return res;
    }

    public void showMainMenu() {
        System.out.println("""
                Main menu:
                    1. Show employees
                    2. Add employee
                    3. Edit employee
                    4. Sort employees
                    5. Exit
                """);
    }
}
