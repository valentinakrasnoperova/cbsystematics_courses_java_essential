package homework9.task2;

import java.util.Objects;

public class Monitor extends Device {
    int resolutionX;
    int resolutionY;

    public Monitor(int resolutionX, int resolutionY, String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public String toString() {
        return "Monitor: " + "manufacturer: " + getManufacturer() +
                ", price:  " + getPrice() +
                ", serial number: " + getSerialNumber() +
                ", resolutionX: - " + resolutionX +
                ", resolutionY: - " + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        if ((resolutionX != monitor.resolutionX) || (resolutionY != monitor.resolutionY)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 88 * result + (int) resolutionX;
        result = 88 * result + (int) resolutionY;
        result = 88 * result + (getManufacturer() == null ? 0 : getManufacturer().hashCode());
        result = 88 * result + Float.floatToIntBits(getPrice());
        result = 88 * result + (getSerialNumber() == null ? 0 : getSerialNumber().hashCode());
        return result;
    }
}
