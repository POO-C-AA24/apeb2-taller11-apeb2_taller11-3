
package problema2_menu;
public abstract class Menu {
    protected String nombrePlato;
    protected double valorInicial;
    protected double valorMenu;

    public Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }

    public abstract void calcularValor();

    @Override
    public String toString() {
        return String.format("Plato: %s\nValor Inicial: %.2f\nValor Menú: %.2f\n",
                              nombrePlato, valorInicial, valorMenu);
    }
}
