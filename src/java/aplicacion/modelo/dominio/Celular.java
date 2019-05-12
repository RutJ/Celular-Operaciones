
package aplicacion.modelo.dominio;

import aplicacion.modelo.util.ListaCalculos;;
import java.io.Serializable;
import java.util.List;

/**
 * Clase 
 * @author Full Stackers
 */
public class Celular implements Serializable{
    /**
     *nombre de la  marca del objeto celular
     */
    private String marca;
    /**
     * nombre del modelo del objeto celular
     */
    private String modelo;
    /**
     * lista con los calculos que realiza el objeto celular
     */
    private ListaCalculos lista; 
    //Etc
    /**
     * Constructor sin parametros
     * se instancia el atributo lista
     */
    public Celular() {
        lista=new ListaCalculos();
    }
    /**
     * constructor con parametros
     * @param marca valor incial de la marca que tendra el objeto celular 
     * @param modelo valor inicial del modelo que tendra el objeto celular
     */
    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    /**
     * metodo tostring de la clase celular
     * @return retorna una cadena representativa dde la clase Celular
     */
    
    @Override
    public String toString() {
        return "Celular{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    /**
     * metodo que obtendra una lista de valores que son los divisores del valor
     * @param n valor de cual se buscaran sus divisores
     * @return se retornara la lista de divisores
     */
    public List obtenerListaDivisores(int n){
        return lista.obtenerDivisores(n);
    }
    /**
     * metodo que obtendra una lista con valores solo de tipo Multiplicación
     * @param n valor del cual se mostrara su tabla de multiplicar
     * @return se retornora una lista con los resultados de las multiplicaciones
     */
    public List<Multiplicacion> obtenerTablaMultiplicar(int n){
        return lista.obtenerMultiplicaciones(n);
    }
    /**
     * metodo que obtendra una lista con los valores pares entre dos numeros
     * @param n1 es la cota inferior
     * @param n2 es la cota superior
     * @return retorna la lista con los valores pares obtenidos
     */
    public List obtenerListaEntreCotas(int n1, int n2){
        return lista.obtenerListaNumerosEntreCotas(n1, n2);
    }
    /**
     * metodo con el cual se obtendra el coseno de un angulo
     * @param num es el valor del cual se obtendra su coseno 
     * @return retorna el resultado de tipo double
     */
    public double obtenerCosenoDeUnNumero(float num){
        return lista.obtenerCoseno(num);
    }
    
    //GETTER Y SETTER
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ListaCalculos getLista() {
        return lista;
    }

    public void setLista(ListaCalculos lista) {
        this.lista = lista;
    }
    
    
    
}
