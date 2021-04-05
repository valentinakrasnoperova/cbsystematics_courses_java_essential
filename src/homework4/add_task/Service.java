package homework4.add_task;

import java.util.ArrayList;

public class Service {
    int id;
    String serviceName;
    Boolean isActive;
    int serviceMonthPrice;
    ArrayList<Integer> customerId = new ArrayList<>();

    public Service(String serviceName, Boolean isActive, int serviceMonthPrice) {
        this.serviceName = serviceName;
        this.isActive = isActive;
        this.serviceMonthPrice = serviceMonthPrice;
    }
}
