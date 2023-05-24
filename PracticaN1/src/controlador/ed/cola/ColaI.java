/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.ed.cola;
import controlador.ed.lista.ListaEnlazada;
import controlador.ed.lista.exception.PosicionException;
import controlador.ed.lista.exception.VacioException;
import controlador.ed.lista.exception.exception.TopeException;

/**
 *
 * @author alyce
 */
public class ColaI <E> extends ListaEnlazada<E>{
    private Integer tope;

    public ColaI(Integer tope) {
        this.tope = tope;
    }
    
    public Boolean isFull(){
        return (size()>= tope);
    }
    
    public void queue(E dato) throws TopeException{
        if (isFull()) 
            throw new TopeException("Cola sin espacio");
            
        else this.insertar(dato);
        
    }
    
    public E dequeue() throws VacioException,PosicionException{
        E dato = null;
        if (estaVacia()) {
            throw new VacioException("Cola vacia");
        }else{
            return this.delete(0);
        }
    }

    public Integer getTope() {
        return tope;
    }
    
    
    
    
}
