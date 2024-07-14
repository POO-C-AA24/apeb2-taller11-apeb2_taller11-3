/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2_menu;
public class MenuNinios extends Menu {
    private double valorHelado;
    private double valorPastel;

    public MenuNinios(String nombrePlato, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato, valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    @Override
    public void calcularValor() {
        valorMenu = valorInicial + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Valor Helado: %.2f\nValor Pastel: %.2f\n", valorHelado, valorPastel);
    }
}
