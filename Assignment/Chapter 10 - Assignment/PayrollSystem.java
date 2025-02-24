import java.util.Calendar;

// Class to represent a date (employee's birthday)
class Date {
    private int day;
    private int month; // 1-12
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }
}

// Abstract class for Employee
abstract class Employee {
    private String name;
    private double salary;
    private Date birthDate;

    public Employee(String name, double salary, Date birthDate) {
        this.name = name;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    protected boolean isBirthdayMonth(int currentMonth) {
        return this.birthDate.getMonth() == currentMonth;
    }

    public abstract double calculatePayroll(int currentMonth);
}

// Class for salaried employees
class SalariedEmployee extends Employee {
    public SalariedEmployee(String name, double salary, Date birthDate) {
        super(name, salary, birthDate);
    }

    @Override
    public double calculatePayroll(int currentMonth) {
        double payroll = getSalary();
        if (isBirthdayMonth(currentMonth)) {
            payroll += 100.00; // Bonus for birthday month
        }
        return payroll;
    }
}

// Class for hourly employees
class HourlyEmployee extends Employee {
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked, Date birthDate) {
        super(name, hourlyRate * hoursWorked, birthDate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayroll(int currentMonth) {
        double payroll = getSalary(); // Salary is calculated as hourly rate * hours worked
        if (isBirthdayMonth(currentMonth)) {
            payroll += 100.00; // Bonus for birthday month
        }
        return payroll;
    }
}

// Main class to run the payroll system
public class PayrollSystem {
    public static void main(String[] args) {
        // Create an array of Employee references
        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee("Alice", 3000.00, new Date(15, 5, 1990));
        employees[1] = new HourlyEmployee("Bob", 20.00, 160, new Date(10, 10, 1985)); 
        employees[2] = new SalariedEmployee("Charlie", 2500.00, new Date(20, 3, 1992));

        // Get the current month
        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH) + 1;

        // Calculate payroll for each employee
        for (Employee employee : employees) {
            double payroll = employee.calculatePayroll(currentMonth);
            System.out.printf("Payroll for %s: $%.2f%n", employee.getName(), payroll);
        }
    }
}