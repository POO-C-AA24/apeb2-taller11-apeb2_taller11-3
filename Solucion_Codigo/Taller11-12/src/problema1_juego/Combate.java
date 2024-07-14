package juego;
public class Combate {
    private Personaje personaje1;
    private Personaje personaje2;

    public Combate(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
    }

    public void iniciarCombate() {
        System.out.println("¡Comienza el combate entre " + personaje1.nombre + " y " + personaje2.nombre + "!");
        while (personaje1.estaVivo() && personaje2.estaVivo()) {
            personaje1.atacar(personaje2);
            if (personaje2.estaVivo()) {
                personaje2.atacar(personaje1);
            }
        }

        if (personaje1.estaVivo()) {
            System.out.println(personaje1.nombre + " ha ganado la batalla");
            personaje1.ganarExperiencia(10);
        } else {
            System.out.println(personaje2.nombre + " ha ganado la batalla");
            personaje2.ganarExperiencia(10);
        }
    }
}
