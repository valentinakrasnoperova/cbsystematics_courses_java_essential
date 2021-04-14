package homework9.task2;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor(1280, 1024, "Samsung", 120, "AB1234567CD");
        Monitor monitor1 = new Monitor(1340, 1114, "Apple", 220, "AJ8234567CD");
        EthernetAdapter ethernetAdapter = new EthernetAdapter(300, "Gg88", "Samsung", 120, "AB1234567CD");

        System.out.println(device);
        System.out.println(device1);
        System.out.println(monitor);
        System.out.println(monitor1);
        System.out.println(ethernetAdapter);

        System.out.println("\n" + "Task four : ");

        System.out.println(device.equals(device1));
        System.out.println(monitor.equals(monitor1));
        System.out.println(ethernetAdapter.equals(device));

        System.out.println("\n");
        System.out.println(device.hashCode());
        System.out.println(device1.hashCode());
        System.out.println(monitor.hashCode());
        System.out.println(monitor1.hashCode());
        System.out.println(ethernetAdapter.hashCode());


    }
}
