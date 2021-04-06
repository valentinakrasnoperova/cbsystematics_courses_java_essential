package homework4.add_task;

public class Profile {
    int id;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String address;
    String postalCode;
    int customerOrSpecialistID;



    public Profile(String firstName, String lastName, String email, String phoneNumber, String address, String postalCode, int customerOrSpecialistID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postalCode = postalCode;
        this.customerOrSpecialistID = customerOrSpecialistID;
    }

}
