/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastel;


/**
 *
 * @author Lucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pastel d = new Pastel.PastelBuilder("Vanilla","Familiar").porciones(12).tipo("Loli").precio(29.95).build();
        System.out.println(d.toString());
    }


    
}
