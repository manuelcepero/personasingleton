/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;


/**
 *
 * @author Manuel
 */
public class PersonaBuild {
    
    private String nombre;
    private String apellidos;

    public PersonaBuild(PersonaBuilder builder) {
        this.nombre = builder.getNombre();
        this.apellidos = builder.getApellidos();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
