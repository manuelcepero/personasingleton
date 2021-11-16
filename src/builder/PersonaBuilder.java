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
public class PersonaBuilder {
    
    private String nombre;
    private String apellidos;
    
    public PersonaBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    public PersonaBuilder apellido(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }
    
    public PersonaBuild build() {
        return new PersonaBuild(this);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    
    
}
