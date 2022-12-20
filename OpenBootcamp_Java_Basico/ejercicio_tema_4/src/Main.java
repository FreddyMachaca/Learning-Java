public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("S20", "4gb plus", "Samsung", "Smart",
                "JG4G57H", "Snapdragon 890", "12GB", "128GB");

        SmartWatch smartWatch = new SmartWatch("SmartFIT", "Watch crystal", "Xiaomi", "FIT",
                "DJ7H4U3", "Bluetooth", "3000mA", "touch screen");

        System.out.println("smartPhone");
        System.out.println("Name: " + smartPhone.getName());
        System.out.println("Type: " + smartPhone.getType());
        System.out.println("Brand: " + smartPhone.getBrand());
        System.out.println("Model: " + smartPhone.getModel());
        System.out.println("Serial Number: " + smartPhone.getSerialNumber());
        System.out.println("Processor: " + smartPhone.getProcessor());
        System.out.println("Ram: " + smartPhone.getRam());
        System.out.println("Storage: " + smartPhone.getStorage());

        System.out.println("\nsmartWatch");
        System.out.println("Name: " + smartWatch.getName());
        System.out.println("Type: " + smartWatch.getType());
        System.out.println("Brand: " + smartWatch.getBrand());
        System.out.println("Model: " + smartWatch.getModel());
        System.out.println("Serial Number: " + smartWatch.getSerialNumber());
        System.out.println("Connectivity: " + smartWatch.getConnectivity());
        System.out.println("Battery: " + smartWatch.getBattery());
        System.out.println("Display: " + smartWatch.getDisplay());
    }
}
