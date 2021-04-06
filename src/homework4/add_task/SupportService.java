package homework4.add_task;

public class SupportService {
    public static void main(String[] args) {


        Customer customer1 = new Customer("Ania", "465t29o4");
        Customer customer2 = new Customer("Vania", "028457_rr");
        Customer customer3 = new Customer("Ron", "1248607&&9");
        Customer customer4 = new Customer("Jack", "899645KK4");
        Customer customer5 = new Customer("Mila", "04387&uu33");
        Customer customer6 = new Customer("Gerald", "66542L_L3");
        Customer customer7 = new Customer("Marta", "123467_ii_o");
        Customer customer8 = new Customer("Diana", "92364000o_P");
        Customer customer9 = new Customer("Dima", "0000ill976");
        Customer customer10 = new Customer("Max", "97375ki_v");


        Profile profile1 = new Profile("Ania", "Gnedenko", "agonorenko@gmail.com", "0986775755", "Kyiv, Ukraine Naukova street, 66/7", "088080", 34);
        Profile profile2 = new Profile("Vania", "Litvinenko", "vlitvin@gmail.com", "0964578976", "Lviv, Ukraine Lazarenka street, 09/7", "33444", 35);
        Profile profile3 = new Profile("Ruslan", "Vasyltsiv", "rusvas@gmail.com", "0983452323", "Dnipro, Ukraine Valova street, 96/7", "889940", 36);
        Profile profile4 = new Profile("Oleg", "Kirilenko", "oleg.k77@gmail.com", "0976768594", "Kharkiv, Ukraine Streltsova street, 66/35", "456787", 37);
        Profile profile5 = new Profile("Mila", "Gunko", "m.gunko19890@gmail.com", "0932454678", "Lviv, Ukraine Malona street, 78/17", "111345", 38);
        Profile profile6 = new Profile("Katrin", "Kilichova", "kilichova.k99@gmail.com", "0976890754", "Kyiv, Ukraine Naukova street, 89/7a", "986543", 39);
        Profile profile7 = new Profile("Marta", "Petrova", "mapetrova@gmail.com", "0998765432", "Lviv, Ukraine Kirilkova street, 6a/7", "097633", 40);
        Profile profile8 = new Profile("Diana", "Fedorova", "fedorova33o@gmail.com", "0932564789", "Kharkiv, Ukraine Pushkina street, 56/7b", "095232", 41);
        Profile profile9 = new Profile("Dima", "Surkes", "ds1987@gmail.com", "0964598097", "Lviv, Ukraine Malisheva street, 1/8", "123788", 42);
        Profile profile10 = new Profile("Max", "Bobrenko", "bobr.mm77@gmail.com", "0997864534", "Kyiv, Ukraine Gagarina street, 99/7", "0532123", 43);

        Profile profile11 = new Profile("Yuriy", "Felchen", "felchen2001@gmail.com", "0987775634", "Lviv, Ukraine Shevchenka street, 6b/7", "099987", 15);
        Profile profile12 = new Profile("Alex", "Krikov", "alexk1999@gmail.com", "0987775634", "Lviv, Ukraine Shevchenka street, 6b/7", "099987", 16);
        Profile profile13 = new Profile("Olena", "Diablo", "diabloo99@gmail.com", "0987775634", "Lviv, Ukraine Shevchenka street, 6b/7", "099987", 17);


        Service service1 = new Service("Signalization", true, 3080);
        Service service2 = new Service("Doorphone", true, 1100);
        Service service3 = new Service("Internet", true, 3750);
        Service service4 = new Service("SmartTV", true, 3750);
        Service service5 = new Service("Magazine subscription ", true, 3750);



        SupportSpecialist supportSpecialist1 = new SupportSpecialist("Yuriy", "555888&8999302IIl38");
        SupportSpecialist supportSpecialist2 = new SupportSpecialist("Alex", "9998@@rrY88665433");
        SupportSpecialist supportSpecialist3 = new SupportSpecialist("Olena", "00999ffk&1_kk342");


        Ticket ticket1 = new Ticket("Signalization", true,41,  "does not work properly");
        Ticket ticket2 = new Ticket("Doorphone", true, 37, "does not work properly");
        Ticket ticket3 = new Ticket("Internet", true, 42, "does not work properly");

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

