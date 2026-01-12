package entities;

public abstract class Device {
    private String serialNumber;

    public Device() {
    }

    public Device(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNumberSerial() {
        return serialNumber;
    }

    public void setNumberSerial(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public abstract void processDoc(String doc);
}
