public class Main {
    public static void main(String[] args) {
        ConstructionSite constructionSite = new ConstructionSite(ConstructionType.OFFICE_BUILDING);
        Worker worker = new Worker("Jonah", EmployeeType.BASE_SALARY);
        Worker worker2 = new Worker("Mike", EmployeeType.BASE_SALARY);
        Worker worker3 = new Worker("Ludwig", EmployeeType.BASE_SALARY);
        Worker worker4 = new Worker("Chris", EmployeeType.BASE_SALARY);
        Engineer engineer = new Engineer("Mark", EmployeeType.BASE_SALARY);
        Supervisor supervisor = new Supervisor("Theo", EmployeeType.BASE_SALARY);
        SiteManager siteManager = new SiteManager("Max", EmployeeType.BASE_SALARY);

        constructionSite.addEmployee(worker, worker2, worker3, worker4, engineer, supervisor, siteManager);
        constructionSite.isSiteManager();
        constructionSite.totalWorkers();
        constructionSite.checkStartConstruction();
        supervisor.addWorker(worker2);
        supervisor.addWorker(worker);


        ConstructionSite constructionSite2 = new ConstructionSite(ConstructionType.OFFICE_BUILDING);
        Worker worker5 = new Worker("Jonah", EmployeeType.BASE_SALARY);
        Worker worker6 = new Worker("Mike", EmployeeType.BASE_SALARY);
        Worker worker7 = new Worker("Ludwig", EmployeeType.BASE_SALARY);
        Worker worker8 = new Worker("Chris", EmployeeType.BASE_SALARY);
        Worker worker9 = new Worker("Chris", EmployeeType.BASE_SALARY);
        Worker worker10 = new Worker("Chris", EmployeeType.BASE_SALARY);
        Engineer engineer2 = new Engineer("Mark", EmployeeType.BASE_SALARY);
        Supervisor supervisor2 = new Supervisor("Theo", EmployeeType.BASE_SALARY);
        SiteManager siteManager2 = new SiteManager("Max", EmployeeType.BASE_SALARY);

        constructionSite2.addEmployee(worker5, worker6, worker7, worker8, worker9, worker10, engineer2, supervisor2, siteManager2);
        constructionSite2.isSiteManager();
        constructionSite2.totalWorkers();
        constructionSite2.checkStartConstruction();

        Company company = new Company();
        company.addConstructionSiteList(constructionSite);
        company.addConstructionSiteList(constructionSite2);
        System.out.println("The average number of workers in an Office Building construction site is : " + company.avgWorkers());
    }
}