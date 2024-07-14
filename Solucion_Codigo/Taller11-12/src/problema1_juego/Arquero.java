/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;
public class Arquero extends Personaje {
    public Arquero(String nombre, int puntosVida, int nivel, int experiencia) {
        super(nombre, puntosVida, nivel, experiencia);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " dispara una flecha a " + enemigo.nombre);
        enemigo.puntosVida -= 8;
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se oculta y recupera fuerzas");
        puntosVida += 6;
    }
}