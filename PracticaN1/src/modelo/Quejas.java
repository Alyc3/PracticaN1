/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Edison
 */
public class Quejas {
    private String usuario;
    private String quejas;
    private Date fecha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getQuejas() {
        return quejas;
    }

    public void setQuejas(String quejas) {
        this.quejas = quejas;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
      return  usuario +" "+ quejas + " "+ fecha ;
    }
    
    
    
}
