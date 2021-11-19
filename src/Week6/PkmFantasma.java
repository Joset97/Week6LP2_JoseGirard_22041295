/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

/**
 *
 * @author jrgir
 */
public class PkmFantasma extends Pokemon {
    
    private String tipo;

    public PkmFantasma(String nombre, int damage, int vida, int velocidad) {
        super(nombre, damage, vida, velocidad);
        this.tipo ="Fantasma";
    }
    
    
}
