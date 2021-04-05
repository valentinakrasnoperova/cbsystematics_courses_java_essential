package homework4.add_task;

import java.util.ArrayList;

public class SupportSpecialist {
    int id;
    String username;
    String password;
    int profileId;
    ArrayList<Integer> ticketId = new ArrayList<>();

    public SupportSpecialist(String username, String pasword) {
        this.username = username;
        this.password = pasword;

    }

    public ArrayList<Integer> getTicketId() {
        return ticketId;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId.add(ticketId);
    }


}
