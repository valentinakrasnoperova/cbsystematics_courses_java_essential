package homework4.add_task;

import java.util.ArrayList;
import java.util.Scanner;

public class SupportService {
    public static void main(String[] args) {


        Customer customer1 = new Customer("Ania", "465294");
        Customer customer2 = new Customer("Vania", "028457");
        Customer customer3 = new Customer("Ron", "12486079");
        Customer customer4 = new Customer("Jack", "8996454");
        Customer customer5 = new Customer("Mila", "0438733");
        Customer customer6 = new Customer("Gerald", "665423");
        Customer customer7 = new Customer("Marta", "123467");
        Customer customer8 = new Customer("Diana", "92364");
        Customer customer9 = new Customer("Dima", "0000999776");
        Customer customer10 = new Customer("Max", "97375");


        Profile profile1 = new Profile("Ania", "Gan", "agen@gmail.com", "0986775755", "Naukova street, 66/7", "088080", 1, 0);
        Profile profile2 = new Profile("Vania", "Liam", "vlia@gmail.com", "0964578976", "garnova street, 09/7", "33444", 2, 0);
        Profile profile3 = new Profile("Ron", "Vas", "ronvas@gmail.com", "0983452323", "Valova street, 96/7", "889940", 3, 0);
        Profile profile4 = new Profile("Jack", "Kirilenko", "jk77@gmail.com", "0976768594", "Harnova street, 66/35", "456787", 4, 0);
        Profile profile5 = new Profile("Mila", "Men", "mm890@gmail.com", "0932454678", "Malona street, 78/17", "111345", 5, 0);
        Profile profile6 = new Profile("Gerald", "Kitok", "youtt7@gmail.com", "0976890754", "Naukova street, 89/7a", "986543", 6, 0);
        Profile profile7 = new Profile("Marta", "Petrova", "mapetrova@gmail.com", "0998765432", "Kirilkova street, 6a/7", "097633", 7, 0);
        Profile profile8 = new Profile("Diana", "Fedorova", "fedorova33o@gmail.com", "0932564789", "Wakarova street, 56/7b", "095232", 8, 0);
        Profile profile9 = new Profile("Dima", "Surkes", "ds1987@gmail.com", "0964598097", "Malisheva street, 1/8", "123788", 9, 0);
        Profile profile10 = new Profile("Max", "Bobrenko", "bbmm77@gmail.com", "0997864534", "Gagarina street, 99/7", "0532123", 10, 0);

        Profile profile11 = new Profile("Yuriy", "Felchen", "felchen2001@gmail.com", "0987775634", "Shevchenka street, 6/7", "099987", 0, 1);
        Profile profile12 = new Profile("Alex", "Krikov", "alexk1999@gmail.com", "0987775634", "Shevchenka street, 6/7", "099987", 0, 2);
        Profile profile13 = new Profile("Olena", "Diablo", "diabloo99@gmail.com", "0987775634", "Shevchenka street, 6/7", "099987", 0, 3);


        Service service1 = new Service("Signalization", true, 3080);
        Service service2 = new Service("Domophone", true, 1100);
        Service service3 = new Service("Internet", true, 3750);


        SupportSpecialist supportSpecialist1 = new SupportSpecialist("Yuriy", "555888899930238");
        SupportSpecialist supportSpecialist2 = new SupportSpecialist("Alex", "999888665433");
        SupportSpecialist supportSpecialist3 = new SupportSpecialist("Olena", "00999911342");


        Ticket ticket1 = new Ticket("Signalization", true, "does not work properly");
        Ticket ticket2 = new Ticket("Domophone", true, "does not work properly");
        Ticket ticket3 = new Ticket("Internet", true, "does not work properly");

        customer1.setProfileID(profile1.id);
        customer2.setProfileID(profile2.id);
        customer3.setProfileID(profile3.id);
        customer4.setProfileID(profile4.id);
        customer5.setProfileID(profile5.id);
        customer6.setProfileID(profile6.id);
        customer7.setProfileID(profile7.id);
        customer8.setProfileID(profile8.id);
        customer9.setProfileID(profile9.id);
        customer10.setProfileID(profile10.id);

        supportSpecialist1.setProfileId(profile11.id);
        supportSpecialist2.setProfileId(profile12.id);
        supportSpecialist3.setProfileId(profile13.id);


        customer1.setServiceID(service1.id);
        customer1.setServiceID(service2.id);
        customer1.setServiceID(service3.id);
        customer2.setServiceID(service3.id);
        customer4.setServiceID(service2.id);
        customer5.setServiceID(service1.id);
        customer6.setServiceID(service2.id);
        customer7.setServiceID(service3.id);
        customer8.setServiceID(service1.id);
        customer9.setServiceID(service2.id);
        customer10.setServiceID(service3.id);


    }
}

