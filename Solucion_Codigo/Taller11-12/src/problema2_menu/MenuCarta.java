/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2_menu;
public class MenuCarta extends Menu {
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuCarta(String nombrePlato, double valorInicial, double valorGuarnicion, double valorBebida, double porcentajeServicio) {
        super(nombrePlato, valorInicial);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;
    }

    @Override
    public void calcularValor() {
        valorMenu = valorInicial + valorGuarnicion + valorBebida + (valorInicial * porcentajeServicio / 100);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Valor Guarnición: %.2f\nValor Bebida: %.2f\nPorcentaje Servicio: %.2f\n", valorGuarnicion, valorBebida, porcentajeServicio);
    }
}
