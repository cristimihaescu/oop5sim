import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Employee implements SupervisorSalary{
    public List<Worker> workerList = new ArrayList<>();


    public Supervisor(String name, EmployeeType employeeType) {
        super(name, 700, 5, 10, employeeType);
    }

    public void addWorker(Worker worker){
        workerList.add(worker);
    }

    private double hourlySalary() {
        return salaryPerHour * workingHours;
    }

    private double workerBonus(){
        return 0.5 * workerList.stream().count();
    }

    @Override
    public double getTotalSalary() {
        if(employeeType == EmployeeType.BASE_SALARY){
            salary = (int) (salary + hourlySalary() + workerBonus());
        }
        if(employeeType == EmployeeType.PART_TIME){
            salary = (int) (hourlySalary() + workerBonus());
        }
        return salary;
    }
}
