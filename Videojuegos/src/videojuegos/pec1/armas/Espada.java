/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.pec1.armas;

/**
 *
 * @author Jorge
 */
public class Espada extends Arma{
    
    //ATRIBUTOS
    private int resistencia;

    //CONSTRUCTOR
    public Espada(int resistencia, String nombre, int durabilidad, int ataque, int ataque_magico) {
        super(nombre, durabilidad, ataque, ataque_magico);
        this.resistencia = resistencia;
    }    

    //GETTER & SETTER
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    //METODOS
    @Override
    public void usar(){
        this.resistencia--;
    }
    
    @Override
    public boolean estaDisponible(){
        int restante = this.resistencia;
        return restante != 0;
    }

    @Override
    public String toString() {
        return "Espada{" + "resistencia=" + resistencia + '}';
    }
    
    

    
    
}
