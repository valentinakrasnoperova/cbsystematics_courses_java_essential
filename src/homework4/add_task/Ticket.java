package homework4.add_task;

public class Ticket {
    int id;
    String serviceName;
    Boolean isActive;
    String problemDescription;
    int customerId;
    int supportSpecialistId;

    public Ticket(String serviceName, Boolean isActive, int customerId, String problemDescription) {
        this.serviceName = serviceName;
        this.isActive = isActive;
        this.problemDescription = problemDescription;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setSupportSpecialistId(int supportSpecialistId) {
        this.supportSpecialistId = supportSpecialistId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getSupportSpecialistId() {
        return supportSpecialistId;
    }
}
