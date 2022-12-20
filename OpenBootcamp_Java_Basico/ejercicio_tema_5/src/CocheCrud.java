import java.util.List;

public interface CocheCrud {

    void save(Coche coche);

    //find all = encuentra todos
    // sirve para encontrar todos los coches
    List<Coche> findAll();

    void delete(Coche coche);
}
