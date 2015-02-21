/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos.pec1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jorge
 */
public class JuegazoPapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Arco arco1 = new Arco("Arco1", 10, 5);
        Espada espada1 = new Espada("Espada1", 10, 5);
        Baston baston1 = new Baston("Baston1", 10, 5);
        
        Kender personaje1 = new Kender("Personaje1", 100, 10, arco1, 2);
        Nigromante personaje2 = new Nigromante("Personaje2", 100, 10, baston1, 2);
        
        ArrayList<Personaje> luchadores = new ArrayList<Personaje>();
        luchadores.add(personaje1);
        luchadores.add(personaje2);
        
        
        System.out.println("¡¡COMBATE!!");
        personaje1.combatir(luchadores);        
        
        System.out.println("¡¡RESULTADO DEL COMBATE!!");
        System.out.println("Personaje 1:");
        System.out.println(personaje1.toString());
        System.out.println(personaje1.getArma().toString());
        System.out.println("\nPersonaje 2:");
        System.out.println(personaje2.toString());
        System.out.println(personaje2.getArma().toString());
        
        /* //pruebas
        Troll troll=new Troll("Escojondrio", 5, 35);
        Treant treant=new Treant("tronco", 10, 50);
        Shadow shadow=new Shadow("Transparente", 15, 75);
        Kraken kraken=new Kraken("Tentacruel", 20, 130);
        
        ArrayList<Enemigo> enemigo = new ArrayList<Enemigo>();
        enemigo.add(troll);
        enemigo.add(treant);
        enemigo.add(treant);
        enemigo.add(kraken);
        
        System.out.print(troll.toString());
        System.out.print(treant.toString());
        System.out.print(shadow.toString());
        System.out.print(kraken.toString());
        */
        
        /*
        Kraken kraken=new Kraken("Tentacruel", 20, 130);
        
        for (int i = 0; i < 30; i++) {
            System.out.println(kraken.atacar());
        }
        */
        
        
       
    }
    
}
