import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class logica {

        public static void main(String[] args) {
            
            try (Scanner scanner = new Scanner(System.in)) {
                //Se crea la lista de números
                ArrayList<Integer> numeros = new ArrayList<>();
   
                //Le pido al usuario que ingrese números
                System.out.println("Introduce números (escribe 'fin' para terminar):");
                while (scanner.hasNext()) {
                    if (scanner.hasNextInt()) {
                        numeros.add(scanner.nextInt());
                    } else {
                        var input = scanner.next().strip().toLowerCase();
                        //Si el usuario introduce texto comparo la cadena
                        if (input.equals("fin")) {
                            break;
                        } else {
                            System.out.println("Por favor, introduce un número válido o 'fin' para terminar.");
                        }
                    }
                }
   
                //Ordeno la lista en orden ascendente
                Collections.sort(numeros);

                //Imprimo la lista ordenada
                System.out.println("Lista ordenada en orden ascendente:");
                for (int numero : numeros) {
                    System.out.print(numero + " ");
                }
            }
        }
    }
    

