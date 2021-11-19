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
public class Pokedex {
    
   private Pokemon pkm1;
   private Pokemon pkm2;
   private Pokemon Pkm3;
   private double Damege;

   public Pokedex() {
    }

    
    
    public Pokedex(Pokemon pkm1, Pokemon pkm2, Pokemon Pkm3) {
        this.pkm1 = pkm1;
        this.pkm2 = pkm2;
        this.Pkm3 = Pkm3;
       this.Damege=setDamge(pkm1,pkm2,Pkm3);
    }

    public Pokemon getPkm1() {
        return pkm1;
    }

    public void setPkm1(Pokemon pkm1) {
        this.pkm1 = pkm1;
    }

    public Pokemon getPkm2() {
        return pkm2;
    }

    public void setPkm2(Pokemon pkm2) {
        this.pkm2 = pkm2;
    }

    public Pokemon getPkm3() {
        return Pkm3;
    }

    public void setPkm3(Pokemon Pkm3) {
        this.Pkm3 = Pkm3;
    }
    
    
    public double setDamge(Pokemon Pkm1,Pokemon Pkm2,Pokemon Pkm3){
    
    int damage1= Pkm1.getDamage();
    int damage2= Pkm2.getDamage();
    int damage3= Pkm3.getDamage();
    
    double promedioDamage = ((damage1+damage2+damage3)/100);
    
    return promedioDamage;
    }
    
}
