import java.util.Scanner;
import java.util.Stack;

public class metodos {
    Scanner sc = new Scanner(System.in);

    public productosBelleza[][] registrar(productosBelleza[][] p) {
        System.out.println("Ingrese la dimension de la matriz:");
        int n = sc.nextInt();
        p = new productosBelleza[n][n];
        sc.nextLine();
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                System.out.println("Ingrese le nombre del producto: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese la marca del producto: ");
                String marca = sc.nextLine();
                System.out.println("Ingrese el precio del producto: ");
                double precio = sc.nextDouble();
                sc.nextLine(); // Limpiar el buffer del scanner
                System.out.println("Ingrese la descripcion del producto: ");
                String descripcion = sc.nextLine();
                productosBelleza producto = new productosBelleza(nombre, marca, precio, descripcion);
                p[i][j] = producto;
            }

        }

        return p;

    }

    public Stack<productosBelleza> validarPrecioLista(productosBelleza[][] p) {
        Stack<productosBelleza> pila = new Stack<>();
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[i][j].getPrecio() <= 200000) {
                    pila.push(p[i][j]);
                }
            }

        }
        return pila;
    }

    public productosBelleza[] validarPrecioArreglo(productosBelleza[][] p) {
        int cont = 0;

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[i][j].getPrecio() > 200000) {

                    cont++;
                }
            }
        }
        productosBelleza[] producto = new productosBelleza[cont];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (p[i][j].getPrecio() > 200000) {
                    int k = 0;
                    producto[k] = p[i][j];
                    k++;
                }
            }
        }
        return producto;
    }

    public void mostrar(productosBelleza[] producto, Stack<productosBelleza> pila) {
        System.out.println("Productos con precio mayor a 200000: ");
        for (int i = 0; i < producto.length; i++) {
            System.out.println(producto[i].getNombre() + " - " + producto[i].getMarca() + " - "
                    + producto[i].getPrecio() + " - " + producto[i].getDescripcion());
        }
        System.out.println("Productos con precio menor o igual a 200000: ");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop().getNombre() + " - " + pila.pop().getMarca() + " - " + pila.pop().getPrecio()
                    + " - " + pila.pop().getDescripcion());
        }
    }

}
