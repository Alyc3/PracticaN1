/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.ed.cola;

import controlador.ed.lista.exception.PosicionException;
import controlador.ed.lista.exception.VacioException;
import controlador.ed.lista.exception.exception.TopeException;

/**
 *
 * @author alyce
 */
public class Cola<E> {
    private ColaI<E> cola;
    
    public Cola(Integer tope){
        cola = new ColaI(tope);
    }
    
    public void queue(E obj) throws TopeException {
        cola.queue(obj);
    }
    public E dequeu() throws VacioException, PosicionException{
        return cola.dequeue();
    }
    
    public Integer getTope(){
        return cola.getTope();
    }
    
    public void print() throws VacioException{
        cola.imprimir();
    }
}
