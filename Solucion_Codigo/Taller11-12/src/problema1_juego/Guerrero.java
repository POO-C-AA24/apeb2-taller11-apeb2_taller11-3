package juego;
public class Guerrero extends Personaje {
    public Guerrero(String nombre, int puntosVida, int nivel, int experiencia) {
        super(nombre, puntosVida, nivel, experiencia);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca con una espada a " + enemigo.nombre);
        enemigo.puntosVida -= 10;
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se defiende con un escudo");
        puntosVida += 5;
    }
}