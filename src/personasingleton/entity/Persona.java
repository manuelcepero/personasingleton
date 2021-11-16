/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personasingleton.entity;

/**
 *
 * @author Manuel
 */
public class Persona {

    private String nombre;
    private static Persona persona;

    private Persona(String nombre) {
        this.nombre=nombre;
    }

    public static Persona getInstance(String nombreRecibido) {
        if (persona == null) {
            persona = new Persona(nombreRecibido);
        }else{
            System.out.println("La clase Persona ya está instanciada.");
        }

        return persona;
    }

}
