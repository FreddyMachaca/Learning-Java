public class SmartPhone extends  SmartDevice{
    private String processor;
    private String ram;
    private String storage;

    public SmartPhone(){
    }

    public SmartPhone(String name, String type, String brand, String model, String serialNumber, String processor, String ram, String storage) {
        super(name, type, brand, model, serialNumber);
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}
