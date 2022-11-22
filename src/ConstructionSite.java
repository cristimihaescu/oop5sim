import java.util.ArrayList;
import java.util.List;

public class ConstructionSite {
    public List<Employee> employeeList;
    ConstructionType constructionType;

    public ConstructionSite(ConstructionType constructionType) {
        this.constructionType = constructionType;
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee... employees) {
        employeeList.addAll(List.of(employees));
    }

    public int totalWorkers() {
        return (int) employeeList.stream().filter(employee -> employee instanceof Worker).count();

//        int count = 0;
//        for(Employee employee : employeeList){
//            if(employee instanceof Worker){
//                count++;
//            }
//        }
//        return count;
    }

    public boolean isSiteManager() {
        for (Employee employee : employeeList) {
            if (employee instanceof SiteManager) {
                return true;
            }
        }
        return false;
    }

    public void checkStartConstruction() {
        if (isSiteManager()) {
            System.out.println("The construction can now start !");
        } else {
            System.out.println("The construction needs a SiteManager !");
        }
    }
}
