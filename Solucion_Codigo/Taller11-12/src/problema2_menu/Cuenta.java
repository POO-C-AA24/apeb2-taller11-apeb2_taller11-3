/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2_menu;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private String nombreCliente;
    private List<Menu> menus;
    private double subtotal;
    private double iva;
    private double valorTotal;

    public Cuenta(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.menus = new ArrayList<>();
    }

    public void agregarMenu(Menu menu) {
        menu.calcularValor();
        menus.add(menu);
    }

    public void calcularSubtotal() {
        subtotal = 0;
        for (Menu menu : menus) {
            subtotal += menu.valorMenu;
        }
    }

    public void calcularIva() {
        iva = subtotal * 0.12;
    }

    public void calcularTotal() {
        valorTotal = subtotal + iva;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(nombreCliente).append("\n");
        for (Menu menu : menus) {
            sb.append(menu.toString()).append("\n");
        }
        sb.append(String.format("Subtotal: %.2f\nIVA: %.2f\nTotal a Pagar: %.2f\n", subtotal, iva, valorTotal));
        return sb.toString();
    }
}

