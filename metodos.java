import java.util.Scanner;

public class metodos {
    Scanner sc = new Scanner(System.in);

    public productosBelleza[][] registrar() {
        System.out.println("Ingrese la dimension de la matriz:");
        int n = sc.nextInt();
        productosBelleza[][] p = new productosBelleza[n][n];
        sc.nextLine();
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                System.out.println("Ingrese le nombre del producto: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese la marca del producto: ");
                String marca = sc.nextLine();
                System.out.println("Ingrese el precio del producto: ");
                double precio = sc.nextDouble();
                System.out.println("Ingrese la descripcion del producto: ");
                String descripcion = sc.nextLine();
                productosBelleza producto = new productosBelleza(nombre, marca, precio, descripcion);
                p[i][j] = producto;
            }

        }

        return p;

    }

}
