import java.util.ArrayList;
import java.util.List;

public class Company {
    List<ConstructionSite> constructionSiteList;

    public Company() {
        this.constructionSiteList = new ArrayList<>();
    }

    public void addConstructionSiteList(ConstructionSite constructionSite){
        constructionSiteList.add(constructionSite);
    }

    public double avgWorkers(){
        double count = 0;
        for (ConstructionSite constructionSite : constructionSiteList){
            count += constructionSite.totalWorkers();
        }
        return count / constructionSiteList.size();
    }
}
