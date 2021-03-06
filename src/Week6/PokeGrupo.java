/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jrgir
 */
public class PokeGrupo {

    private String nombre;
    private ArrayList<Usuarios> Miembros;
    private Date FechaDecracion;
    private Usuarios Lider = new Usuarios();
    private String Tipo;

    public PokeGrupo() {
    }

    public PokeGrupo(String nombre, Usuarios Lider) {
        this.nombre = nombre;
        this.Miembros = new ArrayList();
        this.FechaDecracion = new Date();
        this.Lider = Lider;
        this.Tipo =SetTipo();
        
        Miembros.add(Lider);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuarios> getMiembros() {
        return Miembros;
    }

    public void setMiembros(ArrayList<Usuarios> Miembros) {
        this.Miembros = Miembros;
    }

    public Date getFechaDecracion() {
        return FechaDecracion;
    }

    public void setFechaDecracion(Date FechaDecracion) {
        this.FechaDecracion = FechaDecracion;
    }

    public Usuarios getLider() {
        return Lider;
    }

    public void setLider(Usuarios Lider) {
        this.Lider = Lider;
    }

    public String getTipo() {
        return Tipo;
    }

    public void agregarUsuario(Usuarios user) {

        String nombre = user.getNombre();

        if ((validarUsername(nombre)) == false) {
            Miembros.add(user);

        }
    }

    public String SetTipo() {

        if (Miembros.size() <= 3) {
            return "Novato";
        }

        if (Miembros.size() >= 4 && Miembros.size() <= 7) {

            return "Verterano";
        } else {

            return "Legendario";
        }
    }

    public boolean validarUsername(String username) {

        for (Usuarios Miembro : Miembros) {

            if (Miembro.getUsename().equals(username)) {

                return true;
            }

        }

        return false;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
}
