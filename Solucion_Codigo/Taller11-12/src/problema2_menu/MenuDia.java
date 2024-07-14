/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2_menu;
public class MenuDia extends Menu {
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }

    @Override
    public void calcularValor() {
        valorMenu = valorInicial + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Valor Postre: %.2f\nValor Bebida: %.2f\n", valorPostre, valorBebida);
    }
}
