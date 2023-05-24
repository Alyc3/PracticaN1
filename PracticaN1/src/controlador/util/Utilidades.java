/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import controlador.ed.lista.exception.PosicionException;
import controlador.ed.lista.exception.VacioException;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import modelo.Sucursal;
import modelo.Ventas;

/**
 *
 * @author alyce
 */
public class Utilidades {
    public static void imprimir(Object[]objs){
        System.out.println("Lista de "+objs.getClass().getSimpleName());
        for (Object o : objs) {
            System.out.println(o.toString());
        }
    }
    public static Double sumarVentas(Sucursal s) throws VacioException, PosicionException{
        if (s.getVentas() != null) {
            Double ventas = 0.0 ;
            for (int i = 0; i < s.getVentas().getSize(); i++) {
                ventas=s.getVentas().get(i).getValor()+ventas;
            }
            return ventas;
        }
        return 0.0;
    }
    
    public static Double mediaVentas(Sucursal s) throws VacioException, PosicionException{
            Double suma = sumarVentas(s) ;
            if (suma == 0 ) {
                return suma;
            }else 
            return suma / (s.getVentas().getSize());
    }
    
    public static <T> void guardarEnJson(T objeto, String rutaArchivo)throws IOException{
        ObjectMapper JSON_MAPPER = new ObjectMapper();
        JSON_MAPPER.enable(SerializationFeature.INDENT_OUTPUT);
        JSON_MAPPER.writeValue(new File(rutaArchivo), objeto);
        
    }
    
    public static <T> T cargarJson(Class<T> claseObjeto, String rutaArchivo)throws  IOException{
        ObjectMapper JSON_MAPPER = new ObjectMapper();
        return JSON_MAPPER.readValue(new File(rutaArchivo), claseObjeto);
        
    }
}
