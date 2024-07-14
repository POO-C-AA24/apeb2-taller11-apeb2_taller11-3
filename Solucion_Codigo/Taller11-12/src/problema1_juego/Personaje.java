package juego;
public abstract class Personaje {
    protected String nombre;
    protected int puntosVida;
    protected int nivel;
    protected int experiencia;

    public Personaje(String nombre, int puntosVida, int nivel, int experiencia) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    public abstract void atacar(Personaje enemigo);

    public abstract void defender();

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public void ganarExperiencia(int puntos) {
        experiencia += puntos;
        if (experiencia >= nivel * 10) {
            subirNivel();
        }
    }

    protected void subirNivel() {
        nivel++;
        puntosVida += 10;
        System.out.println(nombre + " ha subido al nivel " + nivel);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Vida: " + puntosVida + ", Nivel: " + nivel + ", Experiencia: " + experiencia;
    }
}
