/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;
public class Mago extends Personaje {
    public Mago(String nombre, int puntosVida, int nivel, int experiencia) {
        super(nombre, puntosVida, nivel, experiencia);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " lanza un hechizo a " + enemigo.nombre);
        enemigo.puntosVida -= 12;
    }

    @Override
    public void defender() {
        System.out.println(nombre + " usa un hechizo de protección");
        puntosVida += 4;
    }
}