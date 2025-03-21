/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Clase que construye a un objeto pokemon.
 * @author yaelb
 */
public class Pokemon {
    private String color;
    private String nombre;
    private String especie;
    private int dificultad;
    private String size;
    /**
     * Cosntructor vacío de la clase pokemon.
     */
    public Pokemon(){}
    /**
     * Cosntructor que inicializa los atributos de la clase pokemon.
     * @param color
     * @param nombre
     * @param especie
     * @param dificultad
     * @param size 
     */
    public Pokemon(String color, String nombre, String especie, int dificultad, String size) {
        this.color = color;
        this.nombre = nombre;
        this.especie = especie;
        this.dificultad = dificultad;
        this.size = size;
    }
    /**
     * Método que obtiene el color del pokemon.
     * @return String que contiene el color del pokemon
     */
    public String getColor() {
        return color;
    }
    /**
     * Método que modifica el color del pokemon.
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Método que obtiene el nombre del pokemon.
     * @return String que contiene el nombre del pokemon
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que modifica el nombre del pokemon.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que obtiene la especie del pokemon.
     * @return String que contiene la especie del pokemon
     */
    public String getEspecie() {
        return especie;
    }
    /**
     * Método que modifica la especie del pokemon.
     * @param especie [agua, fuego, roca]
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    /**
     * Método que obtiene la dificultad del pokemon.
     * @return Entero con el valor de la dificultad
     */
    public int getDificultad() {
        return dificultad;
    }
    /**
     * Método que modifica la dificultad de la especie.
     * @param dificultad [1-100]
     */
    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    /**
     * Método que obtiene el tamanio del pokemon.
     * @return String con el tamanio
     */
    public String getSize() {
        return size;
    }
    /**
     * Método que modifica el tamanio del pokemon.
     * @param size [grande,chico,mediano]
     */
    public void setSize(String size) {
        this.size = size;
    }
    /**
     * Método que imprime el mensaje para atacar.
     */
    public void atacar() {
        System.out.println("Te voy a atacar");
    }
    /**
     * Método que imprime el mensaje para retirarse.
     */
    public void retirarse() {
        System.out.println("Se retira");
    }
    /**
     * Método que imprime el mensaje para curarse.
     */
    public void curarse() {
        System.out.println("Me voy a curar");
    }
    /**
     * Método que imprime el mensaje para defender.
     */
    public void defender() {
        System.out.println("Me voy a defender");
    }
}
