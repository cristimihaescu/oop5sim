import java.util.UUID;

public abstract class Employee implements Employeei {
    UUID employeeId;
    String name;
    int salary;
    int salaryPerHour;
    int workingHours;
    EmployeeType employeeType;

    @Override
    public double getTotalSalary() {
        double totalSalary = 0;
        if (employeeType == EmployeeType.BASE_SALARY) {
            totalSalary = salary + salaryPerHour * workingHours;
        }
        if (employeeType == EmployeeType.PART_TIME) {
            totalSalary = (salaryPerHour * workingHours) * 2;
        }
        return totalSalary;
    }


    public Employee(String name, int salary, int salaryPerHour, int workingHours, EmployeeType employeeType) {
        this.employeeId = UUID.randomUUID();
        this.name = name;
        this.salary = salary;
        this.salaryPerHour = salaryPerHour;
        this.workingHours = workingHours;
        this.employeeType = employeeType;
    }
}
