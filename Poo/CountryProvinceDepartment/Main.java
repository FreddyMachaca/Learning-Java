public class Main {
    public static void main(String[] args) {
        Provincia p1 = new Provincia("ajk");
        Provincia p2 = new Provincia("abc");
        Provincia p3 = new Provincia("def");
        Provincia p4 = new Provincia("ghi");

        Provincia[] provincias = new Provincia[2];
        provincias[0] = p1;
        provincias[1] = p2;
        Provincia[] provincias2 = new Provincia[2];
        provincias2[0] = p3;
        provincias2[1] = p4;


        Departamento d1 = new Departamento("La Paz",provincias);
        Departamento d2 = new Departamento("Santa Cruz",provincias2);

        Departamento[] departamentos = new Departamento[2];
        departamentos[0]=d1;
        departamentos[1]=d2;

        Pais bolivia = new Pais("Bolivia",departamentos,2);
        bolivia.mostrarDepartamentos();
    }
}
