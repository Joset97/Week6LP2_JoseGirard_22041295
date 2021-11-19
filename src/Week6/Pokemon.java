
package Week6;

/**
 *
 * @author jrgir
 */
public class Pokemon {
    
    protected String nombre;
    protected int damage;
    protected int vida;
    protected int velocidad;

    
    public Pokemon() {
    }
    
    public Pokemon(String nombre, int damage, int vida, int velocidad) {
        this.nombre = nombre;
        this.damage = damage;
        this.vida = vida;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
    
    
}
