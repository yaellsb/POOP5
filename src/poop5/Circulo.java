/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Clase que construye a un objeto círculo.
 * @author yaelb
 */
public class Circulo {
    private float radio;
    final float PI = (float) Math.PI;
    /**
     * Constructor vacío de la clase círculo.
     */
    public Circulo() {}
    /**
     * Constructor que inicializa todos los atributos de la clase círuclo.
     * @param radio 
     */
    public Circulo(float radio) {
        this.radio = radio;
    }
    /**
     * Método que modifica el valor del radio.
     * @param radio
     */
    public void setRadio(float radio) {
        this.radio = Math.abs(radio);
    }
    /**
     * Método que obtiene el valor del radio.
     * @return float que cobtiene el valor del radio
     */
    public float getRadio() {
        return radio;
    }
    /**
     * Método que calcula el perímetro del círculo.
     */
    public float calcularPerimetro() {
        return(2*PI*radio);
    }
    /**
     * Método que calcula el área del círculo
     */
    public float calcularArea() {
        return(float) (PI*Math.pow(radio, 2));
    }
}
