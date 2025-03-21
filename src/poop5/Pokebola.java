/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

import java.util.Random;

/**
 * Clase que construye a un objeto pokebola. 
 * @author yaelb
 */
public class Pokebola {
    private String tipo;
    private float ratioCaptura;
    private Pokemon pokemon = null;
    /**
     * Constructor vacío de la clase pokebola.
     */
    public Pokebola() {}
    /**
     * Constructor que inicializa los atributos de la clase pokebola.
     * @param tipo
     * @param ratioCaptura
     * @param pokemon 
     */
    public Pokebola(String tipo, float ratioCaptura, Pokemon pokemon) {
        this.tipo = tipo;
        this.ratioCaptura = ratioCaptura;
        this.pokemon = pokemon;
    }
    /**
     * Método que obtiene el tipo de pokemon.
     * @return String que contiene el tipo de pokemon.
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Método que modifica el tipo de pokemon.
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Método que obtiene el ratio de captura del pokemon.
     * @return float que contiene el valor del ratio de captura
     */
    public float getRatioCaptura() {
        return ratioCaptura;
    }
    /**
     * Método que modifica el ratio de captura del pokemon.
     * @param ratioCaptura 
     */
    public void setRatioCaptura(float ratioCaptura) {
        this.ratioCaptura = ratioCaptura;
    }
    /**
     * Método que obtiene el pokemon.
     * @return objeto de tipo Pokemon
     */
    public Pokemon getPokemon() {
        return pokemon;
    }
    /**
     * Método que modifica el pokemon.
     * @param pokemon 
     */
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    /**
     * Método que indica si se pudo atrapar al pokemon.
     * @param pokemon 
     */
    public void atraparPokemon(Pokemon pokemon) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(pokemon.getDificultad());
        if (numeroAleatorio <= ratioCaptura) {
            this.pokemon = pokemon;
            System.out.println("Se atrapo a "+ pokemon.getNombre());
        } else {
            System.out.println("No se atrapo a "+pokemon.getNombre());
        }
    }
    /**
     * Método que indica si se solto a un pokemon.
     * @param pokemon 
     */
    public void soltarPokemon(Pokemon pokemon) {
        if (pokemon != null) {
            System.out.println("Se solto el Pokemon " + pokemon.getNombre());
            pokemon = null; // La Pokébola queda vacía
        } else {
            System.out.println("No hay ningun Pokemon en la Pokebola.");
        }
    }   
}
