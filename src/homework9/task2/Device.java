package homework9.task2;

import java.util.Objects;

public class Device {
    String manufacturer;
    float price;
    String serialNumber;

    public Device(String manufacturer,float price, String serialNumber) {
        this.price = price;
        this.manufacturer=manufacturer;
        this.serialNumber=serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " + "manufacturer: " + manufacturer +
                ", price: " + price + ", serialNumber: " + serialNumber ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return Float.compare(device.getPrice(), getPrice()) == 0 && Objects.equals(getManufacturer(), device.getManufacturer()) && Objects.equals(getSerialNumber(), device.getSerialNumber());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 88*result+(getManufacturer() == null ? 0 : getManufacturer().hashCode());
        result = 88*result+Float.floatToIntBits(getPrice());
        result = 88*result+(getSerialNumber() == null ? 0 : getSerialNumber().hashCode());
        return result;
    }
}
