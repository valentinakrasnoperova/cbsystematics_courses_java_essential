package homework4.add_task;

import java.util.ArrayList;

public class Customer {
    Integer id;
    String username;
    String password;
    Integer profileID;
    ArrayList<Integer> serviceId = new ArrayList<>();
    ArrayList<Integer> ticketId = new ArrayList<>();

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getProfileID() {
        return profileID;
    }

    public void setServiceID(int serviceID) {
        this.serviceId.add(serviceID);
    }

    public void setTicketId(ArrayList<Integer> ticketId) {
        this.ticketId = ticketId;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profileID=" + profileID +
                ", serviceId=" + serviceId +
                ", ticketId=" + ticketId +
                '}';
    }
}
