public interface SupervisorSalary extends Employeei{
    @Override
    default double getTotalSalary(){
        return 1d;
    }
}
