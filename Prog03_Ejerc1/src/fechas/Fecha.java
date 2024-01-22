/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas;

/**
 *
 * @author Joseme
 */
public class Fecha {
    public enum enumMes {
        Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre
    }

    private int dia;
    private enumMes mes;
    private int anio;

    public Fecha(enumMes mes) {
        this.mes = mes;
        this.dia = 0;
        this.anio = 0;
    }

    public Fecha(int dia, enumMes mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public enumMes getMes() {
        return mes;
    }

    public void setMes(enumMes mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isSummer() {
        return mes == enumMes.Junio || mes == enumMes.Julio || mes == enumMes.Agosto;
    }

    public String toString() {
        return dia + " de " + mes + " de " + anio;
    }
}
