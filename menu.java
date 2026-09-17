import java.util.Scanner;
import java.util.Stack;

public class menu {
    public static void main(String[] args) {
        metodos m = new metodos();
        Scanner sc = new Scanner(System.in);
        Stack<productosBelleza> pila = new Stack<>();
        productosBelleza[][] p = null;
        productosBelleza[] producto = null;
        boolean salir = true;
        while (salir) {
            System.out.println("1. Registrar productos");
            System.out.println("2. Validar precio arreglo y lista");
            System.out.println("3. mostrar productos validados");
            System.out.print("Ingrese una opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    p = m.registrar(p);
                    break;
                case 2:
                    pila = m.validarPrecioLista(p);
                    producto = m.validarPrecioArreglo(p);
                    break;
                case 3:
                    m.mostrar(producto, pila);
                    break;
                case 4:
                    salir = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }
        sc.close();
    }
}
