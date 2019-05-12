/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import aplicacion.modelo.dominio.Multiplicacion;
/**
 *Clase que contendra las operaciones utilizadas en el proyecto 
 * @author Full Stackers
 */
public class ListaCalculos implements Serializable {

    private List listaDatos;
    private List<Multiplicacion> listaTablaMultiplicacion;
    /**
     * constructor sin parametros 
     * se instancia ambas listas 
     */
    public ListaCalculos() {
        listaDatos = new ArrayList();
        listaTablaMultiplicacion = new ArrayList<>();

    }
    /**
     * constructor parametrizado
     * @param lista valor inicial de la lista
     * @param listaTablaMultiplicacion valor inicial de la lista con los resultados de la multiplicación
     */
    public ListaCalculos(List lista, List<Multiplicacion> listaTablaMultiplicacion) {
        this.listaDatos = lista;
        this.listaTablaMultiplicacion = listaTablaMultiplicacion;
    }

    /**
     * Metodo que guarda los divisores de un numero en una lista
     * @param n valor del cual obtendremos sus divisores
     * @return la lista con los divisores
     */
    public List obtenerDivisores(int n) {
        listaDatos.clear();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                listaDatos.add(i);
            }
        }
        return listaDatos;
    }
    /**
     * metodo en el que se agrega los primeros 100 resultados de la multiplicacion en una lista 
     * @param n el numero del cual se obtendra la tabla
     * @return retorna los 100 resultados obtenidos
     */
    public List<Multiplicacion> obtenerMultiplicaciones(int n) {
        listaTablaMultiplicacion.clear();
        for (int i = 1; i <= 100; i++) {
            int resultado = n * i;
            listaTablaMultiplicacion.add(new Multiplicacion(n, i, resultado));
        }
        return listaTablaMultiplicacion;
    }
    /**
     * metodo al cual se agregan los valores pares entre dos cotas 
     * @param n1 cota inferior 
     * @param n2 cota superior
     * @return retorna 
     */
    public List obtenerListaNumerosEntreCotas(int n1, int n2) {
        listaDatos.clear();
        for (int i = n1 + 1; i <= n2 - 1; i++) {
            if (i % 2 == 0) {
                listaDatos.add(i);
            }
        }
        return listaDatos;
    }
    /**
     * metodo para obtener el factorial de un numero
     * @param n valor del cual se obtendra su factorial
     * @return 
     */
    public int factorial(int n){
           if(n<1)
                return 1;
           else
                return n*factorial(n-1);
        }
    /**
     * metodo que obtine el coseno de un valor 
     * @param num  valor que se convertira a radianes 
     * @return 
     */
    public double obtenerCoseno (float num){
        num*=3.141592/180;
            double coseno=0;
            int exponente=0;
            for(int i=0;i<10;i+=2){
                coseno+=Math.pow(-1,exponente)*(Math.pow(num,i)/factorial(i));
                exponente++;
            }
            return coseno;
    }
    // GETTER AND SETTER
    public void setLista(List lista) {
        this.listaDatos = lista;
    }

    public List getLista() {
        return listaDatos;
    }

    public List<Multiplicacion> getListaTablaMultiplicacion() {
        return listaTablaMultiplicacion;
    }

    public void setListaTablaMultiplicacion(List<Multiplicacion> listaTablaMultiplicacion) {
        this.listaTablaMultiplicacion = listaTablaMultiplicacion;
    }

}
