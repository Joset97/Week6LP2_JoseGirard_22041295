package Week6;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
    private Pokedex Pkdex1 = new Pokedex(), Pkdex2 = new Pokedex(), Pkdex3 = new Pokedex();

    public Usuarios() {

    }

    public Usuarios(String nombre, String apellido, String usename, String password, Date fechaNacimiento, Color Colore) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usename = usename;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
        setEdad(fechaNacimiento);
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

    public void setEdad(Date FechaNacimiento) {

       int year= FechaNacimiento.getYear();
       int yearact= new Date().getYear();
        int Edad =yearact-year;

        this.edad = Edad;
    }

    public Color getColore() {
        return Colore;
    }

    public void setColore(Color Colore) {
        this.Colore = Colore;
    }

    public Pokedex getPkdex1() {
        return Pkdex1;
    }

    public void setPkdex1(Pokedex Pkdex1) {
        this.Pkdex1 = Pkdex1;
    }

    public Pokedex getPkdex2() {
        return Pkdex2;
    }

    public void setPkdex2(Pokedex Pkdex2) {
        this.Pkdex2 = Pkdex2;
    }

    public Pokedex getPkdex3() {
        return Pkdex3;
    }

    public void setPkdex3(Pokedex Pkdex3) {
        this.Pkdex3 = Pkdex3;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "\nnombre=" + nombre + ", \napellido=" + apellido + ", \nusename=" + usename + ", \npassword=" + password + ",\nfechaNacimiento=" + fechaNacimiento + ",\n edad=" + edad + ", \nColore=" + Colore + '}';
    }

}
