import java.util.List;

public class CocheCrudImpl implements CocheCrud{
    @Override
    public void save(Coche coche) {
        System.out.println("save method");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("findAll method");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("delete method");
    }
}
