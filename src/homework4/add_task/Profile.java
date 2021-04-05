package homework4.add_task;

public class Profile {
    int id;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String address;
    String postalCode;
    int customerID;
    int supportSpecialistID;

    public Profile(String firstName, String lastName, String email, String phoneNumber, String address, String postalCode, int customerID, int supportSpecialistID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postalCode = postalCode;
        this.customerID = customerID;
        this.supportSpecialistID = supportSpecialistID;
    }

}
