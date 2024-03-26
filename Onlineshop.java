/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlineshop;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ET36
 */
public class Onlineshop {
    
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Producto> productos = new ArrayList<Producto>(); // Create an ArrayList object
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int i = 1;
        while(i != 0){
            System.out.println("Elija opcion 1 cargar producto 2 mostrar productos 3 ingresar stock 4 retirar stock");
            i = scanner.nextInt();
            scanner.nextLine();
            switch(i) {
                case 1:
                    cargarProducto();
                    break;
                case 2:
                    mostrarProductos();
                  break;
                case 3:
                    ingresarStock();
                  break;
                case 4:
                    retirarStock();
                  break;
             }
        }
    }
    public static void cargarProducto(){
        int i;
        System.out.println("que tipo de producto quiere carga: 1 Bebida 2 Comida 3 Limpieza");
        i = scanner.nextInt();
        scanner.nextLine();
        switch(i) {
            case 1:
                cargarBebida();
                break;
            case 2:
                cargarComida();
              break;
            case 3:
                cargarLimpieza();
              break;
        }
    }
    public static void cargarBebida(){
        Boolean alcohol;
        System.out.println("Cual es el nombre del producto");
        String n = scanner.nextLine();
        System.out.println("Tiene alcohol 1 Si 2 No");
        int a = scanner.nextInt();
        scanner.nextLine();
        if (a == 1){
            alcohol = true; 
        }
        else{
            alcohol = false;                    
        }
        System.out.println("Cuantas calorias tiene");
        int cal = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cuales son sus ingredientes");
        String in = scanner.nextLine();
        System.out.println("Cual es el precio por unidad");
        double p = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cuando vence");
        String v = scanner.next();
        scanner.nextLine();
        productos.add(new Consumible(n, 0, p, cal,in, v, true, alcohol));
    }
    public static void cargarComida(){
        System.out.println("Cual es el nombre del producto");
        String n = scanner.nextLine();
        System.out.println("Cuantas calorias tiene");
        int cal = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cuales son sus ingredientes");
        String in = scanner.nextLine();
        System.out.println("Cual es el precio por unidad");
        double p = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cuando vence");
        String v = scanner.next();
        scanner.nextLine();
        productos.add(new Consumible(n, 0, p, cal,in, v, false, false));
    }
    
    public static void cargarLimpieza(){
        Boolean per;
        System.out.println("Cual es el nombre del producto");
        String n = scanner.nextLine();
        System.out.println("Es perfumado 1 Si 2 No");
        int a = scanner.nextInt();
        scanner.nextLine();
        if (a == 1){
            per = true; 
        }
        else{
            per = false;                    
        }
        System.out.println("Ingrese advertencia e instrucciones de uso");
        String ad = scanner.nextLine();
        System.out.println("Cual es el precio por unidad");
        double p = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tipo de limpieza (Corporal, piso, vidrio, madera, etc)");
        String v = scanner.next();
        scanner.nextLine();
        productos.add(new Limpieza(n, 0, p, per, ad, v));
    }
    public static void mostrarProductos(){
        for (Producto i : productos) {
            System.out.println(i.toString());
            System.out.println("");
        }
    }
    public static void ingresarStock(){
        int num = 1;
        System.out.println("elija producto para ingresar stock");
        for (Producto i : productos) {
            System.out.println(num);
            System.out.println(i.toString());
            System.out.println("");
            num ++;
        }
        int opc = scanner.nextInt()- 1;
        scanner.nextLine();
        System.out.println("cuantas unidades quiere ingresar");
        int cant = scanner.nextInt();
        scanner.nextLine();
        productos.get(opc).addCant(cant);
    }
    public static void retirarStock(){
        int num = 1;
        System.out.println("elija producto para retirar stock");
        for (Producto i : productos) {
            System.out.println(num);
            System.out.println(i.toString());
            System.out.println("");
            num ++;
        }
        int opc = scanner.nextInt()- 1;
        scanner.nextLine();
        System.out.println("cuantas unidades quiere retirar");
        int cant = scanner.nextInt();
        scanner.nextLine();
        productos.get(opc).desCant(cant);
    }
}
