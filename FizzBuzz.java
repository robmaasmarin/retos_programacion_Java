
/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class FizzBuzz {
	
	public static void main(String[] args)
				{
					int x = 1;
					while (x <101) {
						if (x % 5 == 0 && x % 3 == 0) {System.out.println("\nfizzbuzz");}
						else if (x % 3 == 0) {System.out.println("\nfizz");}
						else if (x % 5 == 0) {System.out.println("\nbuzz");}
						
						else {
							System.out.println("\n" + x);
						}
						
						
						
						
						x++;
						
					}
		
		
		
		
				}

}
