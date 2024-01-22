/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas;

/**
 *
 * @author Joseme
 */
public class Principal {
    public static void main(String[] args) {
        // Primera fecha, inicializada con el primer constructor
        Fecha objFecha1 = new Fecha(Fecha.enumMes.Febrero);
        objFecha1.setDia(20);
        objFecha1.setAnio(2000);

        System.out.println("Primera fecha, inicializada con el primer constructor");
        System.out.println("La fecha es: " + objFecha1.toString());
        System.out.println(objFecha1.isSummer() ? "Es verano" : "No es verano");
        System.out.println();

        // Segunda fecha, inicializada con el segundo constructor
        Fecha objFecha2 = new Fecha(15, Fecha.enumMes.Julio, 2015);

        System.out.println("Segunda fecha, inicializada con el segundo constructor");
        System.out.println("La fecha 2 contiene el año " + objFecha2.getAnio());
        System.out.println("La fecha es: " + objFecha2.toString());
        System.out.println(objFecha2.isSummer() ? "Es verano" : "No es verano");
    }
}
