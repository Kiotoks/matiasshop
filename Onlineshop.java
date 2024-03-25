/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlineshop;

/**
 *
 * @author ET36
 */
public class Onlineshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Producto sexo = new Consumible("Nombre", 1, 1,"modelo", 1,"ingredientes", "gay");
        System.out.println(sexo.toString());
    }
}
