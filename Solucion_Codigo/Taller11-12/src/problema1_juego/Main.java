package juego;
public class Main {
    public static void main(String[] args) {
        Personaje guerrero = new Guerrero("Arthur", 100, 1, 0);
        Personaje mago = new Mago("Merlin", 80, 1, 0);
        Personaje arquero = new Arquero("Legolas", 90, 1, 0);


        Combate combate1 = new Combate(guerrero, mago);
        combate1.iniciarCombate();

        Combate combate2 = new Combate(mago, arquero);
        combate2.iniciarCombate();

        Combate combate3 = new Combate(arquero, guerrero);
        combate3.iniciarCombate();

    }
}
