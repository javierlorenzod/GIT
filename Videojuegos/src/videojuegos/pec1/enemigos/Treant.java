/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.pec1.enemigos;

/**
 *
 * @author noesmoral
 */
public class Treant extends Enemigo{

    public Treant(String nombre, int danyo, int vida) {
        super(nombre, danyo, vida);
    }
    
    //METODO 
    public int atacar(){
        return super.getDanyo();
    }
    
    @Override
    public String toString() {
        return "\nNombre: "+super.getNombre()+"\nDaño: "+super.getDanyo()+"\nVida: "+super.getVida();
    }
    
}