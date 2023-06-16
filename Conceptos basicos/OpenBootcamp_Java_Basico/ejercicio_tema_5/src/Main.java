public class Main {
    public static void main(String[] args) {
        CocheCrud cocheCrud = new CocheCrudImpl();

        cocheCrud.save(new Coche());
        cocheCrud.delete(new Coche());
        cocheCrud.findAll();
    }
}
