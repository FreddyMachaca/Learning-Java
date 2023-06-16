public class SmartDevice {
    private String name;
    private String type;
    private String brand;
    private String model;
    private String serialNumber;

    public SmartDevice(){
    }
    public SmartDevice(String name, String type, String brand, String model, String serialNumber) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

}
