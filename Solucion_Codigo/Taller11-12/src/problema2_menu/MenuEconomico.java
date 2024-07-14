/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2_menu;
public class MenuEconomico extends Menu {
    //casi le pongo menu de pobres XD
    private double descuento;

    public MenuEconomico(String nombrePlato, double valorInicial, double descuento) {
        super(nombrePlato, valorInicial);
        this.descuento = descuento;
    }

    @Override
    public void calcularValor() {
        valorMenu = valorInicial - (valorInicial * descuento / 100);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Descuento: %.2f%%\n", descuento);
    }
}
