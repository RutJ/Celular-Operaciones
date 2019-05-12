/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Celular;
import aplicacion.modelo.dominio.Multiplicacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Fernando
 */
@ManagedBean
@ViewScoped
public class CelularFormBean implements Serializable{
    /**
     * atributo de tipo celular
     */
    private Celular celular;
    private int valor1;
    private int valor2;
    private float valor3;
   
    private float resultado;

    /**
     * Constructor sin parametros
     * Se instancia un atributo de tipo Celular
     */
    public CelularFormBean() {
        celular=new Celular();
    }
    /**
     * constructor parametrizado
     * @param celular valor inicial para el objeto celular
     * @param valor1 
     * @param valor2
     * @param valor3
     * @param resultado 
     */
    public CelularFormBean(Celular celular, int valor1, int valor2, float valor3, float resultado) {
        this.celular = celular;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
        this.resultado = resultado;
    }
    /**
     * metodo que que define si el segundo valor es mayor que el primer valor
     * @return retornara un valor buleano
     */
   public boolean esMayor() { 
       return valor2 > valor1;
   }
   /**
    * metodo que verifica que un valor sea mayor que 0
    * @return retornara un valor buleano
    */
   public boolean esEnteroPositivo(){
       return valor1 > 0;
   }
   /**
    * metodo que valida si el segundo valor es mayor que el primero ya que la cota superior no debe ser menor a la cota inferior
    * @param fc
    * @param uic
    * @param obj 
    */
   public void validarCotas(FacesContext fc, UIComponent uic, Object obj){
       if (esMayor() != true){
           FacesContext facescontext = FacesContext.getCurrentInstance();
           facescontext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "ERROR EN EL INGRESO", "La cota superior debe ser mayor que la cota inferior"));
           setValor2(0);
       }
   }
   /**
    * metodo para validar que el numero ingresado sea un numero positivo 
    * @param fc
    * @param uic
    * @param obj 
    */
   public void validarEntero(FacesContext fc, UIComponent uic, Object obj){
       if (esEnteroPositivo() != true){
           FacesContext facescontext = FacesContext.getCurrentInstance();
           facescontext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "ERROR EN EL INGRESO", "Se deben ingresar números enteros positivos"));
           setValor1(0);
       }
   }
   /**
    * metodo para obtener una lista de divisores de un valor determinado
    * @return retorna una lista con los divisores obtenidos de valor1 
    */
    public List obtenerListaDivisores(){
        return celular.obtenerListaDivisores(valor1);
        
    }
    /**
     * metodo que obtiene solo una lista con objetos de tipo Multiplicacion 
     * @return retorna una lista con los resultados obtenidos del valor1
     */
    public List<Multiplicacion> obtenerTablaDeMultiplicacion(){
        return celular.obtenerTablaMultiplicar(valor1);
        
    }
    /**
     * metodo que obtiene una lista de valores entre dos cotas usando metodos del objeto celular
     * @return retorna la lista entre valor1, valor2
     */
    public List obtenerNumerosCotas(){
        return celular.obtenerListaEntreCotas(valor1, valor2);
        
    }
    /**
     * Metodo que obtiene el coseno de un numero usando los calculos que realiza el objeto celular
     * @return retornara el coseno de valor3
     */
    public double obtenerCosenoNumero(){
        return celular.obtenerCosenoDeUnNumero(valor3);
    }
    //GETTER AND SETTER
    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public float getValor3() {
        return valor3;
    }

    public void setValor3(float valor3) {
        this.valor3 = valor3;
    }
    
}
