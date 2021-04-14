package homework9.task2;

import java.util.Objects;

public class EthernetAdapter extends Device{
    int speed;
    String mac;

    public EthernetAdapter(int speed, String mac, String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: " + "manufacturer: " + getManufacturer() +
                ", price: " + getPrice() +
                ", serial number: " + getSerialNumber() +
                ", speed: " + speed +
                ", mac: " + mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return getSpeed() == that.getSpeed() && Objects.equals(getMac(), that.getMac());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 88*result+(int)speed;
        result = 88*result+(mac == null ? 0 : mac.hashCode());
        result = 88*result+(getManufacturer() == null ? 0 : getManufacturer().hashCode());
        result = 88*result+Float.floatToIntBits(getPrice());
        result = 88*result+(getSerialNumber() == null ? 0 : getSerialNumber().hashCode());
        return result;
    }
}
