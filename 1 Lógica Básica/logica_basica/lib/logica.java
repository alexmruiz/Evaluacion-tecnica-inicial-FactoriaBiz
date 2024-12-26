import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class logica {

        public static void main(String[] args) {
            
            try (Scanner scanner = new Scanner(System.in)) {
                // Creo la lista de números
                ArrayList<Integer> numeros = new ArrayList<>();
   
                // Pido al usuario que ingrese números
                System.out.print("Introduzca un número y pulse enter, repita el proceso cuantas veces desee (escriba 'fin' para terminar):");
                while (scanner.hasNext()) {
                    // Si es un número lo guardo en la lista
                    if (scanner.hasNextInt()){ 
                        numeros.add(scanner.nextInt());
                    } else {
                        String input = scanner.next();
                        // Si es un texto comparo
                        if (input.equalsIgnoreCase("fin")) {
                            break;
                        } else {
                            System.out.println("Por favor, introduce un número válido o 'fin' para terminar.");
                        }
                    }
                }
   
                // Ordeno la lista en orden ascendente
                Collections.sort(numeros);
   
                // Imprimo la lista ordenada
                System.out.println("Lista ordenada en orden ascendente:");
                for (int numero : numeros) {
                    System.out.print(numero + " ");
                }
            }
        }
    }
    

