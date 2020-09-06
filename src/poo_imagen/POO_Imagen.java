/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_imagen;

/**
 *
 * @author Noelia
 */
public class POO_Imagen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Archivo fotoPerfil=new Archivo("foto en playa", false, "png");
        fotoPerfil.mostrarInfo();
    }
    
}
