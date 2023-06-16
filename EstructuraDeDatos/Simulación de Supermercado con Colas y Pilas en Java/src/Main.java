import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PilaProducto pila1 = new PilaProducto(10);
        PilaProducto pila2 = new PilaProducto(10);
        PilaProducto pila3 = new PilaProducto(10);
        PilaProducto pila4 = new PilaProducto(10);

        Producto prod1 = new Producto("Bon o Bon 288GR", 20);
        Producto prod2 = new Producto("Chizitos 240GR", 25);
        Producto prod3 = new Producto("Powerade Azul 990ML", 11);
        Producto prod4 = new Producto("Almendra Real 180GR", 60);
        Producto prod5 = new Producto("Café Nestle 500GR", 45);
        Producto prod6 = new Producto("Maltín 473ML", 80);
        Producto prod7 = new Producto("Caramelo Arcor 350GR", 10);
        Producto prod8 = new Producto("Chocolate Breick 210GR", 70);
        Producto prod9 = new Producto("Malta Real 350ML", 5);
        Producto prod10 = new Producto("Chicharron Frutilla 200GR", 15);
        Producto prod11 = new Producto("Galleta Almond 150GR", 55);
        Producto prod12 = new Producto("Coka Quina 2LT", 8);

        pila1.adicionar(prod1);
        pila1.adicionar(prod2);
        pila1.adicionar(prod3);
        pila2.adicionar(prod4);
        pila2.adicionar(prod5);
        pila2.adicionar(prod6);
        pila3.adicionar(prod7);
        pila3.adicionar(prod8);
        pila3.adicionar(prod9);
        pila4.adicionar(prod10);
        pila4.adicionar(prod11);
        pila4.adicionar(prod12);

        ColaCarrito cola1 = new ColaCarrito(10);
        ColaCarrito cola2 = new ColaCarrito(10);
        ColaCarrito cola3 = new ColaCarrito(10);
        ColaCarrito cola4 = new ColaCarrito(10);

        Carrito carr1 = new Carrito("Quispe", "12572837LP", "Masculino", 25, pila1);
        Carrito carr2 = new Carrito("Flores", "13324605LP", "Femenino", 70, pila2);
        Carrito carr3 = new Carrito("Llanos", "12447859LP", "Masculino", 50, pila3);
        Carrito carr4 = new Carrito("Torrez", "14825623LP", "Femenino", 10, pila4);
        Carrito carr5 = new Carrito("Mejía", "15648596LP", "Masculino", 65, pila1);
        Carrito carr6 = new Carrito("Campos", "14523625LP", "Femenino", 20, pila2);
        Carrito carr7 = new Carrito("Arce", "12532652LP", "Masculino", 25, pila3);
        Carrito carr8 = new Carrito("Romero", "12315452LP", "Femenino", 15, pila4);
        Carrito carr9 = new Carrito("Condori", "12315425LP", "Masculino", 62, pila1);
        Carrito carr10 = new Carrito("Limachi", "14251245LP", "Femenino", 51, pila2);
        Carrito carr11 = new Carrito("Conde", "12548256LP", "Masculino", 72, pila3);
        Carrito carr12 = new Carrito("Mamani", "14512451LP", "Femenino", 53, pila4);

        cola1.adicionar(carr1);
        cola1.adicionar(carr2);
        cola1.adicionar(carr3);
        cola2.adicionar(carr4);
        cola2.adicionar(carr5);
        cola2.adicionar(carr6);
        cola3.adicionar(carr7);
        cola3.adicionar(carr8);
        cola3.adicionar(carr9);
        cola4.adicionar(carr10);
        cola4.adicionar(carr11);
        cola4.adicionar(carr12);

        Caja[] cajas = new Caja[4];
        Caja caj1 = new Caja("José Hernández", "12356154LP", "Masculino", 34, cola1);
        Caja caj2 = new Caja("Milenca Pari", "14236256LP", "Femenino", 45, cola2);
        Caja caj3 = new Caja("Victor Quispe", "12356154LP", "Maculino", 25, cola3);
        Caja caj4 = new Caja("Sofía Laruta", "14236251LP", "Femenino", 52, cola4);
        cajas[0] = caj1;
        cajas[1] = caj2;
        cajas[2] = caj3;
        cajas[3] = caj4;

        Sucursal suc1 = new Sucursal("Prado", "Fuente de La Juventud - El Prado", cajas);

        int opcion = 0;
        while (opcion != 4) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("\t\tMENÚ");
            System.out.println("\n1. Productos (Pilas)");
            System.out.println("2. Carritos (Colas)");
            System.out.println("3. Escenarios");
            System.out.println("4. Salir.");
            System.out.print("\nElija una opción ---> ");
            opcion = scan1.nextInt();

            switch (opcion) {
                case 1:
                    int opcion2 = 0;
                    while (opcion2 != 4) {
                        Scanner scan2 = new Scanner(System.in);
                        System.out.println("\n\t\tPRODUCTOS (PILAS)");
                        System.out.println("\n1. Mostrar");
                        System.out.println("2. Agregar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Volver.");
                        System.out.print("\nElija una opción ---> ");
                        opcion2 = scan2.nextInt();
                        switch (opcion2) {
                            case 1:
                                int opcion3 = 0;
                                while (opcion3 != 3) {
                                    Scanner scan3 = new Scanner(System.in);
                                    System.out.println("\n\t\tMOSTRAR PRODUCTO (PILAS)");
                                    System.out.println("\n1. Mostrar Todas las Pilas de Productos");
                                    System.out.println("2. Mostrar Una Pila de Productos");
                                    System.out.println("3. Volver.");
                                    System.out.print("\nElija una opción ---> ");
                                    opcion3 = scan3.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            System.out.println("\n\t\tMOSTRANDO LAS PILAS DE PRODUCTOS");
                                            pila1.mostrar();
                                            System.out.println("--------------------------------------");
                                            pila2.mostrar();
                                            System.out.println("--------------------------------------");
                                            pila3.mostrar();
                                            System.out.println("--------------------------------------");
                                            pila4.mostrar();
                                            break;
                                        case 2:
                                            System.out.println("\n\t\tMOSTRANDO UNA PILA DE PRODUCTOS");
                                            int numeroPila;
                                            Scanner scan4 = new Scanner(System.in);
                                            System.out.print("\nIngresar el número de pila a mostrar: ");
                                            numeroPila = scan4.nextInt();
                                            System.out.println("\n\t\tMOSTRANDO LA PILA DE PRODUCTOS " + numeroPila);
                                            if (numeroPila == 1) {
                                                pila1.mostrar();
                                            } else if (numeroPila == 2) {
                                                pila2.mostrar();
                                            } else if (numeroPila == 3) {
                                                pila3.mostrar();
                                            } else if (numeroPila == 4) {
                                                pila4.mostrar();
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                int opcion4 = 0;
                                while (opcion4 != 4) {
                                    Scanner scan7 = new Scanner(System.in);
                                    System.out.println("\n\t\tAGREGAR PRODUCTO (PILAS)");
                                    System.out.println("\n1. Agregar al Final");
                                    System.out.println("2. Agregar al Inicio");
                                    System.out.println("3. Agregar a una Posición");
                                    System.out.println("4. Volver.");
                                    System.out.print("\nElija una opción ---> ");
                                    opcion4 = scan7.nextInt();
                                    switch (opcion4) {
                                        case 1:
                                            String nombre1;
                                            int precio1;
                                            Scanner scan8 = new Scanner(System.in);
                                            System.out.println("\n\t\tAGREGAR PRODUCTO AL FINAL (PILAS)");
                                            System.out.print("\nIngresar el nombre del Producto: ");
                                            nombre1 = scan8.next();
                                            System.out.print("Ingresar el precio del Producto: ");
                                            precio1 = scan8.nextInt();
                                            agregaProductoAlFinal(nombre1, precio1, pila1, pila2, pila3, pila4);
                                            break;
                                        case 2:
                                            String nombre2;
                                            int precio2;
                                            Scanner scan9 = new Scanner(System.in);
                                            System.out.println("\n\t\tAGREGAR PRODUCTO AL INICIO (PILAS)");
                                            System.out.print("\nIngresar el nombre del Producto: ");
                                            nombre2 = scan9.next();
                                            System.out.print("Ingresar el precio del Producto: ");
                                            precio2 = scan9.nextInt();
                                            agregaProductoAlInicio(nombre2, precio2, pila1, pila2, pila3, pila4);
                                            break;
                                        case 3:
                                            String nombre3;
                                            int precio3;
                                            Scanner scan10 = new Scanner(System.in);
                                            System.out.println("\n\t\tAGREGAR PRODUCTO A UNA POSICIÓN (PILAS)");
                                            System.out.print("\nIngresar el nombre del Producto: ");
                                            nombre3 = scan10.next();
                                            System.out.print("Ingresar el precio del Producto: ");
                                            precio3 = scan10.nextInt();
                                            agregarAUnaPosicionProducto(nombre3, precio3, pila1, pila2, pila3, pila4);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                int opcion5 = 0;
                                while (opcion5 != 5) {
                                    Scanner scan11 = new Scanner(System.in);
                                    System.out.println("\n\t\tELIMINAR PRODUCTO (PILAS)");
                                    System.out.println("\n1. Eliminar el Último");
                                    System.out.println("2. Eliminar el Primero");
                                    System.out.println("3. Eliminar de una Posición");
                                    System.out.println("4. Eliminar por Nombre de Producto");
                                    System.out.println("5. Volver.");
                                    System.out.print("\nElija una opción ---> ");
                                    opcion5 = scan11.nextInt();
                                    switch (opcion5) {
                                        case 1:
                                            System.out.println("\n\t\tELIMINAR ÚLTIMO PRODUCTO (PILAS)");
                                            eliminarUltimoProducto(pila1, pila2, pila3, pila4);
                                            break;
                                        case 2:
                                            System.out.println("\n\t\tELIMINAR PRIMER PRODUCTO (PILAS)");
                                            eliminarPrimerProducto(pila1, pila2, pila3, pila4);
                                            break;
                                        case 3:
                                            System.out.println("\n\t\tELIMINAR POSICIÓN PRODUCTO (PILAS)");
                                            eliminarUnaPosicionProducto(pila1, pila2, pila3, pila4);
                                            break;
                                        case 4:
                                            System.out.println("\n\t\tELIMINAR POR NOMBRE PRODUCTO (PILAS)");
                                            eliminarPorNombreProducto(pila1, pila2, pila3, pila4);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    int opcion6 = 0;
                    while (opcion6 != 4) {
                        Scanner scan12 = new Scanner(System.in);
                        System.out.println("\n\t\tCARRITOS (COLAS)");
                        System.out.println("\n1. Mostrar");
                        System.out.println("2. Agregar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Volver.");
                        System.out.print("\nElija una opción ---> ");
                        opcion6 = scan12.nextInt();
                        switch (opcion6) {
                            case 1:
                                int opcion7 = 0;
                                while (opcion7 != 3) {
                                    Scanner scan13 = new Scanner(System.in);
                                    System.out.println("\n\t\tMOSTRAR CARRITO (COLAS)");
                                    System.out.println("\n1. Mostrar Todas las Colas de Carritos");
                                    System.out.println("2. Mostrar Una Cola de Carritos");
                                    System.out.println("3. Volver.");
                                    System.out.print("\nElija una opción ---> ");
                                    opcion7 = scan13.nextInt();
                                    switch (opcion7) {
                                        case 1:
                                            System.out.println("\n\t\tMOSTRANDO LAS COLAS DE CARRITOS");
                                            cola1.mostrar();
                                            System.out.println("--------------------------------------");
                                            cola2.mostrar();
                                            System.out.println("--------------------------------------");
                                            cola3.mostrar();
                                            System.out.println("--------------------------------------");
                                            cola4.mostrar();
                                            break;
                                        case 2:
                                            System.out.println("\n\t\tMOSTRANDO UNA COLA DE CARRITOS");
                                            int numeroCola;
                                            Scanner scan14 = new Scanner(System.in);
                                            System.out.print("\nIngresar el número de cola a mostrar: ");
                                            numeroCola = scan14.nextInt();
                                            System.out.println("\n\t\tMOSTRANDO LA COLA DE CARRITOS " + numeroCola);
                                            if (numeroCola == 1) {
                                                cola1.mostrar();
                                            } else if (numeroCola == 2) {
                                                cola2.mostrar();
                                            } else if (numeroCola == 3) {
                                                cola3.mostrar();
                                            } else if (numeroCola == 4) {
                                                cola4.mostrar();
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                int opcion8 = 0;
                                while (opcion8 != 3) {
                                    Scanner scan15 = new Scanner(System.in);
                                    System.out.println("\n\t\tAGREGAR CARRITO (COLAS)");
                                    System.out.println("\n1. Agregar al Final");
                                    System.out.println("2. Agregar al Inicio");
                                    System.out.println("3. Volver.");
                                    System.out.print("\nElija una opción ---> ");
                                    opcion8 = scan15.nextInt();
                                    switch (opcion8) {
                                        case 1:
                                            String apellidoCliente;
                                            String ciCliente;
                                            String sexoCliente;
                                            int edadcliente;
                                            int numeroPila;
                                            Scanner scan16 = new Scanner(System.in);
                                            System.out.println("\n\t\tAGREGAR CARRITO AL FINAL (COLAS)");
                                            System.out.print("\nIngresar el apellido del Cliente: ");
                                            apellidoCliente = scan16.next();
                                            System.out.print("Ingresar el C.I. del Cliente: ");
                                            ciCliente = scan16.next();
                                            System.out.print("Ingresar el sexo del Cliente: ");
                                            sexoCliente = scan16.next();
                                            System.out.print("Ingresar la edad del Cliente: ");
                                            edadcliente = scan16.nextInt();
                                            System.out.print("Ingresar la pila de productos del Clliente: ");
                                            numeroPila = scan16.nextInt();
                                            if (numeroPila == 1) {
                                                agregaCarritoAlFinal(apellidoCliente, ciCliente, sexoCliente, edadcliente, pila1, cola1, cola2, cola3, cola4);
                                            } else if (numeroPila == 2) {
                                                agregaCarritoAlFinal(apellidoCliente, ciCliente, sexoCliente, edadcliente, pila2, cola1, cola2, cola3, cola4);
                                            } else if (numeroPila == 3) {
                                                agregaCarritoAlFinal(apellidoCliente, ciCliente, sexoCliente, edadcliente, pila3, cola1, cola2, cola3, cola4);
                                            } else if (numeroPila == 4) {
                                                agregaCarritoAlFinal(apellidoCliente, ciCliente, sexoCliente, edadcliente, pila4, cola1, cola2, cola3, cola4);
                                            }
                                            break;
                                        case 2:
                                            String apellidoCliente2;
                                            String ciCliente2;
                                            String sexoCliente2;
                                            int edadcliente2;
                                            int numeroPila2;
                                            Scanner scan17 = new Scanner(System.in);
                                            System.out.println("\n\t\tAGREGAR CARRITO AL INICIO (COLAS)");
                                            System.out.print("\nIngresar el apellido del Cliente: ");
                                            apellidoCliente2 = scan17.next();
                                            System.out.print("Ingresar el C.I. del Cliente: ");
                                            ciCliente2 = scan17.next();
                                            System.out.print("Ingresar el sexo del Cliente: ");
                                            sexoCliente2 = scan17.next();
                                            System.out.print("Ingresar la edad del Cliente: ");
                                            edadcliente2 = scan17.nextInt();
                                            System.out.print("Ingresar la pila de productos del Clliente: ");
                                            numeroPila2 = scan17.nextInt();
                                            if (numeroPila2 == 1) {
                                                agregarCarritoAlInicio(apellidoCliente2, ciCliente2, sexoCliente2, edadcliente2, pila1, cola1, cola2, cola3, cola4);
                                            } else if (numeroPila2 == 2) {
                                                agregarCarritoAlInicio(apellidoCliente2, ciCliente2, sexoCliente2, edadcliente2, pila2, cola1, cola2, cola3, cola4);
                                            } else if (numeroPila2 == 3) {
                                                agregarCarritoAlInicio(apellidoCliente2, ciCliente2, sexoCliente2, edadcliente2, pila3, cola1, cola2, cola3, cola4);
                                            } else if (numeroPila2 == 4) {
                                                agregarCarritoAlInicio(apellidoCliente2, ciCliente2, sexoCliente2, edadcliente2, pila4, cola1, cola2, cola3, cola4);
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                int opcion9 = 0;
                                while (opcion9 != 4) {
                                    Scanner scan18 = new Scanner(System.in);
                                    System.out.println("\n\t\tELIMINAR CARRITO (COLAS)");
                                    System.out.println("\n1. Eliminar el Último");
                                    System.out.println("2. Eliminar el Primero");
                                    System.out.println("3. Eliminar por Apellido de Cliente");
                                    System.out.println("4. Volver.");
                                    System.out.print("\nElija una opción ---> ");
                                    opcion9 = scan18.nextInt();
                                    switch (opcion9) {
                                        case 1:
                                            System.out.println("\n\t\tELIMINAR ÚLTIMO CARRITO (COLAS)");
                                            eliminarUltimoCarrito(cola1, cola2, cola3, cola4);
                                            break;
                                        case 2:
                                            System.out.println("\n\t\tELIMINAR PRIMER CARRITO (COLAS)");
                                            eliminarPrimerCarrito(cola1, cola2, cola3, cola4);
                                            break;
                                        case 3:
                                            System.out.println("\n\t\tELIMINAR POR APELLIDO CLIENTE CARRITO (COLAS)");
                                            eliminarPorApellidoCarrito(cola1, cola2, cola3, cola4);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 3:
                    int opcion10 = 0;
                    while (opcion10 != 5) {
                        Scanner scan19 = new Scanner(System.in);
                        System.out.println("\n\t\tESCENARIOS");
                        System.out.println("\n1. Unión de Carritos 1 y 2");
                        System.out.println("2. 10 Bs. Descuento en Productos mayores a 50 Bs.");
                        System.out.println("3. Unión de Cajas 1 y 3");
                        System.out.println("4. Prioridad de Atención en Caja 1");
                        System.out.println("5. Volver.");
                        System.out.print("\nElija una opción ---> ");
                        opcion10 = scan19.nextInt();
                        switch (opcion10) {
                            case 1:
                                unionProductos(pila1, pila2);
                                break;
                            case 2:
                                promocionProductos50Descuento10(pila1, pila2, pila3, pila4);
                                break;
                            case 3:
                                cierreDeDosCajas(cola1, cola2, cola3, cola4);
                                break;
                            case 4:
                                prioridadDeAtencionCaja1(cola1, cola2, cola3, cola4);
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public static void agregaProductoAlFinal(String nombre, int precio, PilaProducto pila1, PilaProducto
            pila2, PilaProducto pila3, PilaProducto pila4) {
        Scanner scan = new Scanner(System.in);
        int numeroPila;
        System.out.print("Ingresar a cual Pila de Productos agregar: ");
        numeroPila = scan.nextInt();
        Producto productoAgregado = new Producto(nombre, precio);
        if (numeroPila == 1) {
            pila1.adicionar(productoAgregado);
        } else if (numeroPila == 2) {
            pila2.adicionar(productoAgregado);
        } else if (numeroPila == 3) {
            pila3.adicionar(productoAgregado);
        } else if (numeroPila == 4) {
            pila4.adicionar(productoAgregado);
        }
    }

    public static void agregaProductoAlInicio(String nombre2, int precio2, PilaProducto pila1, PilaProducto
            pila2, PilaProducto pila3, PilaProducto pila4) {
        Scanner scan = new Scanner(System.in);
        int numeroPila;
        System.out.print("Ingresar a cual Pila de Productos agregar: ");
        numeroPila = scan.nextInt();
        Producto productoAgregado = new Producto(nombre2, precio2);
        PilaProducto aux = new PilaProducto(10);
        Producto valorExtraidoDeLaPila = null;
        if (numeroPila == 1) {
            while (!pila1.esVacia()) {
                valorExtraidoDeLaPila = pila1.eliminar();
                aux.adicionar(valorExtraidoDeLaPila);
            }
            pila1.adicionar(productoAgregado);
            pila1.vaciar(aux);
        } else if (numeroPila == 2) {
            while (!pila2.esVacia()) {
                valorExtraidoDeLaPila = pila2.eliminar();
                aux.adicionar(valorExtraidoDeLaPila);
            }
            pila2.adicionar(productoAgregado);
            pila2.vaciar(aux);
        } else if (numeroPila == 3) {
            while (!pila3.esVacia()) {
                valorExtraidoDeLaPila = pila3.eliminar();
                aux.adicionar(valorExtraidoDeLaPila);
            }
            pila3.adicionar(productoAgregado);
            pila3.vaciar(aux);
        } else if (numeroPila == 4) {
            while (!pila4.esVacia()) {
                valorExtraidoDeLaPila = pila4.eliminar();
                aux.adicionar(valorExtraidoDeLaPila);
            }
            pila4.adicionar(productoAgregado);
            pila4.vaciar(aux);
        }
    }

    public static void agregarAUnaPosicionProducto(String nombre3, int precio3, PilaProducto pila1, PilaProducto
            pila2, PilaProducto pila3, PilaProducto pila4) {
        Scanner scan = new Scanner(System.in);
        int numeroPila;
        int numeroPosicion;
        System.out.print("Ingresar a cual Pila de Productos Agragar: ");
        numeroPila = scan.nextInt();
        System.out.print("Ingresar a cual Posición de la Pila de Productos agregar:");
        numeroPosicion = scan.nextInt();
        Producto productoAgregado = new Producto(nombre3, precio3);
        PilaProducto aux = new PilaProducto(10);
        Producto valorExtraidoDeLaPila = null;
        if (numeroPila == 1) {
            while (!pila1.esVacia()) {
                valorExtraidoDeLaPila = pila1.eliminar();
                if (pila1.nroElem() == numeroPosicion - 1) {
                    aux.adicionar(valorExtraidoDeLaPila);
                    aux.adicionar(productoAgregado);
                } else {
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila1.vaciar(aux);
        } else if (numeroPila == 2) {
            while (!pila2.esVacia()) {
                valorExtraidoDeLaPila = pila2.eliminar();
                if (pila2.nroElem() == numeroPosicion - 1) {
                    aux.adicionar(valorExtraidoDeLaPila);
                    aux.adicionar(productoAgregado);
                } else {
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila2.vaciar(aux);
        } else if (numeroPila == 3) {
            while (!pila3.esVacia()) {
                valorExtraidoDeLaPila = pila3.eliminar();
                if (pila3.nroElem() == numeroPosicion - 1) {
                    aux.adicionar(valorExtraidoDeLaPila);
                    aux.adicionar(productoAgregado);
                } else {
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila3.vaciar(aux);
        } else if (numeroPila == 4) {
            while (!pila4.esVacia()) {
                valorExtraidoDeLaPila = pila4.eliminar();
                if (pila4.nroElem() == numeroPosicion - 1) {
                    aux.adicionar(valorExtraidoDeLaPila);
                    aux.adicionar(productoAgregado);
                } else {
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila4.vaciar(aux);
        }
    }

    public static void eliminarUltimoProducto(PilaProducto pila1, PilaProducto
            pila2, PilaProducto pila3, PilaProducto pila4) {
        Scanner scan = new Scanner(System.in);
        int numeroPila;
        System.out.print("Ingresar a cual Pila de Productos eliminar el Último: ");
        numeroPila = scan.nextInt();
        if (numeroPila == 1) {
            pila1.eliminar();
        } else if (numeroPila == 2) {
            pila2.eliminar();
        } else if (numeroPila == 3) {
            pila3.eliminar();
        } else if (numeroPila == 4) {
            pila4.eliminar();
        }
    }

    public static void eliminarPrimerProducto(PilaProducto pila1, PilaProducto
            pila2, PilaProducto pila3, PilaProducto pila4) {
        Scanner scan = new Scanner(System.in);
        int numeroPila;
        PilaProducto aux = new PilaProducto(10);
        Producto valorExtraidoDeLaPila = null;
        System.out.print("Ingresar a cual Pila de Productos eliminar el Primero: ");
        numeroPila = scan.nextInt();
        if (numeroPila == 1) {
            while (!pila1.esVacia()) {
                if (pila1.nroElem() > 1) {
                    valorExtraidoDeLaPila = pila1.eliminar();
                    aux.adicionar(valorExtraidoDeLaPila);
                } else {
                    pila1.eliminar();
                }
            }
            pila1.vaciar(aux);
        } else if (numeroPila == 2) {
            while (!pila2.esVacia()) {
                if (pila2.nroElem() > 1) {
                    valorExtraidoDeLaPila = pila2.eliminar();
                    aux.adicionar(valorExtraidoDeLaPila);
                } else {
                    pila2.eliminar();
                }
            }
            pila2.vaciar(aux);
        } else if (numeroPila == 3) {
            while (!pila3.esVacia()) {
                if (pila3.nroElem() > 1) {
                    valorExtraidoDeLaPila = pila3.eliminar();
                    aux.adicionar(valorExtraidoDeLaPila);
                } else {
                    pila3.eliminar();
                }
            }
            pila3.vaciar(aux);
        } else if (numeroPila == 4) {
            while (!pila4.esVacia()) {
                if (pila4.nroElem() > 1) {
                    valorExtraidoDeLaPila = pila4.eliminar();
                    aux.adicionar(valorExtraidoDeLaPila);
                } else {
                    pila4.eliminar();
                }
            }
            pila4.vaciar(aux);
        }
    }

    public static void eliminarUnaPosicionProducto(PilaProducto pila1, PilaProducto
            pila2, PilaProducto pila3, PilaProducto pila4) {
        Scanner scan = new Scanner(System.in);
        int numeroPila;
        int numeroPosicion;
        System.out.print("Ingresar a cual Pila de Productos Eliminar: ");
        numeroPila = scan.nextInt();
        System.out.print("Ingresar a cual Posición de la Pila de Productos eliminar:");
        numeroPosicion = scan.nextInt();
        PilaProducto aux = new PilaProducto(10);
        Producto valorExtraidoDeLaPila = null;
        if (numeroPila == 1) {
            while (!pila1.esVacia()) {
                if (pila1.nroElem() == numeroPosicion) {
                    pila1.eliminar();
                } else {
                    valorExtraidoDeLaPila = pila1.eliminar();
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila1.vaciar(aux);
        } else if (numeroPila == 2) {
            while (!pila2.esVacia()) {
                if (pila2.nroElem() == numeroPosicion) {
                    pila2.eliminar();
                } else {
                    valorExtraidoDeLaPila = pila2.eliminar();
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila2.vaciar(aux);
        } else if (numeroPila == 3) {
            while (!pila3.esVacia()) {
                if (pila3.nroElem() == numeroPosicion) {
                    pila3.eliminar();
                } else {
                    valorExtraidoDeLaPila = pila3.eliminar();
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila3.vaciar(aux);
        } else if (numeroPila == 4) {
            while (!pila4.esVacia()) {
                if (pila4.nroElem() == numeroPosicion) {
                    pila4.eliminar();
                } else {
                    valorExtraidoDeLaPila = pila4.eliminar();
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila4.vaciar(aux);
        }
    }

    public static void eliminarPorNombreProducto(PilaProducto pila1, PilaProducto
            pila2, PilaProducto pila3, PilaProducto pila4) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        System.out.print("Ingresar a cual Pila de Productos Eliminar: ");
        int numeroPila = scan.nextInt();
        System.out.print("Ingresar el nombre del Producto: ");
        String nombre = scan.next();
        PilaProducto aux = new PilaProducto(10);
        Producto valorExtraidoDeLaPila = null;
        if (numeroPila == 1) {
            while (!pila1.esVacia()) {
                valorExtraidoDeLaPila = pila1.eliminar();
                if (!valorExtraidoDeLaPila.getNombre().equals(nombre)) {
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila1.vaciar(aux);
        } else if (numeroPila == 2) {
            while (!pila2.esVacia()) {
                valorExtraidoDeLaPila = pila2.eliminar();
                if (!valorExtraidoDeLaPila.getNombre().equals(nombre)) {
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila2.vaciar(aux);
        } else if (numeroPila == 3) {
            while (!pila3.esVacia()) {
                valorExtraidoDeLaPila = pila3.eliminar();
                if (!valorExtraidoDeLaPila.getNombre().equals(nombre)) {
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila3.vaciar(aux);
        } else if (numeroPila == 4) {
            while (!pila4.esVacia()) {
                valorExtraidoDeLaPila = pila4.eliminar();
                if (!valorExtraidoDeLaPila.getNombre().equals(nombre)) {
                    aux.adicionar(valorExtraidoDeLaPila);
                }
            }
            pila4.vaciar(aux);
        }
    }

    public static void agregaCarritoAlFinal(String apellidoCliente, String ciCliente, String sexoCliente, int edadcliente, PilaProducto pila, ColaCarrito cola1, ColaCarrito cola2, ColaCarrito cola3, ColaCarrito cola4) {
        Scanner scan = new Scanner(System.in);
        int numeroCola;
        System.out.print("Ingresar a cual Cola de Carritos agregar: ");
        numeroCola = scan.nextInt();
        Carrito carritoAgregado = new Carrito(apellidoCliente, ciCliente, sexoCliente, edadcliente, pila);
        if (numeroCola == 1) {
            cola1.adicionar(carritoAgregado);
        } else if (numeroCola == 2) {
            cola2.adicionar(carritoAgregado);
        } else if (numeroCola == 3) {
            cola3.adicionar(carritoAgregado);
        } else if (numeroCola == 4) {
            cola4.adicionar(carritoAgregado);
        }
    }

    public static void agregarCarritoAlInicio(String apellidoCliente, String ciCliente, String sexoCliente, int edadcliente, PilaProducto pila, ColaCarrito cola1, ColaCarrito cola2, ColaCarrito cola3, ColaCarrito cola4) {
        Scanner scan = new Scanner(System.in);
        int numeroCola;
        System.out.print("Ingresar a cual Cola de Carritos agregar: ");
        numeroCola = scan.nextInt();
        Carrito carritoAgregado = new Carrito(apellidoCliente, ciCliente, sexoCliente, edadcliente, pila);
        ColaCarrito aux = new ColaCarrito(10);
        Carrito valorExtraidoDeLaCola = null;
        if (numeroCola == 1) {
            while (!cola1.esVacia()) {
                valorExtraidoDeLaCola = cola1.eliminar();
                aux.adicionar(valorExtraidoDeLaCola);
            }
            cola1.adicionar(carritoAgregado);
            cola1.vaciar(aux);
        } else if (numeroCola == 2) {
            while (!cola2.esVacia()) {
                valorExtraidoDeLaCola = cola2.eliminar();
                aux.adicionar(valorExtraidoDeLaCola);
            }
            cola2.adicionar(carritoAgregado);
            cola2.vaciar(aux);
        } else if (numeroCola == 3) {
            while (!cola3.esVacia()) {
                valorExtraidoDeLaCola = cola3.eliminar();
                aux.adicionar(valorExtraidoDeLaCola);
            }
            cola3.adicionar(carritoAgregado);
            cola3.vaciar(aux);
        } else if (numeroCola == 4) {
            while (!cola4.esVacia()) {
                valorExtraidoDeLaCola = cola4.eliminar();
                aux.adicionar(valorExtraidoDeLaCola);
            }
            cola4.adicionar(carritoAgregado);
            cola4.vaciar(aux);
        }
    }

    public static void eliminarUltimoCarrito(ColaCarrito cola1, ColaCarrito cola2, ColaCarrito cola3, ColaCarrito cola4) {
        Scanner scan = new Scanner(System.in);
        int numeroCola;
        ColaCarrito aux = new ColaCarrito(10);
        Carrito valorExtraidoDeLaCola = null;
        System.out.print("Ingresar a cual Cola de Carritos eliminar el Primero: ");
        numeroCola = scan.nextInt();
        if (numeroCola == 1) {
            while (!cola1.esVacia()) {
                if (cola1.nroElem() > 1) {
                    valorExtraidoDeLaCola = cola1.eliminar();
                    aux.adicionar(valorExtraidoDeLaCola);
                } else {
                    cola1.eliminar();
                }
            }
            cola1.vaciar(aux);
        } else if (numeroCola == 2) {
            while (!cola2.esVacia()) {
                if (cola2.nroElem() > 1) {
                    valorExtraidoDeLaCola = cola2.eliminar();
                    aux.adicionar(valorExtraidoDeLaCola);
                } else {
                    cola2.eliminar();
                }
            }
            cola2.vaciar(aux);
        } else if (numeroCola == 3) {
            while (!cola3.esVacia()) {
                if (cola3.nroElem() > 1) {
                    valorExtraidoDeLaCola = cola3.eliminar();
                    aux.adicionar(valorExtraidoDeLaCola);
                } else {
                    cola3.eliminar();
                }
            }
            cola3.vaciar(aux);
        } else if (numeroCola == 4) {
            while (!cola4.esVacia()) {
                if (cola4.nroElem() > 1) {
                    valorExtraidoDeLaCola = cola4.eliminar();
                    aux.adicionar(valorExtraidoDeLaCola);
                } else {
                    cola4.eliminar();
                }
            }
            cola4.vaciar(aux);
        }
    }

    public static void eliminarPrimerCarrito(ColaCarrito cola1, ColaCarrito cola2, ColaCarrito cola3, ColaCarrito cola4) {
        Scanner scan = new Scanner(System.in);
        int numeroCola;
        System.out.print("Ingresar a cual Cola de Carritos eliminar el Último: ");
        numeroCola = scan.nextInt();
        if (numeroCola == 1) {
            cola1.eliminar();
        } else if (numeroCola == 2) {
            cola2.eliminar();
        } else if (numeroCola == 3) {
            cola3.eliminar();
        } else if (numeroCola == 4) {
            cola4.eliminar();
        }
    }

    public static void eliminarPorApellidoCarrito(ColaCarrito cola1, ColaCarrito cola2, ColaCarrito cola3, ColaCarrito cola4) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresar a cual Cola de Carritos Eliminar: ");
        int numerocola = scan.nextInt();
        System.out.print("Ingresar el apellido del Cliente: ");
        String apellido = scan.next();
        ColaCarrito aux = new ColaCarrito(10);
        Carrito valorExtraidoDeLaCola = null;
        if (numerocola == 1) {
            while (!cola1.esVacia()) {
                valorExtraidoDeLaCola = cola1.eliminar();
                if (!valorExtraidoDeLaCola.getApellidoCliente().equals(apellido)) {
                    aux.adicionar(valorExtraidoDeLaCola);
                }
            }
            cola1.vaciar(aux);
        } else if (numerocola == 2) {
            while (!cola2.esVacia()) {
                valorExtraidoDeLaCola = cola2.eliminar();
                if (!valorExtraidoDeLaCola.getApellidoCliente().equals(apellido)) {
                    aux.adicionar(valorExtraidoDeLaCola);
                }
            }
            cola2.vaciar(aux);
        } else if (numerocola == 3) {
            while (!cola3.esVacia()) {
                valorExtraidoDeLaCola = cola3.eliminar();
                if (!valorExtraidoDeLaCola.getApellidoCliente().equals(apellido)) {
                    aux.adicionar(valorExtraidoDeLaCola);
                }
            }
            cola3.vaciar(aux);
        } else if (numerocola == 4) {
            while (!cola4.esVacia()) {
                valorExtraidoDeLaCola = cola4.eliminar();
                if (!valorExtraidoDeLaCola.getApellidoCliente().equals(apellido)) {
                    aux.adicionar(valorExtraidoDeLaCola);
                }
            }
            cola4.vaciar(aux);
        }
    }

    public static void unionProductos(PilaProducto pila1, PilaProducto pila2) {
        PilaProducto aux = new PilaProducto(10);
        Producto valorExtraidoDeLaPila = null;
        while (!pila1.esVacia()) {
            valorExtraidoDeLaPila = pila1.eliminar();
            aux.adicionar(valorExtraidoDeLaPila);
        }
        pila2.vaciar(aux);
    }

    public static void promocionProductos50Descuento10(PilaProducto pila1, PilaProducto pila2, PilaProducto pila3, PilaProducto pila4) {
        PilaProducto aux = new PilaProducto(10);
        Producto valorExtraidoDeLaPila = null;
        while (!pila1.esVacia()) {
            valorExtraidoDeLaPila = pila1.eliminar();
            if (valorExtraidoDeLaPila.getPrecio() > 50) {
                valorExtraidoDeLaPila.setPrecio(valorExtraidoDeLaPila.getPrecio() - 10);
                aux.adicionar(valorExtraidoDeLaPila);
            } else {
                aux.adicionar(valorExtraidoDeLaPila);
            }
        }
        pila1.vaciar(aux);
        while (!pila2.esVacia()) {
            valorExtraidoDeLaPila = pila2.eliminar();
            if (valorExtraidoDeLaPila.getPrecio() > 50) {
                valorExtraidoDeLaPila.setPrecio(valorExtraidoDeLaPila.getPrecio() - 10);
                aux.adicionar(valorExtraidoDeLaPila);
            } else {
                aux.adicionar(valorExtraidoDeLaPila);
            }
        }
        pila2.vaciar(aux);
        while (!pila3.esVacia()) {
            valorExtraidoDeLaPila = pila3.eliminar();
            if (valorExtraidoDeLaPila.getPrecio() > 50) {
                valorExtraidoDeLaPila.setPrecio(valorExtraidoDeLaPila.getPrecio() - 10);
                aux.adicionar(valorExtraidoDeLaPila);
            } else {
                aux.adicionar(valorExtraidoDeLaPila);
            }
        }
        pila3.vaciar(aux);
        while (!pila4.esVacia()) {
            valorExtraidoDeLaPila = pila4.eliminar();
            if (valorExtraidoDeLaPila.getPrecio() > 50) {
                valorExtraidoDeLaPila.setPrecio(valorExtraidoDeLaPila.getPrecio() - 10);
                aux.adicionar(valorExtraidoDeLaPila);
            } else {
                aux.adicionar(valorExtraidoDeLaPila);
            }
        }
        pila4.vaciar(aux);
    }

    public static void cierreDeDosCajas(ColaCarrito cola1, ColaCarrito cola2, ColaCarrito cola3, ColaCarrito cola4) {

        Carrito valorExtraidoDeLaCola = null;

        while (!cola1.esVacia()) {
            valorExtraidoDeLaCola = cola1.eliminar();
            cola2.adicionar(valorExtraidoDeLaCola);
        }
        while (!cola3.esVacia()) {
            valorExtraidoDeLaCola = cola3.eliminar();
            cola4.adicionar(valorExtraidoDeLaCola);
        }
    }

    public static void prioridadDeAtencionCaja1(ColaCarrito cola1, ColaCarrito cola2, ColaCarrito cola3, ColaCarrito cola4) {

        Carrito valorExtraidoDeLaCola = null;
        ColaCarrito aux = new ColaCarrito(10);
        ColaCarrito aux2 = new ColaCarrito(10);
        ColaCarrito aux3 = new ColaCarrito(10);

        while (!cola1.esVacia()) {
            valorExtraidoDeLaCola = cola1.eliminar();
            if (valorExtraidoDeLaCola.getEdadCliente() > 60) {
                aux.adicionar(valorExtraidoDeLaCola);
            } else {
                aux2.adicionar(valorExtraidoDeLaCola);
            }
        }
        cola1.vaciar(aux);
        while (!cola2.esVacia()) {
            valorExtraidoDeLaCola = cola2.eliminar();
            if (valorExtraidoDeLaCola.getEdadCliente() > 60) {
                aux.adicionar(valorExtraidoDeLaCola);
            } else {
                aux3.adicionar(valorExtraidoDeLaCola);
            }
        }
        cola1.vaciar(aux);
        cola2.vaciar(aux3);
        while (!cola3.esVacia()) {
            valorExtraidoDeLaCola = cola3.eliminar();
            if (valorExtraidoDeLaCola.getEdadCliente() > 60) {
                aux.adicionar(valorExtraidoDeLaCola);
            } else {
                aux3.adicionar(valorExtraidoDeLaCola);
            }
        }
        cola1.vaciar(aux);
        cola3.vaciar(aux3);
        while (!cola4.esVacia()) {
            valorExtraidoDeLaCola = cola4.eliminar();
            if (valorExtraidoDeLaCola.getEdadCliente() > 60) {
                aux.adicionar(valorExtraidoDeLaCola);
            } else {
                aux3.adicionar(valorExtraidoDeLaCola);
            }
        }
        cola1.vaciar(aux);
        cola4.vaciar(aux3);
        cola1.vaciar(aux2);
    }
}