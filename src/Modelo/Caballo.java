/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author claus
 */
public class Caballo extends Thread{
    
    String nombre;
    JLabel caballo;
    JLabel pista;
    Carrera c;
    JTextArea aR;
    public Caballo(String nombre, JLabel caballo, JLabel pista,Carrera c,JTextArea aR) {
        this.nombre = nombre;
        this.caballo = caballo;
        this.pista = pista;
        this.c =c;
      this.aR=aR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public JLabel getCaballo() {
        return caballo;
    }

    public void setCaballo(JLabel caballo) {
        this.caballo = caballo;
    }

    public JLabel getPista() {
        return pista;
    }

    public void setPista(JLabel pista) {
        this.pista = pista;
    }

    @Override
    public void run(){

            while(true){
            
                int posCaballo = this.caballo.getLocation().x;
                int meta=this.pista.getLocation().x;
            try {
                
                sleep((int)(Math.random()*110));
                caballo.setLocation(posCaballo+((int)(Math.random()*20)),caballo.getLocation().y);
 
                if(posCaballo>=meta){
                    
                    System.out.println(this.nombre+" Llegó a la meta");
                
                    this.aR.append(nombre+"\n");
                    this.stop();
                } 
                
                
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
                
                
            }
    
    }
    
}
