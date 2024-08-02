// Este código es como el juego Piedra, Papel o Tijera, el usuario 1 introduce la opción que desea, después el usuario dos introduce otra 
// Si los resultados son iguales aparece "empate" en la consola, si no aparece el ganador, después de esto se cierra el juego  
package com.generation;

import java.util.Scanner; // Importar la clase Scanner para que se lea la entrada del usuario

public class Codigo4 {

   
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();
        
        int g = 0; // 0 para indicar empate
        
        if (j1.equals(j2)) { // Cambié a equals para comparar strings en lugar de ==
            System.out.println("Empate");
        } else {
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break; // Añadí break 
                
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;
                
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                
                default:
                    System.out.println("Entrada no válida");
                    return; // Salir del programa si hay una entrada no válida
            }
            if (g == 0) {
                System.out.println("Gana el jugador 2");
            } else {
                System.out.println("Gana el jugador " + g);
            }
        }
        
        s.close(); // Cerrar el scanner
    }
}