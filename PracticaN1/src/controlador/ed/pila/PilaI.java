/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.ed.pila;

import controlador.ed.lista.ListaEnlazada;
import controlador.ed.lista.exception.PosicionException;
import controlador.ed.lista.exception.VacioException;
import controlador.ed.lista.exception.exception.TopeException;

/**
 *
 * @author alyce
 */
public class PilaI<E> extends ListaEnlazada<E>{
    private Integer cima;

    public PilaI(Integer cima) {
        this.cima = cima;
    }
    
    public Boolean isFull(){
        return (size()>= cima);
    }
    
    public void push(E info) throws TopeException{
        if (!isFull()) {
            insertarInicio(info);
        }else{
            throw new TopeException();
        }
    }
    
    public E pop() throws VacioException, PosicionException{
        E dato = null;
        if (estaVacia()) {
            throw new VacioException("La pila esta vacia");
        }else{
            return this.delete(0);
        }
    }

    public Integer getCima() {
        return cima;
    }
    
    
}
