/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.SucursalController;

/**
 *
 * @author alyce
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SucursalController su=new SucursalController();
        su.getSucursal().setNombre("mi vaina");
        try {
            su.registrar();
            su.registrar();
            su.registrar();
            su.guardarVentas(2, 25.0);
            su.guardarVentas(1, 25.0);
            su.guardarVentas(0, 25.0);
            su.guardarVentas(3, 25.0);
            for (int i = 0; i < su.getSucursales().get(0).getVentas().getSize(); i++) {
                System.out.println(su.getSucursales().get(0).getVentas().get(i)+"");
            }
            
            su.getSucursales().imprimir();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
    }
    
}
