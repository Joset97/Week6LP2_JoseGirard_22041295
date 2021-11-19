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
    private ArrayList <Usuarios> Miembros;
    private Date FechaDecracion;
    private Usuarios Lider= new Usuarios();
    private String Tipo; 

    public PokeGrupo(String nombre,String Tipo, Usuarios Lider) {
        this.nombre = nombre;
        this.Miembros =new ArrayList();
        this.FechaDecracion =new Date();
        this.Lider = Lider;   
        this.Tipo = Tipo;
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

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
