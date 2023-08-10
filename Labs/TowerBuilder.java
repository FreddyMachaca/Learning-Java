/*Construya una torre en forma de pirámide, como una matriz/lista de cadenas,
dado un número entero positivo number of floors. Un bloque de pisos se representa con "*"carácter.
Por ejemplo, una torre con 3 pisos se ve así:
[
  "  *  ",
  " *** ",
  "*****"
]
*/
public class TowerBuilder {
    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            String floor = "";
            for (int j = 0; j < nFloors - i - 1; j++) {
                floor += " ";
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                floor += "*";
            }
            for (int j = 0; j < nFloors - i - 1; j++) {
                floor += " ";
            }
            tower[i] = floor;
        }
        return tower;
    }

    public static void main(String[] args) {
        String[] tower = towerBuilder(6);
        for (int i = 0; i < tower.length; i++) {
            System.out.println(tower[i]);
        }
    }
}
