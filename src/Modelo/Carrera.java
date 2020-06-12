/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author claus
 */
public class Carrera {
    
    public Caballo hPalomo,hRocinante,hTormenta,hTornado;
    public int inicio;

    
    public Carrera(Caballo hPalomo, Caballo hRocinante, Caballo hTormenta, Caballo hTornado, int inicio) {
    this.hPalomo = hPalomo;
    this.hRocinante = hRocinante;
    this.hTormenta = hTormenta;
    this.hTornado = hTornado;
    this.inicio=inicio;
    

    }

    public Carrera() {
    }

   
    
    public void iniciar() {
        
        hPalomo.start();      
        hRocinante.start();       
        hTormenta.start();
        hTornado.start();
        
    }

    public void reiniciar() {
        hPalomo.caballo.setLocation(inicio,hPalomo.caballo.getLocation().y);
        hRocinante.caballo.setLocation(inicio,hRocinante.caballo.getLocation().y);
        hTormenta.caballo.setLocation(inicio,hTormenta.caballo.getLocation().y);
        hTornado.caballo.setLocation(inicio,hTornado.caballo.getLocation().y);
    }
    
}
