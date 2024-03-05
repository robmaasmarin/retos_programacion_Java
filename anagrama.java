
/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class anagrama {
	
	static void test(String a, String b) {
		String str1 = a.toLowerCase();
		String str2 = "";
		char ch;
		
		
		for (int i = 0; i < a.length(); i++) {
			ch = str1.charAt(i);
			str2 = ch + str2;
			
			}
		if (str2.equals(b.toLowerCase())) {
			System.out.println("Es un anagrama!");
		}
		else {System.out.println("No es un anagrama!");
		}
		}
		
			
	
	
	public static void main(String[] args) {
		
		anagrama mianagrama = new anagrama();
		mianagrama.test("Cara", "arca");
		mianagrama.test("Nido", "Odin");
		
		mianagrama.test("Lobo", "Odin");
		mianagrama.test("Amor", "Roma");
		
	}

}
