/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.ModeloTablas;

import controlador.ed.lista.ListaEnlazada;
import javax.swing.table.AbstractTableModel;
import modelo.Quejas;
import modelo.Ventas;

/**
 *
 * @author Edison
 */
public class ModeloTablaQuejas extends AbstractTableModel{
    private ListaEnlazada<Quejas> queja = new ListaEnlazada<>();

    public ListaEnlazada<Quejas> getQueja() {
        return queja;
    }

    public void setQueja(ListaEnlazada<Quejas> queja) {
        this.queja = queja;
    }

    @Override
    public int getRowCount() {
        return queja.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0 : return "Nombre Usuario";
            case 1 : return "Queja";
            case 2 : return "Fecha";
            default: return null;
        }
    }
    
    

    @Override
    public Object getValueAt(int i, int i1) {
        Quejas v = null;
        
        switch(i1) {
            case 0: return (v !=null ) ? v.getUsuario().toString(): "No definido";
            case 1: return(v !=null) ? v.getQuejas().toString(): "NO HAY QUEJAS";
            case 2: return (v!= null) ? v.getFecha().getTime():"NO DEFINIDO";
            default: return null;
        }
    }
    
}
