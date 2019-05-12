package aplicacion.modelo.dominio;

/**
 *El objeto multiplicacion nos permite en la pagina separar por segmentos los componentes de una multiplicación
 * @author Full Stackers 
 */
public class Multiplicacion {
    /**
     * primer factor del priducto
     */
    private int multiplicando;
    /**
     * segundo factor del producto
     */
    private int multiplicador;
    /**
     * resultado del producto
     */
    private int resultado;
    /**
     * Constructor sin parametros
     */
    public Multiplicacion() {
    }
    /**
     * Constructor parametrizado
     * @param multiplicando el primer factor de la multiplicación
     * @param multiplicador el segundo factor de la multiplicación
     * @param resultado el resuntado de la multiplicación
     */
    public Multiplicacion(int multiplicando, int multiplicador, int resultado) {
        this.multiplicando = multiplicando;
        this.multiplicador = multiplicador;
        this.resultado = resultado;
    }
    // SETTER AND GETTER
    /**
     * @return the multiplicando
     */
    public int getMultiplicando() {
        return multiplicando;
    }

    /**
     * @param multiplicando the multiplicando to set
     */
    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }

    /**
     * @return the multiplicador
     */
    public int getMultiplicador() {
        return multiplicador;
    }

    /**
     * @param multiplicador the multiplicador to set
     */
    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
}
