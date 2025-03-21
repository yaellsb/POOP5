/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 * Método principal que inicializa la ejecución del porgrama
 * @author yaelb
 */
public class POOP5 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo = new Circulo();
        circulo.setRadio(2f);
        System.out.println("Perietro = "+circulo.calcularPerimetro());
        System.out.println("Area = "+circulo.calcularArea());
        
        circulo.setRadio(10f);
        System.out.println("Perietro = "+circulo.calcularPerimetro());
        System.out.println("Area = "+circulo.calcularArea());
        
        circulo.setRadio(-33f);
        System.out.println("Perimetro = "+circulo.calcularPerimetro());
        System.out.println("Area = "+circulo.calcularArea());
        
        float a = 3.5f;
        float b = (float) 3.5;
        
       Pokemon poke = new Pokemon();
       poke.setNombre("pikachu");
       poke.setDificultad(5);
       Pokebola pokebola = new Pokebola();
       pokebola.atraparPokemon(poke);
       pokebola.soltarPokemon(poke);
    } 
}
