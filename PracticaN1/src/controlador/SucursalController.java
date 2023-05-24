/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.ed.lista.ListaEnlazada;
import controlador.ed.lista.exception.PosicionException;
import controlador.ed.lista.exception.VacioException;
import controlador.ed.lista.exception.exception.TopeException;
import controlador.ed.pila.Pila;
import controlador.ed.pila.PilaI;
import controlador.exception.EspacioException;
import javax.swing.JComboBox;
import javax.swing.Timer;
import jdk.nashorn.internal.objects.NativeArray;
import modelo.EnumMes;
import modelo.Quejas;
import modelo.Sucursal;
import modelo.Ventas;

/**
 *
 * @author alyce
 */
public class SucursalController {

    private ListaEnlazada<Sucursal> sucursales;
    private ListaEnlazada<Ventas > ventas;
    private ListaEnlazada<Quejas> queja;
    //private Sucursal[] sucursales;
    private Quejas quejas;
    private Sucursal sucursal;
    private Ventas venta;

    public SucursalController() {
        sucursales = new ListaEnlazada<>();
        ventas = new ListaEnlazada<>();
        queja = new ListaEnlazada<>();
    }

    public ListaEnlazada<Quejas> getQueja() {
        return queja;
    }

    public void setQueja(ListaEnlazada<Quejas> queja) {
        this.queja = queja;
        
    }

    public Quejas getQuejas() {
        return quejas;
    }

    public void setQuejas(Quejas quejas) {
        this.quejas = quejas;
    }
    

    
    public ListaEnlazada<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(ListaEnlazada<Ventas> ventas) {
        if (ventas == null) {
            ventas = new ListaEnlazada<>();
        }
        this.ventas = ventas;
    }

    public ListaEnlazada<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ListaEnlazada<Sucursal> sucursale) {
        this.sucursales = sucursale;
    }

    public Ventas getVenta() {
        return venta;
    }

    public void setVenta(Ventas venta) {
        this.venta = venta;
    }

//    public SucursalControl(ListaEnlazada<Sucursal> sucursale) {
//        this.sucursales = sucursal;
//    }
    public Sucursal getSucursal() {
        if (sucursal == null) {
            sucursal = new Sucursal();
        }
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public boolean registrar() throws EspacioException, VacioException {
       // sucursal.setVentas(new ListaEnlazada<>());
        sucursal.setVentas(ventas);
        for (int i = 0; i < EnumMes.values().length; i++) {
            Ventas venta = new Ventas();
            venta.setId(i + 1);
            venta.setMes(EnumMes.values()[i]);
            venta.setValor(0.0);
            //ventas.insertar(venta);
            sucursal.getVentas().insertar(venta);
        }
        sucursales.insertarInicio(sucursal);
        sucursal.getVentas().imprimir();
        ventas.imprimir();
        //sucursales[pos]= sucursal;

        return true;
    }

    public boolean guardarVentas(Integer posVenta, Double valor) throws EspacioException, VacioException, PosicionException {

//        sucursales[posSucur].getVentas()[posVenta].setValor(valor);
//        return true;
        if (this.sucursal != null) {
            if (posVenta <= this.sucursal.getVentas().getSize() - 1) {
                sucursal.getVentas().get(posVenta).setValor(valor);
            } else {
                throw new EspacioException();
            }

        } else {
            throw new NullPointerException("Se debe elegir una sucursal");
        }
        return true;

    }

    public boolean calcularPromedio(Double totalVentas, Enum enumMes) {
        if (totalVentas == null) {
            System.out.println("El total de ventas es cero");

        }

        return true;
    }
    
    public void agregarQueja(Pila pila,String queja) throws TopeException {
      pila.push(queja);
    }

    public String eliminarQueja(Pila pila) throws VacioException, PosicionException {
        return (String) pila.pop();
    }

    public static JComboBox cargarComboTipo(JComboBox cbx) {
        cbx.removeAllItems();
        for (EnumMes tipo : EnumMes.values()) {
            cbx.addItem(tipo);
        }
        return cbx;
    }

}
