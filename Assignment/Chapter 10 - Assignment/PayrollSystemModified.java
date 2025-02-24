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
    private Date birthDate;

    public Employee(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public abstract double earnings(); // Abstract method to calculate earnings

    @Override
    public String toString() {
        return String.format("Name: %s, Birthday: %s", name, birthDate.toString());
    }
}

// Class for salaried employees
class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, double salary, Date birthDate) {
        super(name, birthDate);
        this.salary = salary;
    }

    @Override
    public double earnings() {
        return salary; // Salaried employees earn a fixed salary
    }
}

// Class for hourly employees
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked, Date birthDate) {
        super(name, birthDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double earnings() {
        return hourlyRate * hoursWorked; // Earnings based on hourly rate and hours worked
    }
}

// Class for piece workers
class PieceWorker extends Employee {
    private double wage; // Wage per piece
    private int pieces; // Number of pieces produced

    public PieceWorker(String name, double wage, int pieces, Date birthDate) {
        super(name, birthDate);
        this.wage = wage;
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return wage * pieces; // Earnings based on wage per piece and number of pieces produced
    }
}

// Main class to run the payroll system
public class PayrollSystemModified {
    public static void main(String[] args) {
        // Create an array of Employee references
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("Alice", 3000.00, new Date(15, 5, 1990)); // Birthday in May
        employees[1] = new HourlyEmployee("Bob", 20.00, 160, new Date(10, 10, 1985)); // Birthday in October
        employees[2] = new SalariedEmployee("Charlie", 2500.00, new Date(20, 3, 1992)); // Birthday in March
        employees[3] = new PieceWorker("David", 5.00, 100, new Date(5, 7, 1988)); // Birthday in July

        // Display each employee's information and earnings
        for (Employee employee : employees) {
            System.out.printf("%s, Earnings: $%.2f%n", employee.toString(), employee.earnings());
        }
    }
}