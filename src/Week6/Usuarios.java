
package Week6;

import java.awt.Color;
import java.util.Date;


/**
 *
 * @author jrgir
 */
public class Usuarios {
    
private String nombre, apellido, usename, password;
private Date fechaNacimiento;
private int edad;
private Color Colore;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String usename, String password, Date fechaNacimiento, int edad, Color Colore) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usename = usename;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.Colore = Colore;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColore() {
        return Colore;
    }

    public void setColore(Color Colore) {
        this.Colore = Colore;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "\nnombre=" + nombre + ", \napellido=" + apellido + ", \nusename=" + usename + ", \npassword=" + password + ",\nfechaNacimiento=" + fechaNacimiento + ",\n edad=" + edad + ", \nColore=" + Colore + '}';
    }



}
