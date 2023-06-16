public class SmartWatch extends SmartDevice{
    private String connectivity;
    private String battery;
    private String display;

    public SmartWatch(){
    }

    public SmartWatch(String name, String type, String brand, String model, String serialNumber, String connectivity, String battery, String display) {
        super(name, type, brand, model, serialNumber);
        this.connectivity = connectivity;
        this.battery = battery;
        this.display = display;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
