/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personasingleton;

import builder.PersonaBuild;
import builder.PersonaBuilder;
import personasingleton.entity.Persona;

/**
 *
 * @author Manuel
 */
public class PersonaSingleton {
    
    public static void main(String[] args) {
        
        //PersonaSingleton
        Persona persona1 = Persona.getInstance("Manuel");
        Persona persona2 = Persona.getInstance("Paco");
        
        
        //PersonaBuilder
        PersonaBuild persona3 = new PersonaBuilder().nombre("Manuel").apellido("Cepero").build();
    }
    
}
