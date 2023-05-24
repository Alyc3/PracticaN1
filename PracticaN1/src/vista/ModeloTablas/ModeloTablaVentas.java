/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.ModeloTablas;

import controlador.ed.lista.ListaEnlazada;
import javax.swing.table.AbstractTableModel;
import modelo.Sucursal;
import modelo.Ventas;

/**
 *
 * @author Edison
 */
public class ModeloTablaVentas extends AbstractTableModel{
    private ListaEnlazada<Ventas> datos = new ListaEnlazada<>();

    public ListaEnlazada<Ventas> getDatos() {
        return datos;
    }

    public void setDatos(ListaEnlazada<Ventas> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0 : return "Mes";
            case 1 : return "Venta Mensual";
            default: return null;
        }
    }
    
    

    @Override
    public Object getValueAt(int i, int i1) {
        Ventas v = null;
        
        switch(i1) {
            case 0: return (v !=null ) ? v.getMes().toString():"NO DEFINIDO";
            case 1: return (v!= null) ? v.getValor():0.0;
            default: return null;
        }
    }

    
    
    
    
    
}
