package homework1.additionaltask;

public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress();

        adress.setCountry("Ukraine");
        adress.setCity("Lviv");
        adress.setStreet("Shevchenka");
        adress.setIndex(12345);
        adress.setHouse(3);
        adress.setApartment(22);

        adress.showAdress();
    }
}
